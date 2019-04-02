package naturix.divinerpg.enums;

import java.util.Locale;

import net.minecraft.block.material.MapColor;
import net.minecraft.util.IStringSerializable;

public enum WoodVariant implements IStringSerializable {

    DIVINE("divine", MapColor.EMERALD, 2), FROZEN("frozen", MapColor.ICE, 6), EDEN("eden", MapColor.SAND, 8), WILDWOOD(
            "wildwood", MapColor.WATER, 8), APALACHIA("apalachia", MapColor.PINK, 8), SKYTHERN("skythern",
                    MapColor.WHITE_STAINED_HARDENED_CLAY, 8), MORTUM("mortum", MapColor.BROWN, 8);

    private final String name;
    private final MapColor mapColor;
    private final float hardness;

    WoodVariant(String name, MapColor mapColor, float hardness) {
        this.name = name;
        this.mapColor = mapColor;
        this.hardness = hardness;
    }

    @Override
    public String getName() {
        return name().toLowerCase(Locale.ROOT);
    }

    public MapColor getMapColor() {
        return mapColor;
    }

    public float getHardness() {
        return hardness;
    }
}