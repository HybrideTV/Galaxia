package com.galaxia.mod.init;

import com.galaxia.mod.Galaxia;
import com.galaxia.mod.References;
import com.galaxia.mod.items.AragoniteBoots;
import com.galaxia.mod.items.AragoniteHelmet;
import com.galaxia.mod.items.DragoniteHelmet;
import com.galaxia.mod.items.GalaxiteHelmet;
import com.galaxia.mod.items.ItemAragoniteApple;
import com.galaxia.mod.items.ItemAragoniteAxe;
import com.galaxia.mod.items.ItemAragoniteIngot;
import com.galaxia.mod.items.ItemAragonitePickaxe;
import com.galaxia.mod.items.ItemAragoniteShovel;
import com.galaxia.mod.items.ItemAragoniteSword;
import com.galaxia.mod.items.ItemCreediteIngot;
import com.galaxia.mod.items.ItemDragoniteApple;
import com.galaxia.mod.items.ItemDragoniteAxe;
import com.galaxia.mod.items.ItemDragoniteIngot;
import com.galaxia.mod.items.ItemDragoniteNugget;
import com.galaxia.mod.items.ItemDragonitePickaxe;
import com.galaxia.mod.items.ItemDragoniteShovel;
import com.galaxia.mod.items.ItemDragoniteSword;
import com.galaxia.mod.items.ItemGalaxiteApple;
import com.galaxia.mod.items.ItemGalaxiteAxe;
import com.galaxia.mod.items.ItemGalaxiteIngot;
import com.galaxia.mod.items.ItemGalaxitePickaxe;
import com.galaxia.mod.items.ItemGalaxiteShovel;
import com.galaxia.mod.items.ItemGalaxiteSword;
import com.galaxia.mod.items.ItemMoonsTears;
import com.galaxia.mod.items.ItemPerfectOre;
import com.galaxia.mod.items.ItemPerfectOreNugget;
import com.galaxia.mod.items.ItemUnclaimFinder;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=References.MODID)
public class ItemMod {
	
	// NIVEAU DE MINAGE 3 = DIAMAND  ;  DURABILITE - 1  ;  X.XF : VITESSE DE RECOLTE   ;   X.XF : DEGATS EN DEMI COEUR    ;   NIVEAU D ENCHANTEMENT
	public static ToolMaterial toolgalaxite = EnumHelper.addToolMaterial("toolgalaxite", 3, 1399, 7.0F, 2.0F, 18);
	public static final ArmorMaterial armorgalaxite = EnumHelper.addArmorMaterial("armorgalaxite", References.MODID + ":galaxite", 14, new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);

