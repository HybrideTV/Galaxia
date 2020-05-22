package com.galaxia.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGalaxiaDragon extends ModelBase
{
  //fields
    ModelRenderer WolfHead;
    ModelRenderer Body;
    ModelRenderer Mane;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Tail;
    ModelRenderer Ear2;
  
  public ModelGalaxiaDragon()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      WolfHead = new ModelRenderer(this, 0, 0);
      WolfHead.addBox(-3F, -6F, -2F, 6, 5, 6);
      WolfHead.setRotationPoint(-1F, 9.5F, -9F);
      WolfHead.setTextureSize(64, 64);
      WolfHead.mirror = true;
      setRotation(WolfHead, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 18, 14);
      Body.addBox(-4F, -2F, -3F, 6, 9, 6);
      Body.setRotationPoint(0F, 14F, 2F);
      Body.setTextureSize(64, 64);
      Body.mirror = true;
      setRotation(Body, 1.570796F, 0F, 0F);
      Mane = new ModelRenderer(this, 21, 0);
      Mane.addBox(-3F, -4F, -3F, 6, 6, 6);
      Mane.setRotationPoint(-1F, 10F, -2F);
      Mane.setTextureSize(64, 64);
      Mane.mirror = true;
      setRotation(Mane, 1.570796F, 0F, 0F);
      Leg1 = new ModelRenderer(this, 0, 18);
      Leg1.addBox(-1F, 0F, -1F, 2, 4, 2);
      Leg1.setRotationPoint(-2.5F, 16F, 7F);
      Leg1.setTextureSize(64, 64);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 0, 18);
      Leg2.addBox(-1F, 0F, -1F, 2, 4, 2);
      Leg2.setRotationPoint(0.5F, 16F, 7F);
      Leg2.setTextureSize(64, 64);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0F);
      Leg3 = new ModelRenderer(this, 0, 18);
      Leg3.addBox(-1F, 0F, -1F, 2, 4, 2);
      Leg3.setRotationPoint(-2.5F, 16F, 3F);
      Leg3.setTextureSize(64, 64);
      Leg3.mirror = true;
      setRotation(Leg3, 0F, 0F, 0F);
      Leg4 = new ModelRenderer(this, 0, 18);
      Leg4.addBox(-1F, 0F, -1F, 2, 4, 2);
      Leg4.setRotationPoint(0.5F, 16F, 3F);
      Leg4.setTextureSize(64, 64);
      Leg4.mirror = true;
      setRotation(Leg4, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 9, 18);
      Tail.addBox(-1F, 0F, -1F, 2, 8, 2);
      Tail.setRotationPoint(-1F, 12F, 8F);
      Tail.setTextureSize(64, 64);
      Tail.mirror = true;
      setRotation(Tail, 1.130069F, 0F, 0F);
      Ear2 = new ModelRenderer(this, 16, 14);
      Ear2.addBox(1F, -5F, 0F, 6, 1, 1);
      Ear2.setRotationPoint(-5F, 13.5F, -7F);
      Ear2.setTextureSize(64, 64);
      Ear2.mirror = true;
      setRotation(Ear2, 0F, 0F, 0F);
      Ear2 = new ModelRenderer(this, 16, 14);
      Ear2.addBox(0F, 0F, 0F, 6, 1, 1);
      Ear2.setRotationPoint(-4F, 10F, 0F);
      Ear2.setTextureSize(64, 64);
      Ear2.mirror = true;
      setRotation(Ear2, 0F, 0F, 0F);
      Ear2 = new ModelRenderer(this, 16, 14);
      Ear2.addBox(0F, 0F, 0F, 6, 1, 1);
      Ear2.setRotationPoint(-4F, 13F, -1F);
      Ear2.setTextureSize(64, 64);
      Ear2.mirror = true;
      setRotation(Ear2, 0F, 0F, 0F);
      Ear2 = new ModelRenderer(this, 16, 14);
      Ear2.addBox(0F, 0F, 0F, 1, 3, 1);
      Ear2.setRotationPoint(0F, 1F, -11F);
      Ear2.setTextureSize(64, 64);
      Ear2.mirror = true;
      setRotation(Ear2, 0F, 0F, 0F);
      Ear2 = new ModelRenderer(this, 16, 14);
      Ear2.addBox(0F, 0F, 0F, 1, 3, 1);
      Ear2.setRotationPoint(-3F, 1F, -11F);
      Ear2.setTextureSize(64, 64);
      Ear2.mirror = true;
      setRotation(Ear2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    WolfHead.render(f5);
    Body.render(f5);
    Mane.render(f5);
    Leg1.render(f5);
    Leg2.render(f5);
    Leg3.render(f5);
    Leg4.render(f5);
    Tail.render(f5);
    Ear2.render(f5);
    Ear2.render(f5);
    Ear2.render(f5);
    Ear2.render(f5);
    Ear2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
