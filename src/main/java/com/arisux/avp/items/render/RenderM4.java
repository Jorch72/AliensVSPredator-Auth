package com.arisux.avp.items.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import com.arisux.airi.lib.RenderLib;
import com.arisux.airi.lib.RenderLib.PlayerResourceManager.PlayerResource;
import com.arisux.airi.lib.render.ItemRenderer3D;
import com.arisux.avp.AliensVsPredator;
import com.arisux.avp.items.model.ModelM4;

public class RenderM4 extends ItemRenderer3D
{
	public static final ResourceLocation resourceLocation = new ResourceLocation(AliensVsPredator.INSTANCE.properties.TEXTURE_PATH_M4);

	public RenderM4()
	{
		super(new ModelM4(), resourceLocation);
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data)
	{
		super.renderItem(type, item, data);
	}

	@Override
	public void renderThirdPerson(ItemStack item, Object... data)
	{
		GL11.glPushMatrix();

		PlayerResource player = resourceManager.createPlayerResource(((EntityPlayer) data[1]).getCommandSenderName());
		this.resource = RenderLib.downloadResource(String.format(AliensVsPredator.INSTANCE.properties.URL_SKIN_M4, player.getUUID()), resourceLocation);

		if (player != null)
		{
			Minecraft.getMinecraft().renderEngine.bindTexture(RenderLib.downloadResource(String.format(AliensVsPredator.INSTANCE.properties.URL_SKIN_M4, player.getUUID()), resourceLocation, false));
			GL11.glTranslatef(0.2F, 1.15F, 0.25F);
			GL11.glRotatef(97.0F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(130.0F, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(80.0F, 0.0F, 0.0F, 1.0F);
			GL11.glDisable(GL11.GL_CULL_FACE);
			float glScale = 1.2F;
			GL11.glScalef(glScale, glScale, glScale);
			this.getModel().render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		}
		GL11.glPopMatrix();
	}

	@Override
	public void renderFirstPerson(ItemStack item, Object... data)
	{
		GL11.glPushMatrix();

		this.resource = RenderLib.downloadResource(String.format(AliensVsPredator.INSTANCE.properties.URL_SKIN_M4, Minecraft.getMinecraft().session.getPlayerID()), resourceLocation);
		Minecraft.getMinecraft().renderEngine.bindTexture(getResourceLocation());

		if (Mouse.isButtonDown(0) && Minecraft.getMinecraft().inGameHasFocus)
		{
			if ((EntityPlayer) data[1] == Minecraft.getMinecraft().renderViewEntity && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0 && (!(Minecraft.getMinecraft().currentScreen instanceof GuiInventory) && !(Minecraft.getMinecraft().currentScreen instanceof GuiContainerCreative) || RenderManager.instance.playerViewY != 180.0F))
			{
				GL11.glTranslatef(0.3F, 2.0F, -0.409F);
				GL11.glRotatef(103.0F, 1.0F, 0.0F, 0.0F);
				GL11.glRotatef(114.0F, 0.0F, 1.0F, 0.0F);
				GL11.glRotatef(78.0F, 0.0F, 0.0F, 1.0F);
				GL11.glDisable(GL11.GL_CULL_FACE);
				GL11.glTranslatef(0.0F, 0.0F, -0.46F);
			}
		} else if ((EntityPlayer) data[1] == Minecraft.getMinecraft().renderViewEntity && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0 && (!(Minecraft.getMinecraft().currentScreen instanceof GuiInventory) && !(Minecraft.getMinecraft().currentScreen instanceof GuiContainerCreative) || RenderManager.instance.playerViewY != 180.0F))
		{
			GL11.glTranslatef(0.6F, 1.85F, 0.9F);
			GL11.glRotatef(95.0F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(120.0F, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(80.0F, 0.0F, 0.0F, 1.0F);
			GL11.glDisable(GL11.GL_CULL_FACE);
		}

		float glScale = 2.0F;
		GL11.glScalef(glScale, glScale, glScale);
		this.getModel().render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}

	@Override
	public void renderInInventory(ItemStack item, Object... data)
	{
		GL11.glPushMatrix();

		this.resource = RenderLib.downloadResource(String.format(AliensVsPredator.INSTANCE.properties.URL_SKIN_M4, Minecraft.getMinecraft().session.getPlayerID()), resourceLocation);
		Minecraft.getMinecraft().renderEngine.bindTexture(getResourceLocation());
		GL11.glDisable(GL11.GL_CULL_FACE);
		GL11.glRotatef(0F, 1.0F, 0.0F, 0.0F);
		GL11.glRotatef(-40F, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(0F, 0.0F, 0.0F, 1.0F);
		GL11.glTranslatef(0F, -5.77F, -20.85F);
		float glScale = 20F;
		GL11.glScalef(glScale, glScale, glScale);
		this.getModel().render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

		GL11.glPopMatrix();
	}
}
