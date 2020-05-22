package com.galaxia.mod.machinery;

import com.galaxia.mod.References;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntitySinteringFurnace.class, new ResourceLocation(References.MODID + ":sintering_furnace"));
	}
}
