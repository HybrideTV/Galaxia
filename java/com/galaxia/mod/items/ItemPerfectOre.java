package com.galaxia.mod.items;

import com.galaxia.mod.Galaxia;

import net.minecraft.item.Item;

public class ItemPerfectOre extends Item {
	public ItemPerfectOre(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Galaxia.galaxiatab);
	}
}
