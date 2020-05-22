package com.galaxia.mod.entity;

import com.galaxia.mod.References;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGalaxiaDragon extends RenderLiving<EntityGalaxiaDragon>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(References.MODID + ":textures/entity/galaxiadragon/galaxiadragon.png");
	
	public RenderGalaxiaDragon(RenderManager manager) 
	{
		super(manager, new ModelGalaxiaDragon(), 0.2f);
	}
	
	protected ResourceLocation getEntityTexture(EntityGalaxiaDragon entity) 
	{
		return TEXTURE;
	}

}