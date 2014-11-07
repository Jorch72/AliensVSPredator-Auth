package com.arisux.avp.enums;

import static com.arisux.airi.lib.RenderLib.*;
import static org.lwjgl.opengl.GL11.*;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraftforge.client.event.RenderLivingEvent;

import org.lwjgl.opengl.GL11;

import com.arisux.airi.AIRI;
import com.arisux.avp.entities.mob.render.RenderXenomorph;
import com.arisux.avp.event.render.VisionModeRenderEvent;

public enum VisionMode
{
	NORMAL(0, "Normal", 0xFFFF0000)
	{
		@Override
		public void render(Object... data)
		{
			AIRI.instance().global.gammaValue = 0F;
			renderOverlay(VisionModeRenderEvent.resOverlayCeltic, 1F, 0F, 0F, 1F);
		}

		@Override
		public void renderEntityPre(RenderLivingEvent.Pre event)
		{
			;
		}

		@Override
		public void renderEntityPost(RenderLivingEvent.Post event)
		{
			;
		}
	},
	XENO(1, "Xenomorph", 0xFF00FF00)
	{
		@Override
		public void render(Object... data)
		{
			boolean isDay = (Minecraft.getMinecraft().thePlayer.worldObj.getWorldTime() % 24000L) / 1000L < 11L;
			AIRI.instance().global.gammaValue = isDay ? -60F : 0F;

			GL11.glPushMatrix();
			{
				glEnable(GL_BLEND);
				glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
				glBlendFunc(GL_ONE_MINUS_DST_COLOR, GL_ZERO);
				glDisable(GL_ALPHA_TEST);
				bindTexture(VisionModeRenderEvent.resOverlayCeltic);
				glColor4f(0F, 1F, 0.1F, 0F);
				drawQuad(0, 0, scaledDisplayResolution().getScaledWidth(), scaledDisplayResolution().getScaledHeight(), 0, 0, 0, 0);
				glColor4f(0F, 1F, 0F, 1F);
				drawQuad(0, 0, scaledDisplayResolution().getScaledWidth(), scaledDisplayResolution().getScaledHeight(), 0, 0, 0, 0);
				glEnable(GL_ALPHA_TEST);
				glDisable(GL_BLEND);
				glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			}
			GL11.glPopMatrix();

			AIRI.INSTANCE.global.gammaValue = AIRI.INSTANCE.global.gammaValue < 0F ? AIRI.INSTANCE.global.gammaValue + 0.03F : AIRI.INSTANCE.global.gammaValue;
			renderOverlay(VisionModeRenderEvent.resOverlayCeltic, 1F, 1F, 1F, 1F);
		}

		@Override
		public void renderEntityPre(RenderLivingEvent.Pre event)
		{
			if (event.renderer instanceof RenderXenomorph)
			{
				glDisableLight();
				glDisableLightMapping();
				glColorHexRGB(0xFF00FF00);
			}
		}

		@Override
		public void renderEntityPost(RenderLivingEvent.Post event)
		{
			if (event.renderer instanceof RenderXenomorph)
			{
				glEnableLight();
				glEnableLightMapping();
			}
		}
	},
	THERMAL(2, "Thermal", 0xFFFF0000)
	{
		@Override
		public void render(Object... data)
		{
			boolean isDay = (Minecraft.getMinecraft().thePlayer.worldObj.getWorldTime() % 24000L) / 1000L < 11L;
			AIRI.instance().global.gammaValue = isDay ? -60F : 0F;

			GL11.glPushMatrix();
			{
				glEnable(GL_BLEND);
				glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
				glBlendFunc(GL_ONE_MINUS_DST_COLOR, GL_ZERO);
				glDisable(GL_ALPHA_TEST);
				bindTexture(VisionModeRenderEvent.resOverlayCeltic);
				glColor4f(1F, 1F, 0F, 0F);
				drawQuad(0, 0, scaledDisplayResolution().getScaledWidth(), scaledDisplayResolution().getScaledHeight(), 0, 0, 0, 0);
				glColor4f(1F, 1F, 0.45F, 0F);
				drawQuad(0, 0, scaledDisplayResolution().getScaledWidth(), scaledDisplayResolution().getScaledHeight(), 0, 0, 0, 0);
				glEnable(GL_ALPHA_TEST);
				glDisable(GL_BLEND);
				glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			}
			GL11.glPopMatrix();

			AIRI.INSTANCE.global.gammaValue = AIRI.INSTANCE.global.gammaValue < 0F ? AIRI.INSTANCE.global.gammaValue + 0.03F : AIRI.INSTANCE.global.gammaValue;
			renderOverlay(VisionModeRenderEvent.resOverlayCeltic, 0F, 0.8F, 0.1F, 1F);
		}

		@Override
		public void renderEntityPre(RenderLivingEvent.Pre event)
		{
			if (event.entity.getCreatureAttribute() != EnumCreatureAttribute.UNDEAD && !(event.renderer instanceof RenderXenomorph))
			{
				glDisableLight();
				glDisableLightMapping();
				glColorHexRGB(0xFFFF0000);
			}
		}

		@Override
		public void renderEntityPost(RenderLivingEvent.Post event)
		{
			if (event.entity.getCreatureAttribute() != EnumCreatureAttribute.UNDEAD)
			{
				glEnableLight();
				glEnableLightMapping();
			}
		}
	};

	public int id, color;
	public String modeName;

	VisionMode(int id, String modeName, int statusColor)
	{
		this.id = id;
		this.modeName = modeName;
		this.color = statusColor;
	}

	public static VisionMode get(int id)
	{
		return (VisionMode) VisionMode.values()[id];
	}

	public abstract void render(Object... data);

	public abstract void renderEntityPre(RenderLivingEvent.Pre event);

	public abstract void renderEntityPost(RenderLivingEvent.Post event);
}