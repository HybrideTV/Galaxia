package com.galaxia.mod.events;

import java.awt.Color;

import org.lwjgl.opengl.GL11;

import com.galaxia.mod.init.ItemMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OverlayUnclaimFinder extends GuiIngame {

	public OverlayUnclaimFinder(Minecraft mcIn) {
		super(mcIn);
		
	}
	
	public static final Minecraft MC = Minecraft.getMinecraft();
 
    @SubscribeEvent
    public static void renderGameOverlayPost(RenderGameOverlayEvent.Post event)
    {
		
    	EntityPlayer player = Minecraft.getMinecraft().player;
    	ItemStack itemInHand = player.inventory.getItemStack();
    	
    	if(event.getType().equals(ElementType.EXPERIENCE)) {
        	if( itemInHand.getItem() == ItemMod.unclaim_finder )
    		{
        		int posX = 0;
        		int posY = 0;
				Minecraft.getMinecraft().fontRenderer.drawString("TEST", posX + 15, posY + 15, 0xffff00);
    		}
    	}
    		
    }
}
