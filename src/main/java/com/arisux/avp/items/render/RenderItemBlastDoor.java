package com.arisux.avp.items.render;

import org.lwjgl.opengl.GL11;

import com.arisux.airi.lib.RenderUtil;
import com.arisux.airi.lib.client.ItemRenderer;
import com.arisux.avp.AliensVsPredator;
import com.arisux.avp.entities.tile.model.ModelBlastdoor;

import net.minecraft.item.ItemStack;

public class RenderItemBlastDoor extends ItemRenderer
{
	public RenderItemBlastDoor()
	{
		super(new ModelBlastdoor(), AliensVsPredator.resources().BLASTDOOR);
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data)
	{
		super.renderItem(type, item, data);
	}

	@Override
	public void renderThirdPerson(ItemStack item, Object... data)
	{
		float glScale = 1F;

		GL11.glRotatef(10F, 0F, 0F, 1F);
		GL11.glRotatef(120F, 0F, 1F, 0F);
		GL11.glTranslatef(-0.6F, 1.4F, 0F);
		GL11.glDisable(GL11.GL_CULL_FACE);
		GL11.glScalef(glScale, -glScale, glScale);
		RenderUtil.bindTexture(this.getResourceLocation());
		((ModelBlastdoor) this.getModel()).render(null, RenderUtil.DEFAULT_BOX_TRANSLATION);
		
	}

	@Override
	public void renderFirstPerson(ItemStack item, Object... data)
	{
		float glScale = 0.8F;

		if (firstPersonRenderCheck(data[1]))
		{
			GL11.glTranslatef(0.1F, 1.0F, 0.2F);
			GL11.glRotatef(95.0F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(120.0F, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(79.0F, 0.0F, 0.0F, 1.0F);
			GL11.glDisable(GL11.GL_CULL_FACE);
			GL11.glScalef(glScale, glScale, glScale);
			RenderUtil.bindTexture(this.getResourceLocation());
			((ModelBlastdoor) this.getModel()).render(null, RenderUtil.DEFAULT_BOX_TRANSLATION);
		}
	}

	@Override
	public void renderInInventory(ItemStack item, Object... data)
	{
		float glScale = 5F;
		RenderUtil.glBlendClear();
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glTranslatef(8F, 7.5F, 0F);
		GL11.glRotatef(rotation, 0.0F, 1.0F, 0.0F);
		GL11.glTranslatef(7.5F, 0F, 0F);
		GL11.glRotatef(-180F, 0.0F, 1.0F, 0.0F);
		GL11.glDisable(GL11.GL_CULL_FACE);
		GL11.glScalef(glScale, glScale, glScale);
		RenderUtil.bindTexture(this.getResourceLocation());
		RenderUtil.glEnableLight();
		((ModelBlastdoor) this.getModel()).render(null, RenderUtil.DEFAULT_BOX_TRANSLATION);
		RenderUtil.glDisableLight();
	}
}
