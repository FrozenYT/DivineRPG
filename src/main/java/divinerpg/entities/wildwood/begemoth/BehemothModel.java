package divinerpg.entities.wildwood.begemoth;

import divinerpg.entities.base.render.DivineModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class BehemothModel extends DivineModel<Behemoth> {
    ModelRenderer Eye;
    ModelRenderer Part1;
    ModelRenderer Part2;
    ModelRenderer Part3;
    ModelRenderer Part4;
    ModelRenderer Part5;
    ModelRenderer Part6;
    ModelRenderer Part7;
    ModelRenderer Part8;
    ModelRenderer Part9;
    ModelRenderer Tailp3;
    ModelRenderer Tailp4;
    ModelRenderer LegL3;
    ModelRenderer LegL4;
    ModelRenderer LegL5;
    ModelRenderer LegL6;
    ModelRenderer LegL10;
    ModelRenderer box1;
    ModelRenderer LegL12;
    ModelRenderer LegL13;
    ModelRenderer LegL14;
    ModelRenderer LegLF18;
    ModelRenderer LegR3;
    ModelRenderer LegR4;
    ModelRenderer LegR5;
    ModelRenderer LegR7;
    ModelRenderer LegR9;
    ModelRenderer LegR10;
    ModelRenderer LegR12;
    ModelRenderer LegR13;
    ModelRenderer LegR14;
    ModelRenderer LegR15;
    ModelRenderer LegLF1;
    ModelRenderer LegLF2;
    ModelRenderer LegLF3;
    ModelRenderer LegLF4;
    ModelRenderer LegLF7;
    ModelRenderer LegLF8;
    ModelRenderer LegLF9;
    ModelRenderer LegLF14;
    ModelRenderer LegLF16;
    ModelRenderer LegL18;
    ModelRenderer LegRF5;
    ModelRenderer LegRF6;
    ModelRenderer LegRF7;
    ModelRenderer LegRF9;
    ModelRenderer LegRF10;
    ModelRenderer LegRF12;
    ModelRenderer LegRF13;
    ModelRenderer LegRF15;
    ModelRenderer LegRF16;
    ModelRenderer Box2;
    ModelRenderer Body1;
    ModelRenderer Body2;
    ModelRenderer Body3;
    ModelRenderer Body4;
    ModelRenderer Body5;
    ModelRenderer Leg19;
    ModelRenderer LegL15;

    public BehemothModel() {
        textureWidth = 64;
        textureHeight = 32;

        Eye = new ModelRenderer(this, 0, 0);
        Eye.func_228300_a_(-3F, -3F, -2F, 14, 14, 8);
        Eye.setRotationPoint(-4F, 9F, -7F);
        Eye.setTextureSize(64, 32);
        Eye.mirror = true;
        setRotation(Eye, 0F, 0F, 0F);
        Part1 = new ModelRenderer(this, 44, 0);
        Part1.func_228300_a_(-4F, -2F, -3F, 5, 9, 5);
        Part1.setRotationPoint(5F, 16F, 10F);
        Part1.setTextureSize(64, 32);
        Part1.mirror = true;
        setRotation(Part1, 1.570796F, 0F, 0F);
        Part2 = new ModelRenderer(this, 44, 0);
        Part2.func_228300_a_(-4F, -2F, -3F, 5, 9, 5);
        Part2.setRotationPoint(-2F, 16F, 10F);
        Part2.setTextureSize(64, 32);
        Part2.mirror = true;
        setRotation(Part2, 1.570796F, 0F, 0F);
        Part3 = new ModelRenderer(this, 44, 0);
        Part3.func_228300_a_(-4F, -2F, -3F, 5, 9, 5);
        Part3.setRotationPoint(5F, 9F, 10F);
        Part3.setTextureSize(64, 32);
        Part3.mirror = true;
        setRotation(Part3, 1.570796F, 0F, 0F);
        Part4 = new ModelRenderer(this, 20, 22);
        Part4.func_228300_a_(-4F, -2F, -3F, 5, 4, 6);
        Part4.setRotationPoint(2F, 13F, 19F);
        Part4.setTextureSize(64, 32);
        Part4.mirror = true;
        setRotation(Part4, 1.570796F, 0F, 0F);
        Part5 = new ModelRenderer(this, 0, 0);
        Part5.func_228300_a_(-6F, 4F, -3F, 2, 6, 2);
        Part5.setRotationPoint(5F, 7F, 6F);
        Part5.setTextureSize(64, 32);
        Part5.mirror = true;
        setRotation(Part5, -0.7853982F, 0F, 0F);
        Part6 = new ModelRenderer(this, 44, 0);
        Part6.func_228300_a_(-4F, -2F, -3F, 5, 9, 5);
        Part6.setRotationPoint(5F, 16F, 1F);
        Part6.setTextureSize(64, 32);
        Part6.mirror = true;
        setRotation(Part6, 1.570796F, 0F, 0F);
        Part7 = new ModelRenderer(this, 44, 0);
        Part7.func_228300_a_(-4F, -2F, -3F, 5, 9, 5);
        Part7.setRotationPoint(-2F, 16F, 1F);
        Part7.setTextureSize(64, 32);
        Part7.mirror = true;
        setRotation(Part7, 1.570796F, 0F, 0F);
        Part8 = new ModelRenderer(this, 44, 0);
        Part8.func_228300_a_(-4F, -2F, -3F, 5, 9, 5);
        Part8.setRotationPoint(-2F, 9F, 1F);
        Part8.setTextureSize(64, 32);
        Part8.mirror = true;
        setRotation(Part8, 1.570796F, 0F, 0F);
        Part9 = new ModelRenderer(this, 44, 0);
        Part9.func_228300_a_(-4F, -2F, -3F, 5, 9, 5);
        Part9.setRotationPoint(-2F, 9F, 10F);
        Part9.setTextureSize(64, 32);
        Part9.mirror = true;
        setRotation(Part9, 1.570796F, 0F, 0F);
        Tailp3 = new ModelRenderer(this, 9, 22);
        Tailp3.func_228300_a_(-1F, 0F, -1F, 2, 8, 2);
        Tailp3.setRotationPoint(0.5F, 12F, 20F);
        Tailp3.setTextureSize(64, 32);
        Tailp3.mirror = true;
        setRotation(Tailp3, 1.130069F, 0F, 0F);
        Tailp4 = new ModelRenderer(this, 46, 18);
        Tailp4.func_228300_a_(-1.5F, 5F, -1.5F, 3, 11, 3);
        Tailp4.setRotationPoint(0.5F, 12F, 20F);
        Tailp4.setTextureSize(64, 32);
        Tailp4.mirror = true;
        setRotation(Tailp4, 1.130069F, 0F, 0F);
        LegL3 = new ModelRenderer(this, 0, 2);
        LegL3.func_228300_a_(-8F, 11F, 4F, 2, 2, 2);
        LegL3.setRotationPoint(5F, 11F, 19F);
        LegL3.setTextureSize(64, 32);
        LegL3.mirror = true;
        setRotation(LegL3, 0F, -3.141593F, 0F);
        LegL4 = new ModelRenderer(this, 0, 2);
        LegL4.func_228300_a_(-8F, 11F, -1F, 2, 2, 2);
        LegL4.setRotationPoint(5F, 11F, 19F);
        LegL4.setTextureSize(64, 32);
        LegL4.mirror = true;
        setRotation(LegL4, 0F, -3.141593F, 0F);
        LegL5 = new ModelRenderer(this, 0, 20);
        LegL5.func_228300_a_(-1F, -1F, 4F, 2, 10, 2);
        LegL5.setRotationPoint(5F, 11F, 19F);
        LegL5.setTextureSize(64, 32);
        LegL5.mirror = true;
        setRotation(LegL5, 0F, -3.141593F, -0.7853982F);
        LegL6 = new ModelRenderer(this, 0, 20);
        LegL6.func_228300_a_(-1F, -1F, -1F, 2, 10, 2);
        LegL6.setRotationPoint(5F, 11F, 19F);
        LegL6.setTextureSize(64, 32);
        LegL6.mirror = true;
        setRotation(LegL6, 0F, -3.141593F, -0.7853982F);
        LegL10 = new ModelRenderer(this, 46, 17);
        LegL10.func_228300_a_(-9F, 5F, 3F, 4, 3, 4);
        LegL10.setRotationPoint(5F, 11F, 19F);
        LegL10.setTextureSize(64, 32);
        LegL10.mirror = true;
        setRotation(LegL10, 0F, -3.141593F, 0F);
        box1 = new ModelRenderer(this, 46, 17);
        box1.func_228300_a_(-9F, 5F, -2F, 4, 3, 4);
        box1.setRotationPoint(-11F, 4F, 19F);
        box1.setTextureSize(64, 32);
        box1.mirror = true;
        setRotation(box1, 0F, -3.141593F, 0F);
        LegL12 = new ModelRenderer(this, 0, 22);
        LegL12.func_228300_a_(-8F, 3F, 4F, 2, 8, 2);
        LegL12.setRotationPoint(5F, 11F, 19F);
        LegL12.setTextureSize(64, 32);
        LegL12.mirror = true;
        setRotation(LegL12, 0F, -3.141593F, 0F);
        LegL13 = new ModelRenderer(this, 0, 22);
        LegL13.func_228300_a_(-8F, 3F, -1F, 2, 8, 2);
        LegL13.setRotationPoint(5F, 11F, 19F);
        LegL13.setTextureSize(64, 32);
        LegL13.mirror = true;
        setRotation(LegL13, 0F, -3.141593F, 0F);
        LegL14 = new ModelRenderer(this, 50, 15);
        LegL14.func_228300_a_(-8F, 1F, 4F, 2, 2, 2);
        LegL14.setRotationPoint(5F, 11F, 19F);
        LegL14.setTextureSize(64, 32);
        LegL14.mirror = true;
        setRotation(LegL14, 0F, -3.141593F, 0F);
        LegLF18 = new ModelRenderer(this, 50, 15);
        LegLF18.func_228300_a_(-8F, 1F, 4F, 2, 2, 2);
        LegLF18.setRotationPoint(5F, 11F, 6F);
        LegLF18.setTextureSize(64, 32);
        LegLF18.mirror = true;
        setRotation(LegLF18, 0F, -3.141593F, 0F);
        LegR3 = new ModelRenderer(this, 0, 2);
        LegR3.func_228300_a_(-8F, 11F, -1F, 2, 2, 2);
        LegR3.setRotationPoint(-6F, 11F, 14F);
        LegR3.setTextureSize(64, 32);
        LegR3.mirror = true;
        setRotation(LegR3, 0F, 0F, 0F);
        LegR4 = new ModelRenderer(this, 0, 22);
        LegR4.func_228300_a_(-8F, 3F, -1F, 2, 8, 2);
        LegR4.setRotationPoint(-6F, 11F, 14F);
        LegR4.setTextureSize(64, 32);
        LegR4.mirror = true;
        setRotation(LegR4, 0F, 0F, 0F);
        LegR5 = new ModelRenderer(this, 46, 17);
        LegR5.func_228300_a_(-9F, 5F, -2F, 4, 3, 4);
        LegR5.setRotationPoint(-6F, 11F, 14F);
        LegR5.setTextureSize(64, 32);
        LegR5.mirror = true;
        setRotation(LegR5, 0F, 0F, 0F);
        LegR7 = new ModelRenderer(this, 50, 15);
        LegR7.func_228300_a_(-8F, 1F, 4F, 2, 2, 2);
        LegR7.setRotationPoint(-6F, 11F, 14F);
        LegR7.setTextureSize(64, 32);
        LegR7.mirror = true;
        setRotation(LegR7, 0F, 0F, 0F);
        LegR9 = new ModelRenderer(this, 0, 20);
        LegR9.func_228300_a_(-1F, -1F, 4F, 2, 10, 2);
        LegR9.setRotationPoint(-6F, 11F, 14F);
        LegR9.setTextureSize(64, 32);
        LegR9.mirror = true;
        setRotation(LegR9, 0F, 0F, 0.7853982F);
        LegR10 = new ModelRenderer(this, 0, 20);
        LegR10.func_228300_a_(-1F, -1F, -1F, 2, 10, 2);
        LegR10.setRotationPoint(-6F, 11F, 14F);
        LegR10.setTextureSize(64, 32);
        LegR10.mirror = true;
        setRotation(LegR10, 0F, 0F, 0.7853982F);
        LegR12 = new ModelRenderer(this, 50, 15);
        LegR12.func_228300_a_(-8F, 1F, 4F, 2, 2, 2);
        LegR12.setRotationPoint(-6F, 11F, 1F);
        LegR12.setTextureSize(64, 32);
        LegR12.mirror = true;
        setRotation(LegR12, 0F, 0F, 0F);
        LegR13 = new ModelRenderer(this, 0, 22);
        LegR13.func_228300_a_(-8F, 3F, 4F, 2, 8, 2);
        LegR13.setRotationPoint(-6F, 11F, 14F);
        LegR13.setTextureSize(64, 32);
        LegR13.mirror = true;
        setRotation(LegR13, 0F, 0F, 0F);
        LegR14 = new ModelRenderer(this, 46, 17);
        LegR14.func_228300_a_(-9F, 5F, 3F, 4, 3, 4);
        LegR14.setRotationPoint(-6F, 11F, 14F);
        LegR14.setTextureSize(64, 32);
        LegR14.mirror = true;
        setRotation(LegR14, 0F, 0F, 0F);
        LegR15 = new ModelRenderer(this, 0, 2);
        LegR15.func_228300_a_(-8F, 11F, 4F, 2, 2, 2);
        LegR15.setRotationPoint(-6F, 11F, 14F);
        LegR15.setTextureSize(64, 32);
        LegR15.mirror = true;
        setRotation(LegR15, 0F, 0F, 0F);
        LegLF1 = new ModelRenderer(this, 0, 20);
        LegLF1.func_228300_a_(-1F, -1F, 4F, 2, 10, 2);
        LegLF1.setRotationPoint(5F, 11F, 6F);
        LegLF1.setTextureSize(64, 32);
        LegLF1.mirror = true;
        setRotation(LegLF1, 0F, -3.141593F, -0.7853982F);
        LegLF2 = new ModelRenderer(this, 0, 20);
        LegLF2.func_228300_a_(-1F, -1F, -1F, 2, 10, 2);
        LegLF2.setRotationPoint(5F, 11F, 6F);
        LegLF2.setTextureSize(64, 32);
        LegLF2.mirror = true;
        setRotation(LegLF2, 0F, -3.141593F, -0.7853982F);
        LegLF3 = new ModelRenderer(this, 0, 22);
        LegLF3.func_228300_a_(-8F, 3F, -1F, 2, 8, 2);
        LegLF3.setRotationPoint(5F, 11F, 6F);
        LegLF3.setTextureSize(64, 32);
        LegLF3.mirror = true;
        setRotation(LegLF3, 0F, -3.141593F, 0F);
        LegLF4 = new ModelRenderer(this, 50, 15);
        LegLF4.func_228300_a_(-8F, 1F, -1F, 2, 2, 2);
        LegLF4.setRotationPoint(5F, 11F, 6F);
        LegLF4.setTextureSize(64, 32);
        LegLF4.mirror = true;
        setRotation(LegLF4, 0F, -3.141593F, 0F);
        LegLF7 = new ModelRenderer(this, 0, 22);
        LegLF7.func_228300_a_(-8F, 3F, 4F, 2, 8, 2);
        LegLF7.setRotationPoint(5F, 11F, 6F);
        LegLF7.setTextureSize(64, 32);
        LegLF7.mirror = true;
        setRotation(LegLF7, 0F, -3.141593F, 0F);
        LegLF8 = new ModelRenderer(this, 46, 17);
        LegLF8.func_228300_a_(-9F, 5F, 3F, 4, 3, 4);
        LegLF8.setRotationPoint(5F, 11F, 6F);
        LegLF8.setTextureSize(64, 32);
        LegLF8.mirror = true;
        setRotation(LegLF8, 0F, -3.141593F, 0F);
        LegLF9 = new ModelRenderer(this, 46, 17);
        LegLF9.func_228300_a_(-9F, 5F, -2F, 4, 3, 4);
        LegLF9.setRotationPoint(5F, 11F, 6F);
        LegLF9.setTextureSize(64, 32);
        LegLF9.mirror = true;
        setRotation(LegLF9, 0F, -3.141593F, 0F);
        LegLF14 = new ModelRenderer(this, 0, 2);
        LegLF14.func_228300_a_(-8F, 11F, 4F, 2, 2, 2);
        LegLF14.setRotationPoint(5F, 11F, 6F);
        LegLF14.setTextureSize(64, 32);
        LegLF14.mirror = true;
        setRotation(LegLF14, 0F, -3.141593F, 0F);
        LegLF16 = new ModelRenderer(this, 0, 2);
        LegLF16.func_228300_a_(-8F, 11F, -1F, 2, 2, 2);
        LegLF16.setRotationPoint(5F, 11F, 6F);
        LegLF16.setTextureSize(64, 32);
        LegLF16.mirror = true;
        setRotation(LegLF16, 0F, -3.141593F, 0F);
        LegL18 = new ModelRenderer(this, 46, 17);
        LegL18.func_228300_a_(-9F, 5F, -2F, 4, 3, 4);
        LegL18.setRotationPoint(5F, 11F, 19F);
        LegL18.setTextureSize(64, 32);
        LegL18.mirror = true;
        setRotation(LegL18, 0F, -3.141593F, 0F);
        LegRF5 = new ModelRenderer(this, 46, 17);
        LegRF5.func_228300_a_(-9F, 5F, 3F, 4, 3, 4);
        LegRF5.setRotationPoint(-6F, 11F, 1F);
        LegRF5.setTextureSize(64, 32);
        LegRF5.mirror = true;
        setRotation(LegRF5, 0F, 0F, 0F);
        LegRF6 = new ModelRenderer(this, 0, 2);
        LegRF6.func_228300_a_(-8F, 11F, 4F, 2, 2, 2);
        LegRF6.setRotationPoint(-6F, 11F, 1F);
        LegRF6.setTextureSize(64, 32);
        LegRF6.mirror = true;
        setRotation(LegRF6, 0F, 0F, 0F);
        LegRF7 = new ModelRenderer(this, 0, 22);
        LegRF7.func_228300_a_(-8F, 3F, 4F, 2, 8, 2);
        LegRF7.setRotationPoint(-6F, 11F, 1F);
        LegRF7.setTextureSize(64, 32);
        LegRF7.mirror = true;
        setRotation(LegRF7, 0F, 0F, 0F);
        LegRF9 = new ModelRenderer(this, 0, 20);
        LegRF9.func_228300_a_(-1F, -1F, 4F, 2, 10, 2);
        LegRF9.setRotationPoint(-6F, 11F, 1F);
        LegRF9.setTextureSize(64, 32);
        LegRF9.mirror = true;
        setRotation(LegRF9, 0F, 0F, 0.7853982F);
        LegRF10 = new ModelRenderer(this, 0, 20);
        LegRF10.func_228300_a_(-1F, -1F, -1F, 2, 10, 2);
        LegRF10.setRotationPoint(-6F, 11F, 1F);
        LegRF10.setTextureSize(64, 32);
        LegRF10.mirror = true;
        setRotation(LegRF10, 0F, 0F, 0.7853982F);
        LegRF12 = new ModelRenderer(this, 50, 15);
        LegRF12.func_228300_a_(-8F, 1F, -1F, 2, 2, 2);
        LegRF12.setRotationPoint(-6F, 11F, 1F);
        LegRF12.setTextureSize(64, 32);
        LegRF12.mirror = true;
        setRotation(LegRF12, 0F, 0F, 0F);
        LegRF13 = new ModelRenderer(this, 46, 17);
        LegRF13.func_228300_a_(-9F, 5F, -2F, 4, 3, 4);
        LegRF13.setRotationPoint(-6F, 11F, 1F);
        LegRF13.setTextureSize(64, 32);
        LegRF13.mirror = true;
        setRotation(LegRF13, 0F, 0F, 0F);
        LegRF15 = new ModelRenderer(this, 0, 2);
        LegRF15.func_228300_a_(-8F, 11F, -1F, 2, 2, 2);
        LegRF15.setRotationPoint(-6F, 11F, 1F);
        LegRF15.setTextureSize(64, 32);
        LegRF15.mirror = true;
        setRotation(LegRF15, 0F, 0F, 0F);
        LegRF16 = new ModelRenderer(this, 0, 22);
        LegRF16.func_228300_a_(-8F, 3F, -1F, 2, 8, 2);
        LegRF16.setRotationPoint(-6F, 11F, 1F);
        LegRF16.setTextureSize(64, 32);
        LegRF16.mirror = true;
        setRotation(LegRF16, 0F, 0F, 0F);
        Box2 = new ModelRenderer(this, 46, 17);
        Box2.func_228300_a_(-9F, 5F, -2F, 4, 3, 4);
        Box2.setRotationPoint(-2F, 4F, 19F);
        Box2.setTextureSize(64, 32);
        Box2.mirror = true;
        setRotation(Box2, 0F, -3.141593F, 0F);
        Body1 = new ModelRenderer(this, 44, 0);
        Body1.func_228300_a_(-4F, -2F, -3F, 5, 9, 5);
        Body1.setRotationPoint(5F, 9F, 1F);
        Body1.setTextureSize(64, 32);
        Body1.mirror = true;
        setRotation(Body1, 1.570796F, 0F, 0F);
        Body2 = new ModelRenderer(this, 0, 0);
        Body2.func_228300_a_(-6F, -11F, 2F, 2, 6, 2);
        Body2.setRotationPoint(5F, 7F, 6F);
        Body2.setTextureSize(64, 32);
        Body2.mirror = true;
        setRotation(Body2, -0.7853982F, 0F, 0F);
        Body3 = new ModelRenderer(this, 0, 0);
        Body3.func_228300_a_(-6F, -5F, 2F, 2, 6, 2);
        Body3.setRotationPoint(5F, 7F, 6F);
        Body3.setTextureSize(64, 32);
        Body3.mirror = true;
        setRotation(Body3, -0.7853982F, 0F, 0F);
        Body4 = new ModelRenderer(this, 0, 0);
        Body4.func_228300_a_(-6F, -8F, -3F, 2, 6, 2);
        Body4.setRotationPoint(5F, 7F, 6F);
        Body4.setTextureSize(64, 32);
        Body4.mirror = true;
        setRotation(Body4, -0.7853982F, 0F, 0F);
        Body5 = new ModelRenderer(this, 0, 0);
        Body5.func_228300_a_(-6F, -2F, -3F, 2, 6, 2);
        Body5.setRotationPoint(5F, 7F, 6F);
        Body5.setTextureSize(64, 32);
        Body5.mirror = true;
        setRotation(Body5, -0.7853982F, 0F, 0F);
        Leg19 = new ModelRenderer(this, 50, 15);
        Leg19.func_228300_a_(-8F, 1F, -1F, 2, 2, 2);
        Leg19.setRotationPoint(-6F, 11F, 14F);
        Leg19.setTextureSize(64, 32);
        Leg19.mirror = true;
        setRotation(Leg19, 0F, 0F, 0F);
        LegL15 = new ModelRenderer(this, 50, 15);
        LegL15.func_228300_a_(-8F, 1F, -1F, 2, 2, 2);
        LegL15.setRotationPoint(5F, 11F, 19F);
        LegL15.setTextureSize(64, 32);
        LegL15.mirror = true;
        setRotation(LegL15, 0F, -3.141593F, 0F);
    }

    @Override
    public void setRotationAngles(Behemoth entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);

        this.Tailp3.rotateAngleX =
                this.Tailp4.rotateAngleX = MathHelper.cos(netHeadYaw * 0.1F) * (float) Math.PI * 0.15F + 1.092891F;

        this.LegL3.rotateAngleX =
                this.LegL4.rotateAngleX =
                        this.LegL5.rotateAngleX =
                                this.LegL6.rotateAngleX =
                                        this.LegL10.rotateAngleX =
                                                this.LegL12.rotateAngleX =
                                                        this.LegL13.rotateAngleX =
                                                                this.LegL14.rotateAngleX =
                                                                        this.LegL15.rotateAngleX =
                                                                                this.LegL18.rotateAngleX =
                                                                                        this.LegLF1.rotateAngleX =
                                                                                                this.LegLF2.rotateAngleX =
                                                                                                        this.LegLF3.rotateAngleX =
                                                                                                                this.LegLF4.rotateAngleX =
                                                                                                                        this.LegLF7.rotateAngleX =
                                                                                                                                this.LegLF8.rotateAngleX =
                                                                                                                                        this.LegLF9.rotateAngleX =
                                                                                                                                                this.LegLF14.rotateAngleX =
                                                                                                                                                        this.LegLF16.rotateAngleX =
                                                                                                                                                                this.LegLF18.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;

        this.LegR3.rotateAngleX =
                this.LegR4.rotateAngleX =
                        this.LegR5.rotateAngleX =
                                this.LegR7.rotateAngleX =
                                        this.LegR9.rotateAngleX =
                                                this.LegR10.rotateAngleX =
                                                        this.Leg19.rotateAngleX =
                                                                this.LegR12.rotateAngleX =
                                                                        this.LegR13.rotateAngleX =
                                                                                this.LegR14.rotateAngleX =
                                                                                        this.LegR15.rotateAngleX =
                                                                                                this.LegRF5.rotateAngleX =
                                                                                                        this.LegRF6.rotateAngleX =
                                                                                                                this.LegRF7.rotateAngleX =
                                                                                                                        this.LegRF9.rotateAngleX =
                                                                                                                                this.LegRF10.rotateAngleX =
                                                                                                                                        this.LegRF12.rotateAngleX =
                                                                                                                                                this.LegRF13.rotateAngleX =
                                                                                                                                                        this.LegRF15.rotateAngleX =
                                                                                                                                                                this.LegRF16.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
    }
}
