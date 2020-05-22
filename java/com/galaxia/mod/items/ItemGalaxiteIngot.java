package com.galaxia.mod.items;

import com.galaxia.mod.Galaxia;

import net.minecraft.item.Item;

public class ItemGalaxiteIngot extends Item {

	public ItemGalaxiteIngot(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Galaxia.galaxiatab);
	}

}
