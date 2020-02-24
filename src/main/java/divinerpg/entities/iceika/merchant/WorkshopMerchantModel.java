package divinerpg.entities.iceika.merchant;

import divinerpg.entities.base.render.DivineModel;
import divinerpg.entities.iceika.merchant.entities.WorkshopMerchant;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class WorkshopMerchantModel extends DivineModel<WorkshopMerchant> {
    //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarmtop;
    ModelRenderer rightlegbottom;
    ModelRenderer rightleg;
    ModelRenderer leftlegbottom;
    ModelRenderer leftleg;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer leftarmtop;

    public WorkshopMerchantModel() {
        textureWidth = 64;
        textureHeight = 32;

        head = new ModelRenderer(this, 0, 0);
        head.func_228300_a_(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0F, -7F, 0F);
        head.setTextureSize(64, 32);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        body = new ModelRenderer(this, 30, 14);
        body.func_228300_a_(-4F, 0F, -2F, 8, 14, 4);
        body.setRotationPoint(0F, -7F, 0F);
        body.setTextureSize(64, 32);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        rightarmtop = new ModelRenderer(this, 37, 16);
        rightarmtop.func_228300_a_(-6F, -3F, -2F, 8, 5, 6);
        rightarmtop.setRotationPoint(-6F, -5F, -1F);
        rightarmtop.setTextureSize(64, 32);
        rightarmtop.mirror = true;
        setRotation(rightarmtop, 0F, 0F, 0F);
        rightlegbottom = new ModelRenderer(this, 0, 16);
        rightlegbottom.func_228300_a_(-3F, 8F, -3F, 6, 9, 6);
        rightlegbottom.setRotationPoint(-4F, 7F, 0F);
        rightlegbottom.setTextureSize(64, 32);
        rightlegbottom.mirror = true;
        setRotation(rightlegbottom, 0F, 0F, 0F);
        rightleg = new ModelRenderer(this, 0, 16);
        rightleg.func_228300_a_(-2F, 0F, -2F, 4, 12, 4);
        rightleg.setRotationPoint(-4F, 7F, 0F);
        rightleg.setTextureSize(64, 32);
        rightleg.mirror = true;
        setRotation(rightleg, 0F, 0F, 0F);
        leftlegbottom = new ModelRenderer(this, 0, 16);
        leftlegbottom.func_228300_a_(-3F, 8F, -3F, 6, 9, 6);
        leftlegbottom.setRotationPoint(4F, 7F, 0F);
        leftlegbottom.setTextureSize(64, 32);
        leftlegbottom.mirror = true;
        setRotation(leftlegbottom, 0F, 0F, 0F);
        leftleg = new ModelRenderer(this, 0, 16);
        leftleg.func_228300_a_(-2F, 0F, -2F, 4, 12, 4);
        leftleg.setRotationPoint(4F, 7F, 0F);
        leftleg.setTextureSize(64, 32);
        leftleg.mirror = true;
        setRotation(leftleg, 0F, 0F, 0F);
        rightarm = new ModelRenderer(this, 40, 16);
        rightarm.func_228300_a_(-5F, 2F, -2F, 4, 12, 4);
        rightarm.setRotationPoint(-6F, -5F, 0F);
        rightarm.setTextureSize(64, 32);
        rightarm.mirror = true;
        setRotation(rightarm, 0F, 0F, 0F);
        leftarm = new ModelRenderer(this, 40, 16);
        leftarm.func_228300_a_(0F, 2F, -2F, 4, 12, 4);
        leftarm.setRotationPoint(7F, -5F, 0F);
        leftarm.setTextureSize(64, 32);
        leftarm.mirror = true;
        setRotation(leftarm, 0F, 0F, 0F);
        leftarmtop = new ModelRenderer(this, 36, 16);
        leftarmtop.func_228300_a_(-3F, -3F, -2F, 8, 5, 6);
        leftarmtop.setRotationPoint(7F, -5F, -1F);
        leftarmtop.setTextureSize(64, 32);
        leftarmtop.mirror = true;
        setRotation(leftarmtop, 0F, 0F, 0F);
    }

    @Override
    public void setRotationAngles(WorkshopMerchant entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        this.head.rotateAngleY = netHeadYaw / (180F / (float) Math.PI);
        this.head.rotateAngleX = headPitch / (180F / (float) Math.PI);
        this.rightarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 2.0F * limbSwingAmount * 0.5F;
        this.leftarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F;
        this.rightarm.rotateAngleZ = 0.0F;
        this.leftarm.rotateAngleZ = 0.0F;
        this.rightleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
        this.rightleg.rotateAngleY = 0.0F;
        this.leftleg.rotateAngleY = 0.0F;
        this.rightarmtop.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 2.0F * limbSwingAmount * 0.5F;
        this.leftarmtop.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F;
        this.rightarmtop.rotateAngleZ = 0.0F;
        this.leftarmtop.rotateAngleZ = 0.0F;
        this.rightlegbottom.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftlegbottom.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
        this.rightlegbottom.rotateAngleY = 0.0F;
        this.leftlegbottom.rotateAngleY = 0.0F;
    }
}
