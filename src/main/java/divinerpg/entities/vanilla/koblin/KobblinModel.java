package divinerpg.entities.vanilla.koblin;

import divinerpg.entities.base.render.DivineModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class KobblinModel extends DivineModel<Kobblin> {
    ModelRenderer Pad;
    ModelRenderer RArm1;
    ModelRenderer Neck;
    ModelRenderer Body;
    ModelRenderer Head;
    ModelRenderer Tongue;
    ModelRenderer RArm2;
    ModelRenderer RLeg;
    ModelRenderer LArm2;
    ModelRenderer LArm1;
    ModelRenderer LLeg;

    public KobblinModel() {
        textureWidth = 64;
        textureHeight = 32;

        Pad = new ModelRenderer(this, 0, 0);
        Pad.addBox(0F, 0F, 0F, 16, 3, 16);
        Pad.setRotationPoint(-8F, 5F, -8F);
        Pad.setTextureSize(64, 32);
        Pad.mirror = true;
        setRotation(Pad, 0F, 0F, 0F);
        RArm1 = new ModelRenderer(this, 48, 19);
        RArm1.addBox(0F, 0F, 0F, 1, 4, 1);
        RArm1.setRotationPoint(-3.5F, 14F, 2.5F);
        RArm1.setTextureSize(64, 32);
        RArm1.mirror = true;
        setRotation(RArm1, -0.7853982F, 0.3665191F, 0F);
        Neck = new ModelRenderer(this, 40, 23);
        Neck.addBox(0F, 0F, 0F, 2, 3, 2);
        Neck.setRotationPoint(-1F, 13F, -0.5F);
        Neck.setTextureSize(64, 32);
        Neck.mirror = true;
        setRotation(Neck, 0.5235988F, 0F, 0F);
        Body = new ModelRenderer(this, 20, 19);
        Body.addBox(0F, 0F, 0F, 5, 6, 5);
        Body.setRotationPoint(-2.5F, 14F, 0.5F);
        Body.setTextureSize(64, 32);
        Body.mirror = true;
        setRotation(Body, 0F, 0F, 0F);
        Head = new ModelRenderer(this, 0, 19);
        Head.addBox(0F, 0F, 0F, 5, 5, 5);
        Head.setRotationPoint(-2.5F, 8F, -2.5F);
        Head.setTextureSize(64, 32);
        Head.mirror = true;
        setRotation(Head, 0F, 0F, 0F);
        Tongue = new ModelRenderer(this, 40, 19);
        Tongue.addBox(0F, 0F, 0F, 3, 3, 1);
        Tongue.setRotationPoint(-1.5F, 12F, -2.5F);
        Tongue.setTextureSize(64, 32);
        Tongue.mirror = true;
        setRotation(Tongue, -0.7853982F, 0F, 0F);
        RArm2 = new ModelRenderer(this, 48, 24);
        RArm2.addBox(-1.5F, 2F, 2.5F, 1, 4, 1);
        RArm2.setRotationPoint(-3.5F, 14F, 2.5F);
        RArm2.setTextureSize(64, 32);
        RArm2.mirror = true;
        setRotation(RArm2, -1.570796F, -0.3665191F, 0F);
        RArm2.mirror = false;
        RLeg = new ModelRenderer(this, 48, 19);
        RLeg.addBox(0F, 0F, 0F, 1, 4, 1);
        RLeg.setRotationPoint(-2F, 20F, 2.5F);
        RLeg.setTextureSize(64, 32);
        RLeg.mirror = true;
        setRotation(RLeg, 0F, 0F, 0F);
        LArm2 = new ModelRenderer(this, 48, 24);
        LArm2.addBox(1.5F, 1.5F, 2.5F, 1, 4, 1);
        LArm2.setRotationPoint(2.5F, 14F, 2.5F);
        LArm2.setTextureSize(64, 32);
        LArm2.mirror = true;
        setRotation(LArm2, -1.570796F, 0.3665191F, 0F);
        LArm1 = new ModelRenderer(this, 48, 19);
        LArm1.addBox(0F, 0F, 0F, 1, 4, 1);
        LArm1.setRotationPoint(2.5F, 14F, 2.5F);
        LArm1.setTextureSize(64, 32);
        LArm1.mirror = true;
        setRotation(LArm1, -0.7853982F, -0.3665191F, 0F);
        LLeg = new ModelRenderer(this, 48, 19);
        LLeg.addBox(0F, 0F, 0F, 1, 4, 1);
        LLeg.setRotationPoint(1F, 20F, 2.5F);
        LLeg.setTextureSize(64, 32);
        LLeg.mirror = true;
        setRotation(LLeg, 0F, 0F, 0F);
    }

    @Override
    public void setRotationAngles(Kobblin entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
        super.setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);

        this.RArm1.rotateAngleX = -0.7853982F + (MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount);
        this.RArm2.rotateAngleX = -1.570796F + (MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount);
        this.LArm1.rotateAngleX = -0.7853982F + (MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount);
        this.LArm2.rotateAngleX = -1.570796F + (MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount);

        this.RLeg.rotateAngleX = (MathHelper.cos(limbSwing * 0.6662F) * limbSwingAmount);
        this.LLeg.rotateAngleX = (MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount);
    }
}
