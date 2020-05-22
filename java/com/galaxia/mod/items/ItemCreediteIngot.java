package com.galaxia.mod.items;

import com.galaxia.mod.Galaxia;

import net.minecraft.item.Item;

public class ItemCreediteIngot extends Item {
	public ItemCreediteIngot(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Galaxia.galaxiatab);
	}

}
