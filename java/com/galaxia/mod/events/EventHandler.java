package com.galaxia.mod.events;

import net.minecraftforge.common.MinecraftForge;
import com.galaxia.mod.events.*;

public class EventHandler {
	public static void registerEvents()
	{
		LootTableChicken lootEvent = new LootTableChicken();	
		MinecraftForge.EVENT_BUS.register(lootEvent);
		
	}
}