	public static ToolMaterial tooldragonite = EnumHelper.addToolMaterial("tooldragonite", 3, 1299, 7.0F, 2.0F, 18);
	public static final ArmorMaterial armordragonite = EnumHelper.addArmorMaterial("armordragonite", References.MODID + ":dragonite", 14, new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	public static ToolMaterial toolaragonite = EnumHelper.addToolMaterial("toolaragonite", 3, 1399, 7.0F, 2.0F, 18);
	public static final ArmorMaterial armoraragonite = EnumHelper.addArmorMaterial("armoraragonite", References.MODID + ":aragonite", 14, new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	public static Item unclaim_finder;
	
	public static Item moons_tears;
	public static Item perfect_ore;
	public static Item perfect_ore_nugget;
	public static Item creedite_ingot;
	
	public static Item aragonite_ingot;
	public static Item aragonite_nugget;
	public static Item aragonite_apple;
	public static Item aragonite_sword;
	public static Item aragonite_pickaxe;
	public static Item aragonite_axe;
	public static Item aragonite_shovel;
	public static Item aragonite_helmet;
	public static Item aragonite_chestplate;
	public static Item aragonite_leggings;
	public static Item aragonite_boots;
	
	public static Item dragonite_ingot;
	public static Item dragonite_nugget;
	public static Item dragonite_apple;
	public static Item dragonite_sword;
	public static Item dragonite_pickaxe;
	public static Item dragonite_axe;
	public static Item dragonite_shovel;
	public static Item dragonite_helmet;
	public static Item dragonite_chestplate;
	public static Item dragonite_leggings;
	public static Item dragonite_boots;
	
	public static Item galaxite_ingot;
	public static Item galaxite_apple;
	public static Item galaxite_sword;
	public static Item galaxite_pickaxe;
	public static Item galaxite_axe;
	public static Item galaxite_shovel;
	public static Item galaxite_helmet;
	public static Item galaxite_chestplate;
	public static Item galaxite_leggings;
	public static Item galaxite_boots;
	
	
	public static void init()
	{
		unclaim_finder = new ItemUnclaimFinder("unclaim_finder");
		moons_tears = new ItemMoonsTears("moons_tears");
		perfect_ore = new ItemPerfectOre("perfect_ore");
		perfect_ore_nugget = new ItemPerfectOreNugget("perfect_ore_nugget");
		creedite_ingot = new ItemCreediteIngot("creedite_ingot");
		
		
		dragonite_ingot = new ItemDragoniteIngot("dragonite_ingot");
		dragonite_nugget = new ItemDragoniteNugget("dragonite_nugget");
		dragonite_apple = new ItemDragoniteApple("dragonite_apple", 5, 3, false);
		dragonite_sword = new ItemDragoniteSword(tooldragonite).setRegistryName("dragonite_sword").setUnlocalizedName("dragonite_sword").setCreativeTab(Galaxia.galaxiatab);
		dragonite_pickaxe = new ItemDragonitePickaxe(tooldragonite).setRegistryName("dragonite_pickaxe").setUnlocalizedName("dragonite_pickaxe").setCreativeTab(Galaxia.galaxiatab);
		dragonite_axe = new ItemDragoniteAxe(tooldragonite).setRegistryName("dragonite_axe").setUnlocalizedName("dragonite_axe").setCreativeTab(Galaxia.galaxiatab);
		dragonite_shovel = new ItemDragoniteShovel(tooldragonite).setRegistryName("dragonite_shovel").setUnlocalizedName("dragonite_shovel").setCreativeTab(Galaxia.galaxiatab);
		dragonite_helmet = new DragoniteHelmet("dragonite_helmet", armordragonite, 1, EntityEquipmentSlot.HEAD);
		dragonite_chestplate = new DragoniteHelmet("dragonite_chestplate", armordragonite, 1, EntityEquipmentSlot.CHEST);
		dragonite_leggings = new DragoniteHelmet("dragonite_leggings", armordragonite, 1, EntityEquipmentSlot.LEGS);
		dragonite_boots = new DragoniteHelmet("dragonite_boots", armordragonite, 1, EntityEquipmentSlot.FEET);
		
		
		galaxite_ingot = new ItemGalaxiteIngot("galaxite_ingot");
		galaxite_apple = new ItemGalaxiteApple("galaxite_apple", 3, 3, false);
		galaxite_sword = new ItemGalaxiteSword(toolgalaxite).setRegistryName("galaxite_sword").setUnlocalizedName("galaxite_sword").setCreativeTab(Galaxia.galaxiatab);
		galaxite_pickaxe = new ItemGalaxitePickaxe(toolgalaxite).setRegistryName("galaxite_pickaxe").setUnlocalizedName("galaxite_pickaxe").setCreativeTab(Galaxia.galaxiatab);
		galaxite_axe = new ItemGalaxiteAxe(toolgalaxite).setRegistryName("galaxite_axe").setUnlocalizedName("galaxite_axe").setCreativeTab(Galaxia.galaxiatab);
		galaxite_shovel = new ItemGalaxiteShovel(toolgalaxite).setRegistryName("galaxite_shovel").setUnlocalizedName("galaxite_shovel").setCreativeTab(Galaxia.galaxiatab);
		galaxite_helmet = new GalaxiteHelmet("galaxite_helmet", armorgalaxite, 1, EntityEquipmentSlot.HEAD);
		galaxite_chestplate = new GalaxiteHelmet("galaxite_chestplate", armorgalaxite, 1, EntityEquipmentSlot.CHEST);
		galaxite_leggings = new GalaxiteHelmet("galaxite_leggings", armorgalaxite, 1, EntityEquipmentSlot.LEGS);
		galaxite_boots = new GalaxiteHelmet("galaxite_boots", armorgalaxite, 1, EntityEquipmentSlot.FEET);
		
		
		aragonite_ingot = new ItemAragoniteIngot("aragonite_ingot");
		aragonite_apple = new ItemAragoniteApple("aragonite_apple", 3, 3, false);
		aragonite_sword = new ItemAragoniteSword(toolaragonite).setRegistryName("aragonite_sword").setUnlocalizedName("aragonite_sword").setCreativeTab(Galaxia.galaxiatab);
		aragonite_pickaxe = new ItemAragonitePickaxe(toolaragonite).setRegistryName("aragonite_pickaxe").setUnlocalizedName("aragonite_pickaxe").setCreativeTab(Galaxia.galaxiatab);
		aragonite_axe = new ItemAragoniteAxe(toolaragonite).setRegistryName("aragonite_axe").setUnlocalizedName("aragonite_axe").setCreativeTab(Galaxia.galaxiatab);
		aragonite_shovel = new ItemAragoniteShovel(toolaragonite).setRegistryName("aragonite_shovel").setUnlocalizedName("aragonite_shovel").setCreativeTab(Galaxia.galaxiatab);
		aragonite_helmet = new AragoniteHelmet("aragonite_helmet", armoraragonite, 1, EntityEquipmentSlot.HEAD);
		aragonite_chestplate = new AragoniteHelmet("aragonite_chestplate", armoraragonite, 1, EntityEquipmentSlot.CHEST);
		aragonite_leggings = new AragoniteHelmet("aragonite_leggings", armoraragonite, 1, EntityEquipmentSlot.LEGS);
		aragonite_boots = new AragoniteBoots("aragonite_boots", armoraragonite, 1, EntityEquipmentSlot.FEET);
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(unclaim_finder);
		
		event.getRegistry().registerAll(moons_tears);
		event.getRegistry().registerAll(creedite_ingot);
		event.getRegistry().registerAll(perfect_ore);
		event.getRegistry().registerAll(perfect_ore_nugget);
		//GALAXITE ITEMS
		event.getRegistry().registerAll(galaxite_ingot);
		event.getRegistry().registerAll(galaxite_apple);
		event.getRegistry().registerAll(galaxite_sword);
		event.getRegistry().registerAll(galaxite_pickaxe);
		event.getRegistry().registerAll(galaxite_axe);
		event.getRegistry().registerAll(galaxite_shovel);
		event.getRegistry().registerAll(galaxite_helmet);
		event.getRegistry().registerAll(galaxite_chestplate);
		event.getRegistry().registerAll(galaxite_leggings);
		event.getRegistry().registerAll(galaxite_boots);
		
		//DRAGONITE ITEMS
		event.getRegistry().registerAll(dragonite_ingot);
		event.getRegistry().registerAll(dragonite_nugget);
		event.getRegistry().registerAll(dragonite_apple);
		event.getRegistry().registerAll(dragonite_sword);
		event.getRegistry().registerAll(dragonite_pickaxe);
		event.getRegistry().registerAll(dragonite_axe);
		event.getRegistry().registerAll(dragonite_shovel);
		event.getRegistry().registerAll(dragonite_helmet);
		event.getRegistry().registerAll(dragonite_chestplate);
		event.getRegistry().registerAll(dragonite_leggings);
		event.getRegistry().registerAll(dragonite_boots);
		
		//ARAGONITE ITEMS
		event.getRegistry().registerAll(aragonite_ingot);
		event.getRegistry().registerAll(aragonite_apple);
		event.getRegistry().registerAll(aragonite_sword);
		event.getRegistry().registerAll(aragonite_pickaxe);
		event.getRegistry().registerAll(aragonite_axe);
		event.getRegistry().registerAll(aragonite_shovel);
		event.getRegistry().registerAll(aragonite_helmet);
		event.getRegistry().registerAll(aragonite_chestplate);
		event.getRegistry().registerAll(aragonite_leggings);
		event.getRegistry().registerAll(aragonite_boots);
		
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event)
	{
		registerRender(unclaim_finder);
		
		registerRender(moons_tears);
		registerRender(creedite_ingot);
		registerRender(perfect_ore);
		registerRender(perfect_ore_nugget);
		
		//GALAXITE ITEMS
		registerRender(galaxite_ingot);
		registerRender(galaxite_apple);
		registerRender(galaxite_pickaxe);
		registerRender(galaxite_sword);
		registerRender(galaxite_axe);
		registerRender(galaxite_shovel);
		registerRender(galaxite_helmet);
		registerRender(galaxite_chestplate);
		registerRender(galaxite_leggings);
		registerRender(galaxite_boots);
		
		//DRAGONITE ITEMS
		registerRender(dragonite_ingot);
		registerRender(dragonite_nugget);
		registerRender(dragonite_apple);
		registerRender(dragonite_pickaxe);
		registerRender(dragonite_sword);
		registerRender(dragonite_axe);
		registerRender(dragonite_shovel);
		registerRender(dragonite_helmet);
		registerRender(dragonite_chestplate);
		registerRender(dragonite_leggings);
		registerRender(dragonite_boots);
		
		//ARAGONITE ITEMS
		registerRender(aragonite_ingot);
		registerRender(aragonite_apple);
		registerRender(aragonite_pickaxe);
		registerRender(aragonite_sword);
		registerRender(aragonite_axe);
		registerRender(aragonite_shovel);
		registerRender(aragonite_helmet);
		registerRender(aragonite_chestplate);
		registerRender(aragonite_leggings);
		registerRender(aragonite_boots);
	}
	
	private static void registerRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
