package com.galaxia.mod.items;

import com.galaxia.mod.Galaxia;
import com.galaxia.mod.init.ItemMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class AragoniteHelmet extends ItemArmor {
	public AragoniteHelmet(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Galaxia.galaxiatab);
		
	}
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{

		if( player.inventory.armorInventory.get(0) != null && player.inventory.armorInventory.get(1) != null && player.inventory.armorInventory.get(2) != null && player.inventory.armorInventory.get(3) != null )
		{

			ItemStack helmet = player.inventory.armorInventory.get(3);

			if( helmet.getItem() == ItemMod.aragonite_helmet )
			{
				player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("night_vision"), 2, 2));
				player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("water_breathing"), 2, 2));
			}
		}
	}


}
