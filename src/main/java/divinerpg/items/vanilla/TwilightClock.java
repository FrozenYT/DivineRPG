package divinerpg.items.vanilla;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockPattern;
import net.minecraft.block.pattern.BlockPatternBuilder;
import net.minecraft.block.pattern.BlockStateMatcher;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.CachedBlockInfo;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.HashMap;

public class TwilightClock extends Item {

    private final HashMap<Block, Block> netherLikePortals = new HashMap<>();

    public TwilightClock(Properties properties) {
        super(properties);

        // TODO add actual portals
        netherLikePortals.put(Blocks.OBSIDIAN, Blocks.NETHER_PORTAL);
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        if (super.onItemUse(context) == ActionResultType.FAIL)
            return ActionResultType.FAIL;

        World world = context.getWorld();
        BlockPos pos = context.getPos();
        Block frame = world.getBlockState(pos).getBlock();

        if (netherLikePortals.containsKey(frame)
                && isWithinFrame(world, pos, Direction.UP, 4)
                && tryCreateNetherLikePortal(world, pos, frame, netherLikePortals.get(frame))) {
            return ActionResultType.SUCCESS;
        }

        return ActionResultType.PASS;
    }

    /**
     * Check if we clicked on bottom of the frame
     *
     * @param world        - world
     * @param pos          - clicked position
     * @param face         - player sight direction
     * @param portalHeight - portal frame height
     * @return - if we clicked inside portal
     */
    private boolean isWithinFrame(World world, BlockPos pos, Direction face, int portalHeight) {
        Block frame = world.getBlockState(pos).getBlock();

        // Must click within frame
        if (!world.isAirBlock(pos.offset(face))) {
            return false;
        }

        for (int i = 1; i <= portalHeight; i++) {
            if (world.getBlockState(pos.offset(face, i)).getBlock() == frame) {
                return true;
            }
        }

        return false;
    }

    private boolean tryCreateNetherLikePortal(World world, BlockPos pos, Block frame, Block portal) {
        BlockPattern portalShape = BlockPatternBuilder.start()
                .aisle("?xx?")
                .aisle("x..x")
                .aisle("x..x")
                .aisle("x..x")
                .aisle("?xx?")
                .where('?', CachedBlockInfo.hasState(BlockStateMatcher.ANY))
                .where('x', CachedBlockInfo.hasState(BlockStateMatcher.forBlock(frame)))
                .where('.', CachedBlockInfo.hasState(BlockStateMatcher.forBlock(Blocks.AIR)))
                .build();

        // Pretty heavy function, think about it
        BlockPattern.PatternHelper match = portalShape.match(world, pos);
        if (match == null)
            return false;

        Direction rightDir = match.getUp().rotateYCCW();
        Direction downDir = match.getForwards();

        ArrayList<BlockPos> airBlocks = new ArrayList<>();

        // width
        for (int i = 0; i < 2; i++) {
            // height
            for (int z = 0; z < 3; z++) {
                BlockPos portalPlace = match.getFrontTopLeft()
                        // need to add 1 block offset because it is frame
                        .offset(rightDir, i + 1)
                        .offset(downDir, z + 1);

                airBlocks.add(portalPlace);
            }
        }

        airBlocks.forEach(x -> world.setBlockState(x, portal.getDefaultState()));

        return true;
    }
}