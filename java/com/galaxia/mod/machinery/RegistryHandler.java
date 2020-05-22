package com.galaxia.mod.machinery;

import com.galaxia.mod.Galaxia;
import com.galaxia.mod.events.EventHandler;
import com.galaxia.mod.events.OverlayUnclaimFinder;
import com.galaxia.mod.init.EntityInit;

import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@EventBusSubscriber
public class RegistryHandler 
{

	@SubscribeEvent
	public static void registerEnchantment(RegistryEvent.Register<Enchantment> event)
	{
	}
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event)
	{		
		
	}
	
	public static void preInitRegistries(FMLPreInitializationEvent event)
	{

		RenderHandler.registerEntityRenders();
		ModConfiguration.registerConfig(event);
		EventHandler.registerEvents();
		EntityInit.registerEntities();
	}
	
	public static void initRegistries(FMLInitializationEvent event)
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(Galaxia.instance, new GuiHandler());
		SoundsHandler.registerSounds();		
		
	}
	
	public static void postInitRegistries(FMLPostInitializationEvent event)
	{
		
	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{

	}
}
