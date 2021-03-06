package divinerpg.objects.blocks.tile.model.statue;

import org.lwjgl.opengl.GL11;

import divinerpg.client.render.DivineModel;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelParasectaStatue extends DivineModel {
    ModelRenderer foot6;
    ModelRenderer wing2;
    ModelRenderer wing1;
    ModelRenderer body;
    ModelRenderer leg6;
    ModelRenderer foot4;
    ModelRenderer leg4;
    ModelRenderer foot5;
    ModelRenderer leg5;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer foot1;
    ModelRenderer foot2;
    ModelRenderer foot3;
    ModelRenderer tusk1;
    ModelRenderer head;
    ModelRenderer tusk2;

    public ModelParasectaStatue() {
        super("statueParasecta", 64, 32);
        textureWidth = 128;
        textureHeight = 32;

        foot6 = new ModelRenderer(this, 15, 17);
        foot6.addBox(-5F, -1F, -7F, 2, 9, 1);
        foot6.setRotationPoint(-3F, 13F, 11F);
        foot6.setTextureSize(128, 32);
        foot6.mirror = true;
        setRotation(foot6, 0F, 0F, -0.4363323F);
        wing2 = new ModelRenderer(this, 0, 0);
        wing2.addBox(-14F, 0F, -5F, 14, 1, 10);
        wing2.setRotationPoint(-10F, 0F, 0F);
        wing2.setTextureSize(128, 32);
        wing2.mirror = true;
        setRotation(wing2, -0.7330383F, 0F, 0F);
        wing1 = new ModelRenderer(this, 0, 0);
        wing1.addBox(0F, 0F, -5F, 14, 1, 10);
        wing1.setRotationPoint(10F, 0F, 0F);
        wing1.setTextureSize(128, 32);
        wing1.mirror = true;
        setRotation(wing1, -0.7330383F, 0F, 0F);
        body = new ModelRenderer(this, 78, 0);
        body.addBox(-6F, -10F, -7F, 20, 22, 5);
        body.setRotationPoint(-4F, -3F, 2F);
        body.setTextureSize(128, 32);
        body.mirror = true;
        setRotation(body, 0.8644027F, 0F, 0F);
        leg6 = new ModelRenderer(this, 0, 14);
        leg6.addBox(-6F, -10F, -7F, 4, 12, 3);
        leg6.setRotationPoint(-3F, 15F, 10F);
        leg6.setTextureSize(128, 32);
        leg6.mirror = true;
        setRotation(leg6, 0F, 0F, 0F);
        foot4 = new ModelRenderer(this, 15, 17);
        foot4.addBox(-5F, -1F, -7F, 2, 9, 1);
        foot4.setRotationPoint(-3F, 6F, 1F);
        foot4.setTextureSize(128, 32);
        foot4.mirror = true;
        setRotation(foot4, 0F, 0F, -0.4363323F);
        leg4 = new ModelRenderer(this, 0, 14);
        leg4.addBox(-6F, -10F, -7F, 4, 12, 3);
        leg4.setRotationPoint(-3F, 8F, 0F);
        leg4.setTextureSize(128, 32);
        leg4.mirror = true;
        setRotation(leg4, 0F, 0F, 0F);
        foot5 = new ModelRenderer(this, 15, 17);
        foot5.addBox(-5F, -1F, -7F, 2, 9, 1);
        foot5.setRotationPoint(-3F, 10F, 6F);
        foot5.setTextureSize(128, 32);
        foot5.mirror = true;
        setRotation(foot5, 0F, 0F, -0.4363323F);
        leg5 = new ModelRenderer(this, 0, 14);
        leg5.addBox(-6F, -10F, -7F, 4, 12, 3);
        leg5.setRotationPoint(-3F, 12F, 5F);
        leg5.setTextureSize(128, 32);
        leg5.mirror = true;
        setRotation(leg5, 0F, 0F, 0F);
        leg1 = new ModelRenderer(this, 0, 14);
        leg1.addBox(-6F, -10F, -7F, 4, 12, 3);
        leg1.setRotationPoint(11F, 8F, 0F);
        leg1.setTextureSize(128, 32);
        leg1.mirror = true;
        setRotation(leg1, 0F, 0F, 0F);
        leg2 = new ModelRenderer(this, 0, 14);
        leg2.addBox(-6F, -10F, -7F, 4, 12, 3);
        leg2.setRotationPoint(11F, 12F, 5F);
        leg2.setTextureSize(128, 32);
        leg2.mirror = true;
        setRotation(leg2, 0F, 0F, 0F);
        leg3 = new ModelRenderer(this, 0, 14);
        leg3.addBox(-6F, -10F, -7F, 4, 12, 3);
        leg3.setRotationPoint(11F, 15F, 10F);
        leg3.setTextureSize(128, 32);
        leg3.mirror = true;
        setRotation(leg3, 0F, 0F, 0F);
        foot1 = new ModelRenderer(this, 15, 17);
        foot1.addBox(-5F, -1F, -7F, 2, 9, 1);
        foot1.setRotationPoint(11F, 9F, 1F);
        foot1.setTextureSize(128, 32);
        foot1.mirror = true;
        setRotation(foot1, 0F, 0F, 0.4363323F);
        foot2 = new ModelRenderer(this, 15, 17);
        foot2.addBox(-5F, -1F, -7F, 2, 9, 1);
        foot2.setRotationPoint(11F, 13F, 6F);
        foot2.setTextureSize(128, 32);
        foot2.mirror = true;
        setRotation(foot2, 0F, 0F, 0.4363323F);
        foot3 = new ModelRenderer(this, 15, 17);
        foot3.addBox(-5F, -1F, -7F, 2, 9, 1);
        foot3.setRotationPoint(11F, 16F, 11F);
        foot3.setTextureSize(128, 32);
        foot3.mirror = true;
        setRotation(foot3, 0F, 0F, 0.4363323F);
        tusk1 = new ModelRenderer(this, 47, 16);
        tusk1.addBox(0F, 0.5333334F, 0F, 1, 3, 1);
        tusk1.setRotationPoint(2F, 0F, -13F);
        tusk1.setTextureSize(128, 32);
        tusk1.mirror = true;
        setRotation(tusk1, 0F, 0F, 0.1396263F);
        head = new ModelRenderer(this, 48, 0);
        head.addBox(-4F, -4F, -6F, 8, 8, 6);
        head.setRotationPoint(0F, -3F, -8F);
        head.setTextureSize(128, 32);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        tusk2 = new ModelRenderer(this, 47, 16);
        tusk2.addBox(-1F, 0.5333334F, 0F, 1, 3, 1);
        tusk2.setRotationPoint(-2F, 0F, -13F);
        tusk2.setTextureSize(128, 32);
        tusk2.mirror = true;
        setRotation(tusk2, 0F, 0F, -0.1396263F);
    }

    @Override
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7) {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7, var1);
    }

    @Override
    public void render(float scale) {
        this.setRotationAngles(0, 0, 0, 0, 0, 0, null);
        GL11.glPushMatrix();
        GL11.glScalef(2, 2, 2);
        //      GL11.glTranslatef(0.0625f, -0.8125f, 0.25f);
        GL11.glTranslatef(0.0625f, -0f, 0.25f);
        this.foot6.render(scale / 2);
        this.wing2.render(scale / 2);
        this.wing1.render(scale / 2);
        this.body.render(scale / 2);
        this.leg6.render(scale / 2);
        this.foot4.render(scale / 2);
        this.leg4.render(scale / 2);
        this.foot5.render(scale / 2);
        this.leg5.render(scale / 2);
        this.leg1.render(scale / 2);
        this.leg2.render(scale / 2);
        this.leg3.render(scale / 2);
        this.foot1.render(scale / 2);
        this.foot2.render(scale / 2);
        this.foot3.render(scale / 2);
        this.tusk1.render(scale / 2);
        this.head.render(scale / 2);
        this.tusk2.render(scale / 2);
        GL11.glPopMatrix();
    }

    @Override
    protected void setRotation(ModelRenderer var1, float var2, float var3, float var4) {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    @Override
    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6, Entity e) {
        super.setRotationAngles(var1, var2, var3, var4, var5, var6, e);
        this.leg1.rotateAngleX = this.leg3.rotateAngleX = (float) (Math.PI / 12);
        this.leg2.rotateAngleX = this.leg4.rotateAngleX = -(float) (Math.PI / 12);
    }
}