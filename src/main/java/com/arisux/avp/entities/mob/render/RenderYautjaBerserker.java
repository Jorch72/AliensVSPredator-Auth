package com.arisux.avp.entities.mob.render;

import org.lwjgl.opengl.GL11;

import com.arisux.avp.AliensVsPredator;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderYautjaBerserker extends RenderLiving
{
	public RenderYautjaBerserker(ModelBase mainModel, float shadowSize)
	{
		super(mainModel, shadowSize);
	}

	@Override
	protected void preRenderCallback(EntityLivingBase entityliving, float renderPartialTicks)
	{
		GL11.glScalef(0.85F, 0.85F, 0.85F);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return AliensVsPredator.resources().YAUTJA_BERSERKER;
	}
}
