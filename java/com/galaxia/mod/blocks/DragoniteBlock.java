package com.galaxia.mod.blocks;

import com.galaxia.mod.Galaxia;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DragoniteBlock extends Block {

	public DragoniteBlock(String name, Material materialIn) 
	{
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setResistance(2.0F);
	    setHardness(0.5F);
	    setCreativeTab(Galaxia.galaxiatab);		
	}

}