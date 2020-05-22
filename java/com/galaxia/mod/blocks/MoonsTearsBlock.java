package com.galaxia.mod.blocks;

import com.galaxia.mod.Galaxia;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class MoonsTearsBlock extends Block {
	public MoonsTearsBlock(String name, Material materialIn) 
	{
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setResistance(3.0F);
	    setHardness(1.0F);
	    setCreativeTab(Galaxia.galaxiatab);		
	}
}
