package divinerpg.objects.blocks.arcana;

import divinerpg.config.Config;
import divinerpg.enums.EnumBlockType;
import divinerpg.objects.blocks.BlockMod;
import divinerpg.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockPattern;
import net.minecraft.block.state.pattern.BlockStateMatcher;
import net.minecraft.block.state.pattern.FactoryBlockPattern;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;

import com.google.common.base.Predicates;

import java.util.List;

public class BlockArcanaPortalFrame extends BlockMod {
    public static final PropertyDirection FACING = BlockHorizontal.FACING;
    protected static final AxisAlignedBB AABB_BLOCK = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.8125D, 1.0D);

    protected Block portal;

    public BlockArcanaPortalFrame(String name, Block portal) {
        super(EnumBlockType.ROCK, name, 5.0F);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        this.portal = portal;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return AABB_BLOCK;
    }

    @Override
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox,
            List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_BLOCK);
    }

    @Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY,
            float hitZ, int meta, EntityLivingBase placer) {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta & 3));
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(FACING).getHorizontalIndex();
    }

    @Override
    public IBlockState withRotation(IBlockState state, Rotation rot) {
        return state.withProperty(FACING, rot.rotate(state.getValue(FACING)));
    }

    @Override
    public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
        return state.withRotation(mirrorIn.toRotation(state.getValue(FACING)));
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, FACING);
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
        return face == EnumFacing.DOWN ? BlockFaceShape.SOLID : BlockFaceShape.UNDEFINED;
    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        worldIn.notifyNeighborsOfStateChange(pos, this, false);
        super.breakBlock(worldIn, pos, state);
    }
    private static BlockPattern portalShape;

    public static BlockPattern getOrCreatePortalShape()
    {
        if (portalShape == null)
        {
            portalShape = FactoryBlockPattern.start().aisle("?vvv?", ">???<", ">???<", ">???<", "?^^^?").where('?', BlockWorldState.hasState(BlockStateMatcher.ANY)).where('^', BlockWorldState.hasState(BlockStateMatcher.forBlock(ModBlocks.arcanaPortalFrame).where(FACING, Predicates.equalTo(EnumFacing.WEST)))).where('>', BlockWorldState.hasState(BlockStateMatcher.forBlock(ModBlocks.arcanaPortalFrame).where(FACING, Predicates.equalTo(EnumFacing.WEST)))).where('v', BlockWorldState.hasState(BlockStateMatcher.forBlock(ModBlocks.arcanaPortalFrame).where(FACING, Predicates.equalTo(EnumFacing.WEST)))).where('<', BlockWorldState.hasState(BlockStateMatcher.forBlock(ModBlocks.arcanaPortalFrame).where(FACING, Predicates.equalTo(EnumFacing.WEST)))).build();
        }

        return portalShape;
    }
    
    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
    {
    	IBlockState iblockstate = worldIn.getBlockState(pos);
        ItemStack itemstack = stack;


        BlockPattern.PatternHelper blockpattern$patternhelper = this.getOrCreatePortalShape().match(worldIn, pos);
                if (blockpattern$patternhelper != null)
                {
                    BlockPos blockpos = blockpattern$patternhelper.getFrontTopLeft().add(-3, 0, -3);

                    for (int j = 0; j < 3; ++j)
                    {
                        for (int k = 0; k < 3; ++k)
                        {
                        	//TODO make sure player is in center of portal frame before spawning portal frame
                            worldIn.setBlockState(blockpos.add(j, 0, k), ModBlocks.arcanaPortal.getDefaultState(), 2);
                        }
                    }

                }
    }
}