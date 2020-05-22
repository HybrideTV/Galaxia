package com.galaxia.mod.proxy;

import org.lwjgl.opengl.Display;

import net.minecraft.client.Minecraft;

public class ClientProxy extends ServerProxy {
	public void register()
	{
		Display.setTitle("Galaxia" + " - " +Minecraft.getMinecraft().getSession().getUsername());
	}
	
	
}
