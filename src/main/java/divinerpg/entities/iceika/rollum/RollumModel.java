package divinerpg.entities.iceika.rollum;

import divinerpg.entities.base.render.DivineModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class RollumModel extends DivineModel<Rollum> {
    //fields
    ModelRenderer head;
    ModelRenderer connector;
    ModelRenderer rightarmtop;
    ModelRenderer rightlegbottom;
    ModelRenderer rightleg;
    ModelRenderer leftlegbottom;
    ModelRenderer leftleg;
    ModelRenderer rightarm;
    ModelRenderer rightarmext;
    ModelRenderer leftarmtop;
    ModelRenderer leftarm;
    ModelRenderer leftarmext;
    ModelRenderer body;

    public RollumModel() {
        textureWidth = 64;
        textureHeight = 32;

        head = new ModelRenderer(this, 0, 0);
        head.addBox(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0F, 5F, -10F);
        head.setTextureSize(64, 32);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        connector = new ModelRenderer(this, 30, 14);
        connector.addBox(-4F, 0F, -2F, 4, 4, 4);
        connector.setRotationPoint(2F, 1F, -2F);
        connector.setTextureSize(64, 32);
        connector.mirror = true;
        setRotation(connector, -1.570796F, 0F, 0F);
        rightarmtop = new ModelRenderer(this, 36, 16);
        rightarmtop.addBox(-6F, -3F, -2F, 8, 5, 6);
        rightarmtop.setRotationPoint(-6F, -5F, -1F);
        rightarmtop.setTextureSize(64, 32);
        rightarmtop.mirror = true;
        setRotation(rightarmtop, 0F, 0F, 0F);
        rightlegbottom = new ModelRenderer(this, 0, 16);
        rightlegbottom.addBox(-3F, 8F, -3F, 6, 9, 6);
        rightlegbottom.setRotationPoint(-4F, 7F, 0F);
        rightlegbottom.setTextureSize(64, 32);
        rightlegbottom.mirror = true;
        setRotation(rightlegbottom, 0F, 0F, 0F);
        rightleg = new ModelRenderer(this, 0, 16);
        rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        rightleg.setRotationPoint(-4F, 7F, 0F);
        rightleg.setTextureSize(64, 32);
        rightleg.mirror = true;
        setRotation(rightleg, 0F, 0F, 0F);
        leftlegbottom = new ModelRenderer(this, 0, 16);
        leftlegbottom.addBox(-3F, 8F, -3F, 6, 9, 6);
        leftlegbottom.setRotationPoint(4F, 7F, 0F);
        leftlegbottom.setTextureSize(64, 32);
        leftlegbottom.mirror = true;
        setRotation(leftlegbottom, 0F, 0F, 0F);
        leftleg = new ModelRenderer(this, 0, 16);
        leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        leftleg.setRotationPoint(4F, 7F, 0F);
        leftleg.setTextureSize(64, 32);
        leftleg.mirror = true;
        setRotation(leftleg, 0F, 0F, 0F);
        leftarmext = new ModelRenderer(this, 30, 18);
        leftarmext.addBox(0F, 9F, -10F, 4, 5, 9);
        leftarmext.setRotationPoint(7F, -5F, -1F);
        leftarmext.setTextureSize(64, 32);
        leftarmext.mirror = true;
        setRotation(leftarmext, 0F, 0F, 0F);
        leftarmtop = new ModelRenderer(this, 36, 16);
        leftarmtop.addBox(-3F, -3F, -2F, 8, 5, 6);
        leftarmtop.setRotationPoint(7F, -5F, -1F);
        leftarmtop.setTextureSize(64, 32);
        leftarmtop.mirror = true;
        setRotation(leftarmtop, 0F, 0F, 0F);
        leftarm = new ModelRenderer(this, 40, 16);
        leftarm.addBox(0F, 2F, -2F, 4, 12, 4);
        leftarm.setRotationPoint(7F, -5F, 0F);
        leftarm.setTextureSize(64, 32);
        leftarm.mirror = true;
        setRotation(leftarm, 0F, 0F, 0F);
        body = new ModelRenderer(this, 30, 14);
        body.addBox(-4F, 0F, -2F, 8, 14, 4);
        body.setRotationPoint(0F, -7F, 0F);
        body.setTextureSize(64, 32);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        rightarm = new ModelRenderer(this, 40, 16);
        rightarm.addBox(-5F, 2F, -2F, 4, 12, 4);
        rightarm.setRotationPoint(-6F, -5F, 0F);
        rightarm.setTextureSize(64, 32);
        rightarm.mirror = true;
        setRotation(rightarm, 0F, 0F, 0F);
        rightarmext = new ModelRenderer(this, 30, 18);
        rightarmext.addBox(-5F, 9F, -10F, 4, 5, 9);
        rightarmext.setRotationPoint(-6F, -5F, -1F);
        rightarmext.setTextureSize(64, 32);
        rightarmext.mirror = true;
        setRotation(rightarmext, 0F, 0F, 0F);
    }

    @Override
    public void setRotationAngles(Rollum entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
        super.setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);

        this.head.rotateAngleY = netHeadYaw / (180F / (float) Math.PI);
        this.head.rotateAngleX = headPitch / (180F / (float) Math.PI);
        this.rightarmtop.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 2.0F * limbSwingAmount * 0.5F;
        this.leftarmtop.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F;
        this.rightarmtop.rotateAngleZ = 0.0F;
        this.leftarmtop.rotateAngleZ = 0.0F;
        this.rightlegbottom.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftlegbottom.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
        this.rightlegbottom.rotateAngleY = 0.0F;
        this.leftlegbottom.rotateAngleY = 0.0F;
        this.rightarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 2.0F * limbSwingAmount * 0.5F;
        this.leftarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F;
        this.rightarm.rotateAngleZ = 0.0F;
        this.leftarm.rotateAngleZ = 0.0F;
        this.rightleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
        this.rightleg.rotateAngleY = 0.0F;
        this.leftleg.rotateAngleY = 0.0F;

        this.rightarmext.rotateAngleX = MathHelper.cos(-(limbSwing * 0.6662F + (float) Math.PI)) * 2.0F * limbSwingAmount * 0.5F;
        this.leftarmext.rotateAngleX = MathHelper.cos(-(limbSwing * 0.6662F)) * 2.0F * limbSwingAmount * 0.5F;
        this.rightarmext.rotateAngleZ = 0.0F;
        this.leftarmext.rotateAngleZ = 0.0F;
    }
}
