package com.galaxia.mod.items;

import com.galaxia.mod.Galaxia;

import net.minecraft.item.Item;

public class ItemPerfectOreNugget extends Item {
	public ItemPerfectOreNugget(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Galaxia.galaxiatab);
	}
}
