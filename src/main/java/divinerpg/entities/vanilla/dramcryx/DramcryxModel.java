package divinerpg.entities.vanilla.dramcryx;

import divinerpg.entities.base.render.DivineModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

public class DramcryxModel<T extends Entity> extends DivineModel<T> {
    ModelRenderer WolfHead;
    ModelRenderer Body;
    ModelRenderer Mane;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Tail;
    ModelRenderer Ear1;
    ModelRenderer Ear2;
    ModelRenderer Nose;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;

    public DramcryxModel() {
        textureWidth = 64;
        textureHeight = 32;
        WolfHead = new ModelRenderer(this, 0, 0);
        WolfHead.func_228300_a_(-3F, -3F, -2F, 10, 9, 4);
        WolfHead.setRotationPoint(-3F, 11.5F, -7F);
        WolfHead.setTextureSize(64, 32);
        WolfHead.mirror = true;
        setRotation(WolfHead, 0F, 0F, 0F);
        Body = new ModelRenderer(this, 18, 14);
        Body.func_228300_a_(-4F, -2F, -3F, 6, 9, 6);
        Body.setRotationPoint(0F, 14F, 2F);
        Body.setTextureSize(64, 32);
        Body.mirror = true;
        setRotation(Body, ((float) Math.PI / 2F), 0F, 0F);
        Mane = new ModelRenderer(this, 21, 0);
        Mane.func_228300_a_(-4F, -3F, -3F, 8, 10, 7);
        Mane.setRotationPoint(-1F, 14F, -2F);
        Mane.setTextureSize(64, 32);
        Mane.mirror = true;
        setRotation(Mane, ((float) Math.PI / 2F), 0F, 0F);
        Leg1 = new ModelRenderer(this, 0, 18);
        Leg1.func_228300_a_(-1F, 0F, -1F, 3, 8, 3);
        Leg1.setRotationPoint(-5.5F, 16F, 7F);
        Leg1.setTextureSize(64, 32);
        Leg1.mirror = true;
        setRotation(Leg1, 0F, 0F, 0F);
        Leg2 = new ModelRenderer(this, 0, 18);
        Leg2.func_228300_a_(-1F, 0F, -1F, 3, 8, 3);
        Leg2.setRotationPoint(2.5F, 16F, 7F);
        Leg2.setTextureSize(64, 32);
        Leg2.mirror = true;
        setRotation(Leg2, 0F, 0F, 0F);
        Leg3 = new ModelRenderer(this, 0, 18);
        Leg3.func_228300_a_(-1F, 0F, -1F, 3, 8, 3);
        Leg3.setRotationPoint(-6.5F, 16F, -4F);
        Leg3.setTextureSize(64, 32);
        Leg3.mirror = true;
        setRotation(Leg3, 0F, 0F, 0F);
        Leg4 = new ModelRenderer(this, 0, 18);
        Leg4.func_228300_a_(-1F, 0F, -1F, 3, 8, 3);
        Leg4.setRotationPoint(3.5F, 16F, -4F);
        Leg4.setTextureSize(64, 32);
        Leg4.mirror = true;
        setRotation(Leg4, 0F, 0F, 0F);
        Tail = new ModelRenderer(this, 22, 13);
        Tail.func_228300_a_(-1F, 0F, -1F, 4, 12, 4);
        Tail.setRotationPoint(-2F, 14F, 7F);
        Tail.setTextureSize(64, 32);
        Tail.mirror = true;
        setRotation(Tail, 1.130069F, 0F, 0F);
        Ear1 = new ModelRenderer(this, 16, 14);
        Ear1.func_228300_a_(-3F, -5F, 0F, 2, 4, 1);
        Ear1.setRotationPoint(-2F, 9.9F, -7F);
        Ear1.setTextureSize(64, 32);
        Ear1.mirror = true;
        setRotation(Ear1, 0.3490659F, 0F, 0F);
        Ear2 = new ModelRenderer(this, 16, 14);
        Ear2.func_228300_a_(1F, -5F, 0F, 2, 4, 1);
        Ear2.setRotationPoint(0F, 9.9F, -7F);
        Ear2.setTextureSize(64, 32);
        Ear2.mirror = true;
        setRotation(Ear2, 0.3490659F, 0F, 0F);
        Nose = new ModelRenderer(this, 0, 20);
        Nose.func_228300_a_(-2F, 0F, -5F, 6, 5, 4);
        Nose.setRotationPoint(-2F, 11.5F, -8F);
        Nose.setTextureSize(64, 32);
        Nose.mirror = true;
        setRotation(Nose, 0F, 0F, 0F);
        Shape1 = new ModelRenderer(this, 52, 15);
        Shape1.func_228300_a_(-1F, -10F, 0F, 2, 10, 4);
        Shape1.setRotationPoint(-1F, 11F, 4F);
        Shape1.setTextureSize(64, 32);
        Shape1.mirror = true;
        setRotation(Shape1, -1.003822F, 0F, 0F);
        Shape2 = new ModelRenderer(this, 52, 15);
        Shape2.func_228300_a_(0F, 0F, 0F, 2, 13, 4);
        Shape2.setRotationPoint(-2F, 0F, 7F);
        Shape2.setTextureSize(64, 32);
        Shape2.mirror = true;
        setRotation(Shape2, -0.6320364F, 0F, 0F);
        Shape3 = new ModelRenderer(this, 52, 15);
        Shape3.func_228300_a_(0F, 0F, 0F, 2, 13, 4);
        Shape3.setRotationPoint(-2F, -2F, -5.466667F);
        Shape3.setTextureSize(64, 32);
        Shape3.mirror = true;
        setRotation(Shape3, 0.1115358F, 0F, 0F);
    }

    @Override
    public void render(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);

        GL11.glScaled(1.5, 1.5, 1.5);
        GL11.glTranslatef(0f, -0.5f, 0f);

        parts.getValue().forEach(x -> x.render(scale));
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        Body.rotateAngleX = ((float) Math.PI / 2F);
        Leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        Leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
        Leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
        Leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }
}
