package com.galaxia.mod.init;

import com.galaxia.mod.Galaxia;
import com.galaxia.mod.References;
import com.galaxia.mod.entity.EntityGalaxiaDragon;
import com.galaxia.mod.events.ConfigHandler;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	public static void registerEntities()
	{
		registerEntity("galaxiadragon", EntityGalaxiaDragon.class, ConfigHandler.ENTITY_GALAXIADRAGON, 50, 24479, 16711745);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(References.MODID + ":" + name), entity, name, id, Galaxia.instance, range, 1, true, color1, color2);
	}
}
