package com.galaxia.mod.items;

import com.galaxia.mod.Galaxia;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemGalaxiteApple extends ItemFood {

	public ItemGalaxiteApple(String name, int amount, float saturation, boolean isWolfFood) 
	{
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Galaxia.galaxiatab);
		
	}
	
	@Override
	public boolean hasEffect(ItemStack stack) 
	{
		return true;
	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) 
	{
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 6000, 1, false, false));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 600, 1, false, false));
		return super.onItemUseFinish(stack, worldIn, entityLiving);
	} 
}