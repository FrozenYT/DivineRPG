package divinerpg.entities.wildwood.mage;

import divinerpg.entities.base.render.DivineModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class MageModel extends DivineModel<Mage> {
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer staffProng2;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer leftarm;
    ModelRenderer staffPole;
    ModelRenderer staffCap;
    ModelRenderer staffProng3;
    ModelRenderer staffProng1;
    ModelRenderer staffProng4;
    ModelRenderer head;
    ModelRenderer ray2;
    ModelRenderer ray1;
    ModelRenderer ray4;
    ModelRenderer ray3;

    public MageModel() {
        textureWidth = 64;
        textureHeight = 32;

        body = new ModelRenderer(this, 24, 0);
        body.addBox(-4F, 0F, -2F, 8, 12, 4);
        body.setRotationPoint(0F, 0F, 0F);
        body.setTextureSize(64, 32);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        rightarm = new ModelRenderer(this, 10, 23);
        rightarm.addBox(-6F, 4F, -2F, 4, 4, 4);
        rightarm.setRotationPoint(-4F, 2F, -2F);
        rightarm.setTextureSize(64, 32);
        rightarm.mirror = true;
        setRotation(rightarm, 0F, 0F, 0F);
        staffProng2 = new ModelRenderer(this, 40, 20);
        staffProng2.addBox(4F, -7F, -3F, 1, 2, 1);
        staffProng2.setRotationPoint(5F, 2F, 0F);
        staffProng2.setTextureSize(64, 32);
        staffProng2.mirror = true;
        setRotation(staffProng2, 0F, 0F, 0F);
        rightleg = new ModelRenderer(this, 0, 12);
        rightleg.addBox(-2F, 10F, -6F, 4, 2, 8);
        rightleg.setRotationPoint(-3F, 12F, 0F);
        rightleg.setTextureSize(64, 32);
        rightleg.mirror = true;
        setRotation(rightleg, 0F, 0F, 0F);
        leftleg = new ModelRenderer(this, 0, 12);
        leftleg.addBox(-2F, 10F, -6F, 4, 2, 8);
        leftleg.setRotationPoint(3F, 12F, 0F);
        leftleg.setTextureSize(64, 32);
        leftleg.mirror = true;
        setRotation(leftleg, 0F, 0F, 0F);
        leftarm = new ModelRenderer(this, 10, 23);
        leftarm.addBox(1F, 4F, -4F, 4, 4, 4);
        leftarm.setRotationPoint(5F, 2F, 0F);
        leftarm.setTextureSize(64, 32);
        leftarm.mirror = true;
        setRotation(leftarm, 0F, 0F, 0F);
        staffPole = new ModelRenderer(this, 53, 0);
        staffPole.addBox(2F, -4F, -5F, 2, 22, 2);
        staffPole.setRotationPoint(5F, 2F, 0F);
        staffPole.setTextureSize(64, 32);
        staffPole.mirror = true;
        setRotation(staffPole, 0F, 0F, 0F);
        staffCap = new ModelRenderer(this, 40, 25);
        staffCap.addBox(1F, -5F, -6F, 4, 2, 4);
        staffCap.setRotationPoint(5F, 2F, 0F);
        staffCap.setTextureSize(64, 32);
        staffCap.mirror = true;
        setRotation(staffCap, 0F, 0F, 0F);
        staffProng3 = new ModelRenderer(this, 40, 20);
        staffProng3.addBox(1F, -7F, -3F, 1, 2, 1);
        staffProng3.setRotationPoint(5F, 2F, 0F);
        staffProng3.setTextureSize(64, 32);
        staffProng3.mirror = true;
        setRotation(staffProng3, 0F, 0F, 0F);
        staffProng1 = new ModelRenderer(this, 40, 20);
        staffProng1.addBox(4F, -7F, -6F, 1, 2, 1);
        staffProng1.setRotationPoint(5F, 2F, 0F);
        staffProng1.setTextureSize(64, 32);
        staffProng1.mirror = true;
        setRotation(staffProng1, 0F, 0F, 0F);
        staffProng4 = new ModelRenderer(this, 40, 20);
        staffProng4.addBox(1F, -7F, -6F, 1, 2, 1);
        staffProng4.setRotationPoint(5F, 2F, 0F);
        staffProng4.setTextureSize(64, 32);
        staffProng4.mirror = true;
        setRotation(staffProng4, 0F, 0F, 0F);
        head = new ModelRenderer(this, 0, 0);
        head.addBox(-3F, -6F, -3F, 6, 6, 6);
        head.setRotationPoint(0F, -5F, -1F);
        head.setTextureSize(64, 32);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        ray2 = new ModelRenderer(this, 0, 23);
        ray2.addBox(-7F, -1F, -1F, 2, 2, 2);
        ray2.setRotationPoint(0F, -9F, -1F);
        ray2.setTextureSize(64, 32);
        ray2.mirror = true;
        setRotation(ray2, 0F, 0F, 0F);
        ray1 = new ModelRenderer(this, 0, 23);
        ray1.addBox(-1F, 6F, -1F, 2, 2, 2);
        ray1.setRotationPoint(0F, -9F, -1F);
        ray1.setTextureSize(64, 32);
        ray1.mirror = true;
        setRotation(ray1, 0F, 0F, 0F);
        ray4 = new ModelRenderer(this, 0, 23);
        ray4.addBox(5F, -1F, -1F, 2, 2, 2);
        ray4.setRotationPoint(0F, -9F, -1F);
        ray4.setTextureSize(64, 32);
        ray4.mirror = true;
        setRotation(ray4, 0F, 0F, 0F);
        ray3 = new ModelRenderer(this, 0, 23);
        ray3.addBox(-1F, -7F, -1F, 2, 2, 2);
        ray3.setRotationPoint(0F, -9F, -1F);
        ray3.setTextureSize(64, 32);
        ray3.mirror = true;
        setRotation(ray3, 0F, 0F, 0F);
    }

    @Override
    public void setRotationAngles(Mage entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
        super.setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);

        this.ray1.rotateAngleZ = this.ray2.rotateAngleZ = this.ray3.rotateAngleZ = this.ray4.rotateAngleZ = ageInTicks / 10;
        this.leftleg.rotateAngleX = this.rightarm.rotateAngleX = MathHelper.cos(limbSwing) * limbSwingAmount * 1.2f;
        this.rightleg.rotateAngleX = this.leftarm.rotateAngleX = this.staffPole.rotateAngleX = this.staffCap.rotateAngleX = this.staffProng1.rotateAngleX =
                this.staffProng2.rotateAngleX = this.staffProng3.rotateAngleX = this.staffProng4.rotateAngleX = MathHelper.cos(limbSwing + (float) Math.PI) * limbSwingAmount * 1.2f;

    }
}
