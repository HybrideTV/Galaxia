package com.galaxia.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class galaxiatab extends CreativeTabs
{
	public galaxiatab(String label) { super("galaxiatab");
	}

	public ItemStack getTabIconItem() { return new ItemStack(Item.getItemFromBlock(Blocks.LIGHT_BLUE_SHULKER_BOX));
		
	}
}

