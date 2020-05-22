package com.galaxia.mod.init;


import com.galaxia.mod.References;
import com.galaxia.mod.blocks.AragoniteBlock;
import com.galaxia.mod.blocks.AragoniteOre;
import com.galaxia.mod.blocks.CreediteBlock;
import com.galaxia.mod.blocks.CreediteOre;
import com.galaxia.mod.blocks.DragoniteBlock;
import com.galaxia.mod.blocks.DragoniteOre;
import com.galaxia.mod.blocks.GalaxiteBlock;
import com.galaxia.mod.blocks.GalaxiteOre;
import com.galaxia.mod.blocks.MoonsTearsBlock;
import com.galaxia.mod.machinery.BlockSinteringFurnace;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = References.MODID)

public class BlocksMod {

public static Block galaxite_ore;
public static Block galaxite_block;

public static Block dragonite_ore;
public static Block dragonite_block;

public static Block aragonite_ore;
public static Block aragonite_block;

public static Block creedite_ore;
public static Block creedite_block;

public static Block moons_tears_block;
public static Block sintering_furnace;

public static void init()
{
	galaxite_ore = new GalaxiteOre("galaxite_ore", Material.ROCK);
	galaxite_block = new GalaxiteBlock("galaxite_block", Material.ROCK);
	moons_tears_block = new MoonsTearsBlock("moons_tears_block", Material.ROCK);
	sintering_furnace = new BlockSinteringFurnace("sintering_furnace");
	creedite_ore = new CreediteOre("creedite_ore", Material.ROCK);
	dragonite_ore = new DragoniteOre("dragonite_ore", Material.ROCK);
	dragonite_block = new DragoniteBlock("dragonite_block", Material.ROCK);
	aragonite_ore = new AragoniteOre("aragonite_ore", Material.ROCK);
	aragonite_block = new AragoniteBlock("aragonite_block", Material.ROCK);
	creedite_block = new CreediteBlock("creedite_block", Material.ROCK);

}

@SubscribeEvent
public static void registerBlocks(RegistryEvent.Register<Block> event)
{
	event.getRegistry().registerAll(galaxite_ore);
	event.getRegistry().registerAll(galaxite_block);
	event.getRegistry().registerAll(moons_tears_block);
	event.getRegistry().registerAll(sintering_furnace);
	event.getRegistry().registerAll(creedite_ore);
	event.getRegistry().registerAll(creedite_block);
	event.getRegistry().registerAll(dragonite_ore);
	event.getRegistry().registerAll(dragonite_block);
	event.getRegistry().registerAll(aragonite_ore);
	event.getRegistry().registerAll(aragonite_block);
}

@SubscribeEvent
public static void registerItemBlocks(RegistryEvent.Register<Item> event)
{
	event.getRegistry().registerAll(
			new ItemBlock(dragonite_ore).setRegistryName(dragonite_ore.getRegistryName())
			);
	event.getRegistry().registerAll(
			new ItemBlock(dragonite_block).setRegistryName(dragonite_block.getRegistryName())
			);
	event.getRegistry().registerAll(
			new ItemBlock(aragonite_ore).setRegistryName(aragonite_ore.getRegistryName())
			);
	event.getRegistry().registerAll(
			new ItemBlock(aragonite_block).setRegistryName(aragonite_block.getRegistryName())
			);
	event.getRegistry().registerAll(
			new ItemBlock(galaxite_ore).setRegistryName(galaxite_ore.getRegistryName())
			);
	event.getRegistry().registerAll(
			new ItemBlock(galaxite_block).setRegistryName(galaxite_block.getRegistryName())
			);
	event.getRegistry().registerAll(
			new ItemBlock(moons_tears_block).setRegistryName(moons_tears_block.getRegistryName())
			);
	event.getRegistry().registerAll(
			new ItemBlock(sintering_furnace).setRegistryName(sintering_furnace.getRegistryName())
			);
	event.getRegistry().registerAll(
			new ItemBlock(creedite_ore).setRegistryName(creedite_ore.getRegistryName())
			);
	event.getRegistry().registerAll(
			new ItemBlock(creedite_block).setRegistryName(creedite_block.getRegistryName())
			);
}

@SubscribeEvent
public static void registerRenders(ModelRegistryEvent event)
{
	registerRender(Item.getItemFromBlock(dragonite_ore));
	registerRender(Item.getItemFromBlock(dragonite_block));
	registerRender(Item.getItemFromBlock(aragonite_ore));
	registerRender(Item.getItemFromBlock(aragonite_block));
	registerRender(Item.getItemFromBlock(galaxite_ore));
	registerRender(Item.getItemFromBlock(galaxite_block));
	registerRender(Item.getItemFromBlock(moons_tears_block));
	registerRender(Item.getItemFromBlock(sintering_furnace));
	registerRender(Item.getItemFromBlock(creedite_ore));
	registerRender(Item.getItemFromBlock(creedite_block));
}

private static void registerRender(Item item)
{
	ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "Inventory"));
}
}