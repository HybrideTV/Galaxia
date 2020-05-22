package com.galaxia.mod.machinery;

import java.io.File;

import com.galaxia.mod.Galaxia;
import com.galaxia.mod.References;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ModConfiguration 
{
	public static Configuration config;
	
	public static int GUI_SINTERING_FURNACE_ID = 1;
	
	public static boolean spawnCustomBiomesInOverworld = true;
	
	public static void init(File file)
	{
		config = new Configuration(file);
		
		String category;
		
		category = "Entity IDs";
		config.addCustomCategoryComment(category, "Set the ID's for the entities to ensure that they don't clash with other mod's ids");
		
		category = "GUI IDs";
		config.addCustomCategoryComment(category, "Set the ID's for the GUI's to ensure that they don't clash with other mod's ids");
		GUI_SINTERING_FURNACE_ID = config.getInt("GUI_SINTERING_FURNACE_ID", category, 1, 1, 999, "Set the ID for the Sintering Furnace (Non-Electric)");

	}
	
	public static void registerConfig(FMLPreInitializationEvent event)
	{
		Galaxia.config = new File(event.getModConfigurationDirectory() + "/" + References.MODID);
		Galaxia.config.mkdirs();
		init(new File(Galaxia.config.getPath(), References.MODID + ".cfg"));
	}
} 
