package com.galaxia.mod;

import com.galaxia.mod.proxy.ServerProxy;
import com.galaxia.mod.world.WorldGenOres;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.io.File;

import com.galaxia.mod.init.BlocksMod;
import com.galaxia.mod.init.ItemMod;
import com.galaxia.mod.machinery.RegistryHandler;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION, acceptedMinecraftVersions = References.MINECRAFT_VERSION)

public class Galaxia {
		
		@Instance(References.MODID)
		public static Galaxia instance;
		public static File config;

		
		@SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY, modId = References.MODID)
		public static ServerProxy proxy;
		public static final CreativeTabs galaxiatab = new galaxiatab("galaxiatab");
		
		@EventHandler
		public void preInit(FMLPreInitializationEvent event)
		{
			ItemMod.init();
			BlocksMod.init();
			RegistryHandler.preInitRegistries(event);
			GameRegistry.registerWorldGenerator(new WorldGenOres(), 3);

		}
		
		@EventHandler
		public void init(FMLInitializationEvent event)
		{
			proxy.register();	
			RegistryHandler.initRegistries(event);
			GameRegistry.addSmelting(new ItemStack(BlocksMod.galaxite_ore), new ItemStack(ItemMod.galaxite_ingot), 1.5F);
		}
		
		@EventHandler
		public void postInit(FMLPostInitializationEvent event)
		{
			RegistryHandler.postInitRegistries(event);
		}
		
		@EventHandler
		public static void serverInit(FMLServerStartingEvent event)
		{
			RegistryHandler.serverRegistries(event);
		}

	}
