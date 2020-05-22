package com.galaxia.mod.items;

import com.galaxia.mod.Galaxia;

import net.minecraft.item.Item;

public class ItemAragoniteIngot extends Item {
	public ItemAragoniteIngot(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Galaxia.galaxiatab);
	}

}
