package com.galaxia.mod.events;

import java.util.Random;

import com.galaxia.mod.init.ItemMod;

import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LootTableChicken 
{
	@SubscribeEvent
	public void customLootTableDrop(LivingDropsEvent event)
	{
		Random rand = new Random();
		if(event.getEntityLiving() instanceof EntityChicken)
		{
			if(rand.nextInt(2) == 0)
			{
				event.getEntityLiving().entityDropItem(new ItemStack(ItemMod.dragonite_nugget), 0.0f);
			}
		}
	}
}
