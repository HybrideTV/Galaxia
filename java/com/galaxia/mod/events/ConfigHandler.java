package com.galaxia.mod.events;

import java.io.File;

import com.galaxia.mod.Galaxia;
import com.galaxia.mod.References;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler 
{
	public static Configuration config;

	public static int ENTITY_GALAXIADRAGON = 250;
	
	public static void init(File file)
	{
		config = new Configuration(file);
		String category;
		
		category = "Entity IDs";
		config.addCustomCategoryComment(category, "Set IDs for each Entity.");
		ENTITY_GALAXIADRAGON = config.getInt("GalaxiaDragon", category, 250, 250, 500, "Entity GalaxiaDragon ID");
		
		category = "Dimension IDs";
		config.addCustomCategoryComment(category, "Set IDs for each Dimension.");
		
		category = "Miscellaneous";
		config.addCustomCategoryComment(category, "Set Miscellaneous Things.");
		
		config.save();
	}
	
	public static void registerConfig(FMLPreInitializationEvent event)
	{
		Galaxia.config = new File(event.getModConfigurationDirectory() + "/" + References.MODID);
		Galaxia.config.mkdirs();
		init(new File(Galaxia.config.getPath(), References.MODID + ".cfg"));
	}
}
