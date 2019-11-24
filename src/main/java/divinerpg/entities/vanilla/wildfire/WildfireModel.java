package divinerpg.entities.vanilla.wildfire;

import divinerpg.entities.base.DivineModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

public class WildfireModel extends DivineModel<Wildfire> {

    public boolean isHolding;
    public ItemStack itemStack;
    // fields
    public RendererModel P1;
    public RendererModel P2;
    public RendererModel P3;
    public RendererModel leftarm;
    public RendererModel rightleg;
    public RendererModel leftleg;
    public RendererModel P4;
    public RendererModel P5;
    public RendererModel P6;
    public RendererModel P7;
    public RendererModel P8;
    public RendererModel rightarm;
    public RendererModel P9;
    public RendererModel P10;
    public RendererModel P11;
    public RendererModel P12;
    public RendererModel P13;
    public RendererModel P14;
    public RendererModel P15;
    public RendererModel P16;
    public RendererModel P17;

    public WildfireModel() {
        textureWidth = 64;
        textureHeight = 32;

        P1 = new RendererModel(this, 32, 17);
        P1.addBox(-4F, -13F, -1F, 2, 8, 2);
        P1.setRotationPoint(6F, -6F, 9F);
        P1.setTextureSize(64, 32);
        P1.mirror = true;
        setRotation(P1, 0.7853982F, 0F, 0F);
        P2 = new RendererModel(this, 16, 16);
        P2.addBox(-4F, 0F, -2F, 5, 12, 4);
        P2.setRotationPoint(4F, 0F, 0F);
        P2.setTextureSize(64, 32);
        P2.mirror = true;
        setRotation(P2, 0F, 0F, 0F);
        P3 = new RendererModel(this, 40, 16);
        P3.addBox(-1F, -3F, -2F, 2, 4, 6);
        P3.setRotationPoint(5F, -1F, -1F);
        P3.setTextureSize(64, 32);
        P3.mirror = true;
        setRotation(P3, 0F, 0F, 0F);
        leftarm = new RendererModel(this, 40, 16);
        leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
        leftarm.setRotationPoint(7F, 2F, 0F);
        leftarm.setTextureSize(64, 32);
        leftarm.mirror = true;
        setRotation(leftarm, 0F, 0F, 0F);
        rightleg = new RendererModel(this, 0, 16);
        rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        rightleg.setRotationPoint(-3F, 12F, 0F);
        rightleg.setTextureSize(64, 32);
        rightleg.mirror = true;
        setRotation(rightleg, 0F, 0F, 0F);
        leftleg = new RendererModel(this, 0, 16);
        leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        leftleg.setRotationPoint(3F, 12F, 0F);
        leftleg.setTextureSize(64, 32);
        leftleg.mirror = true;
        setRotation(leftleg, 0F, 0F, 0F);
        P4 = new RendererModel(this, 43, 18);
        P4.addBox(1F, -2F, -2F, 1, 2, 4);
        P4.setRotationPoint(4F, 2F, 0F);
        P4.setTextureSize(64, 32);
        P4.mirror = true;
        setRotation(P4, 0F, 0F, 0F);
        P5 = new RendererModel(this, 40, 16);
        P5.addBox(-2F, -3F, -2F, 6, 2, 4);
        P5.setRotationPoint(7F, 1F, 0F);
        P5.setTextureSize(64, 32);
        P5.mirror = true;
        setRotation(P5, 0F, 0F, 0F);
        P6 = new RendererModel(this, 40, 16);
        P6.addBox(-2F, -3F, -2F, 6, 2, 4);
        P6.setRotationPoint(-9F, 1F, 0F);
        P6.setTextureSize(64, 32);
        P6.mirror = true;
        setRotation(P6, 0F, 0F, 0F);
        P7 = new RendererModel(this, 40, 16);
        P7.addBox(-1F, -3F, -2F, 2, 4, 6);
        P7.setRotationPoint(-5F, -1F, -1F);
        P7.setTextureSize(64, 32);
        P7.mirror = true;
        setRotation(P7, 0F, 0F, 0F);
        P8 = new RendererModel(this, 43, 18);
        P8.addBox(1F, -2F, -2F, 1, 2, 4);
        P8.setRotationPoint(-7F, 2F, 0F);
        P8.setTextureSize(64, 32);
        P8.mirror = true;
        setRotation(P8, 0F, 0F, 0F);
        rightarm = new RendererModel(this, 40, 16);
        rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
        rightarm.setRotationPoint(-7F, 2F, 0F);
        rightarm.setTextureSize(64, 32);
        rightarm.mirror = true;
        setRotation(rightarm, 0F, 0F, 0F);
        P9 = new RendererModel(this, 23, 19);
        P9.addBox(-3F, -2F, -2F, 3, 9, 2);
        P9.setRotationPoint(-10F, -1F, 1F);
        P9.setTextureSize(64, 32);
        P9.mirror = true;
        setRotation(P9, 0F, 0F, 2.530727F);
        P10 = new RendererModel(this, 23, 19);
        P10.addBox(-3F, -2F, -2F, 3, 9, 2);
        P10.setRotationPoint(8F, -3F, 1F);
        P10.setTextureSize(64, 32);
        P10.mirror = true;
        setRotation(P10, 0F, 0F, -2.530727F);
        P11 = new RendererModel(this, 32, 0);
        P11.addBox(-3F, -8F, -4F, 6, 12, 6);
        P11.setRotationPoint(0F, 1F, 0F);
        P11.setTextureSize(64, 32);
        P11.mirror = true;
        setRotation(P11, -0.3490659F, 0F, 0F);
        P12 = new RendererModel(this, 32, 17);
        P12.addBox(-4F, -13F, -1F, 2, 8, 2);
        P12.setRotationPoint(0F, -6F, 9F);
        P12.setTextureSize(64, 32);
        P12.mirror = true;
        setRotation(P12, 0.7853982F, 0F, 0F);
        P13 = new RendererModel(this, 19, 22);
        P13.addBox(-5F, -14F, -1F, 4, 4, 4);
        P13.setRotationPoint(6F, 1F, -1F);
        P13.setTextureSize(64, 32);
        P13.mirror = true;
        setRotation(P13, -0.3490659F, 0F, 0F);
        P14 = new RendererModel(this, 19, 22);
        P14.addBox(-5F, -14F, -1F, 4, 4, 4);
        P14.setRotationPoint(0F, 1F, -1F);
        P14.setTextureSize(64, 32);
        P14.mirror = true;
        setRotation(P14, -0.3490659F, 0F, 0F);
        P15 = new RendererModel(this, 32, 17);
        P15.addBox(-4F, -13F, -1F, 2, 8, 2);
        P15.setRotationPoint(0F, 2F, 0F);
        P15.setTextureSize(64, 32);
        P15.mirror = true;
        setRotation(P15, -0.3490659F, 0F, 0F);
        P16 = new RendererModel(this, 32, 17);
        P16.addBox(-4F, -13F, -1F, 2, 8, 2);
        P16.setRotationPoint(6F, 2F, 0F);
        P16.setTextureSize(64, 32);
        P16.mirror = true;
        setRotation(P16, -0.3490659F, 0F, 0F);
        P17 = new RendererModel(this, 16, 16);
        P17.addBox(-4F, 0F, -2F, 5, 12, 4);
        P17.setRotationPoint(-1F, 0F, 0F);
        P17.setTextureSize(64, 32);
        P17.mirror = true;
        setRotation(P17, 0F, 0F, 0F);
    }

    @Override
    public void setLivingAnimations(Wildfire entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
        super.setLivingAnimations(entityIn, limbSwing, limbSwingAmount, partialTick);
    }

    @Override
    public void setRotationAngles(Wildfire entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
        super.setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);

        this.rightarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 2.0F * limbSwingAmount * 0.5F;
        this.leftarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F;
        this.rightarm.rotateAngleZ = 0.0F;
        this.leftarm.rotateAngleZ = 0.0F;
        this.rightleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
        this.rightleg.rotateAngleY = 0.0F;
        this.leftleg.rotateAngleY = 0.0F;
        this.rightarm.rotateAngleY = 0.0F;
        this.leftarm.rotateAngleY = 0.0F;
        this.rightarm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.leftarm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.rightarm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.leftarm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
    }
}
