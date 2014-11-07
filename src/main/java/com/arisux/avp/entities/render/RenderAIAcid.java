package com.arisux.avp.entities.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.arisux.avp.entities.model.ModelAcid;

public class RenderAIAcid extends Render
{
	ModelAcid model = new ModelAcid();

	/**
	 * Actually renders the given argument. This is a synthetic bridge
	 * method, always casting down its argument and then handing it off to a
	 * worker function which does the actual work. In all probabilty, the
	 * class Render is generic (Render<T extends Entity) and this method has
	 * signature public void doRender(T entity, double d, double d1, double
	 * d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
	 */
	public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9)
	{
		this.renderPlasmoid(var1, var2, var4, var6, var8, var9);
	}

	public void renderPlasmoid(Entity var1, double var2, double var4, double var6, float var8, float var9)
	{
		byte rotation = 20;
		GL11.glPushMatrix();
		GL11.glTranslated(var2, var4, var6);
		GL11.glRotatef(var1.rotationYaw - 90.0F, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(var1.rotationPitch - 90.0F, 0.0F, 0.0F, 1.0F);
		GL11.glScalef(0.1F, 0.4F, 0.1F);
		GL11.glPushMatrix();
		GL11.glRotatef((float) rotation, 0.0F, 1.0F, 0.0F);
		this.model.renderModel(0.6F, 0.45F, 0.45F, 0.5F, 0.7F);
		GL11.glPushMatrix();
		GL11.glRotatef((float) rotation, 0.0F, 1.0F, 0.0F);
		this.model.renderModel(0.7F, 0.45F, 0.45F, 0.5F, 0.7F);
		GL11.glPushMatrix();
		GL11.glRotatef((float) rotation, 0.0F, 1.0F, 0.0F);
		this.model.renderModel(0.8F, 0.45F, 0.45F, 0.5F, 0.7F);
		GL11.glPushMatrix();
		GL11.glRotatef((float) rotation, 0.0F, 1.0F, 0.0F);
		this.model.renderModel(0.9F, 0.45F, 0.45F, 0.5F, 0.7F);
		GL11.glPushMatrix();
		GL11.glRotatef((float) rotation, 0.0F, 1.0F, 0.0F);
		this.model.renderModel(1.0F, 0.45F, 0.45F, 0.5F, 0.7F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
		GL11.glPopMatrix();
		GL11.glPopMatrix();
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be
	 * called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return null;
	}
}
