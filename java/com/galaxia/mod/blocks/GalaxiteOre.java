package com.galaxia.mod.blocks;

import java.util.Random;

import com.galaxia.mod.Galaxia;
import com.galaxia.mod.init.ItemMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class GalaxiteOre extends Block {

	public GalaxiteOre(String name, Material materialIn) 
	{
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setResistance(2.0F);
	    setHardness(0.5F);
	    setCreativeTab(Galaxia.galaxiatab);		
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ItemMod.galaxite_ingot;
    }

}
