package com.arisux.avp.entities.render;

import org.lwjgl.opengl.GL11;

import com.arisux.airi.api.wavefrontapi.WavefrontModel.Part;
import com.arisux.avp.AliensVsPredator;
import com.arisux.avp.entities.EntityAPC;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

public class RenderAPC extends Render
{
	public void doRender(EntityAPC entityIn, double posX, double posY, double posZ, float yaw, float partialTicks)
	{
		float time = (float)entityIn.getTimeSinceHit() - partialTicks;
		float damage = entityIn.getDamageTaken() - partialTicks;
		GL11.glPushMatrix();
		{
			GL11.glTranslatef((float)posX, (float)posY - 2.02F, (float)posZ);
			//GL11.glRotatef(180.0F - yaw, 0.0F, 1.0F, 0.0F);
			if (damage < 0.0F)
			{
				damage = 0.0F;
			}

			if (time > 0.0F)
			{
				GL11.glRotatef(MathHelper.sin(time) * time * damage / 10.0F * (float)entityIn.getForwardDirection(), 1.0F, 0.0F, 0.0F);
			}

			float scale = 0.75F;
			GL11.glScalef(scale, scale, scale);
			GL11.glScalef(1.0F / scale, 1.0F / scale, 1.0F / scale);
			GL11.glScalef(-1.0F, -1.0F, 1.0F);

			GL11.glRotatef(-180f, 0f, 0f, 1f);

			//Tire Parts
			Part tire0 = AliensVsPredator.resources().M577_APC.getPart("Mesh75_APCTire1_4_Group10_Model");
			Part tire0Rim = AliensVsPredator.resources().M577_APC.getPart("Mesh76_APCWhAmr4_Group10_Model");
			Part tire0Fin0 = AliensVsPredator.resources().M577_APC.getPart("Mesh77_APCWhPlt10_Group10_Model");
			Part tire0Fin1 = AliensVsPredator.resources().M577_APC.getPart("Mesh78_APCWhPlt10_Group10_Model");
			Part tire0Fin2 = AliensVsPredator.resources().M577_APC.getPart("Mesh79_APCWhPlt10_Group10_Model");
			Part tire0Fin3 = AliensVsPredator.resources().M577_APC.getPart("Mesh80_APCWhPlt10_Group10_Model");
			Part tire0Fin4 = AliensVsPredator.resources().M577_APC.getPart("Mesh81_APCWhPlt10_Group10_Model");
			Part tire0Fin5 = AliensVsPredator.resources().M577_APC.getPart("Mesh82_APCWhPlt11_Group10_Model");
			Part tire0Fin6 = AliensVsPredator.resources().M577_APC.getPart("Mesh83_APCWhPlt11_Group10_Model");
			Part tire0Fin7 = AliensVsPredator.resources().M577_APC.getPart("Mesh84_APCWhPlt11_Group10_Model");
			Part tire0Fin8 = AliensVsPredator.resources().M577_APC.getPart("Mesh85_APCWhPlt11_Group10_Model");
			Part tire0Fin9 = AliensVsPredator.resources().M577_APC.getPart("Mesh86_APCWhPlt11_Group10_Model");
			Part tire0Fin10 = AliensVsPredator.resources().M577_APC.getPart("Mesh87_APCWhPlt12_Group10_Model");
			Part tire0Fin11 = AliensVsPredator.resources().M577_APC.getPart("Mesh88_APCWhPlt12_Group10_Model");
			Part tire0Fin12 = AliensVsPredator.resources().M577_APC.getPart("Mesh89_APCWhPlt12_Group10_Model");
			Part tire0Fin13 = AliensVsPredator.resources().M577_APC.getPart("Mesh90_APCWhPlt12_Group10_Model");
			Part tire0Fin14 = AliensVsPredator.resources().M577_APC.getPart("Mesh91_APCWhPlt12_Group10_Model");

			Part tire1 = AliensVsPredator.resources().M577_APC.getPart("Mesh58_APCTire1_3_Group9_Model");
			Part tire1Rim = AliensVsPredator.resources().M577_APC.getPart("Mesh60_APCWhPlt7_Group9_Model");
			Part tire1Fin0 = AliensVsPredator.resources().M577_APC.getPart("Mesh61_APCWhPlt7_Group9_Model");
			Part tire1Fin1 = AliensVsPredator.resources().M577_APC.getPart("Mesh62_APCWhPlt7_Group9_Model");
			Part tire1Fin2 = AliensVsPredator.resources().M577_APC.getPart("Mesh64_APCWhPlt7_Group9_Model");
			Part tire1Fin3 = AliensVsPredator.resources().M577_APC.getPart("Mesh66_APCWhPlt8_Group9_Model");
			Part tire1Fin4 = AliensVsPredator.resources().M577_APC.getPart("Mesh67_APCWhPlt8_Group9_Model");
			Part tire1Fin5 = AliensVsPredator.resources().M577_APC.getPart("Mesh68_APCWhPlt8_Group9_Model");
			Part tire1Fin6 = AliensVsPredator.resources().M577_APC.getPart("Mesh69_APCWhPlt8_Group9_Model");
			Part tire1Fin7 = AliensVsPredator.resources().M577_APC.getPart("Mesh70_APCWhPlt9_Group9_Model");
			Part tire1Fin8 = AliensVsPredator.resources().M577_APC.getPart("Mesh72_APCWhPlt9_Group9_Model");
			Part tire1Fin9 = AliensVsPredator.resources().M577_APC.getPart("Mesh73_APCWhPlt9_Group9_Model");
			Part tire1Fin10 = AliensVsPredator.resources().M577_APC.getPart("Mesh74_APCWhPlt9_Group9_Model");
			Part tire1Fin11 = AliensVsPredator.resources().M577_APC.getPart("Mesh65_APCWhPlt8_Group9_Model");
			Part tire1Fin12 = AliensVsPredator.resources().M577_APC.getPart("Mesh71_APCWhPlt9_Group9_Model");
			Part tire1Fin13 = AliensVsPredator.resources().M577_APC.getPart("Mesh59_APCWhAmr3_Group9_Model");
			Part tire1Fin14 = AliensVsPredator.resources().M577_APC.getPart("Mesh63_APCWhPlt7_Group9_Model");

			Part tire2 = AliensVsPredator.resources().M577_APC.getPart("Mesh41_APCTire1_2_Group8_Model");
			Part tire2Rim = AliensVsPredator.resources().M577_APC.getPart("Mesh42_APCWhAmr2_Group8_Model");
			Part tire2Fin0 = AliensVsPredator.resources().M577_APC.getPart("Mesh43_APCWhPlt4_Group8_Model");
			Part tire2Fin1 = AliensVsPredator.resources().M577_APC.getPart("Mesh44_APCWhPlt4_Group8_Model");
			Part tire2Fin2 = AliensVsPredator.resources().M577_APC.getPart("Mesh45_APCWhPlt4_Group8_Model");
			Part tire2Fin3 = AliensVsPredator.resources().M577_APC.getPart("Mesh46_APCWhPlt4_Group8_Model");
			Part tire2Fin4 = AliensVsPredator.resources().M577_APC.getPart("Mesh47_APCWhPlt4_Group8_Model");
			Part tire2Fin5 = AliensVsPredator.resources().M577_APC.getPart("Mesh48_APCWhPlt5_Group8_Model");
			Part tire2Fin6 = AliensVsPredator.resources().M577_APC.getPart("Mesh49_APCWhPlt5_Group8_Model");
			Part tire2Fin7 = AliensVsPredator.resources().M577_APC.getPart("Mesh50_APCWhPlt5_Group8_Model");
			Part tire2Fin8 = AliensVsPredator.resources().M577_APC.getPart("Mesh51_APCWhPlt5_Group8_Model");
			Part tire2Fin9 = AliensVsPredator.resources().M577_APC.getPart("Mesh52_APCWhPlt5_Group8_Model");
			Part tire2Fin10 = AliensVsPredator.resources().M577_APC.getPart("Mesh53_APCWhPlt6_Group8_Model");
			Part tire2Fin11 = AliensVsPredator.resources().M577_APC.getPart("Mesh54_APCWhPlt6_Group8_Model");
			Part tire2Fin12 = AliensVsPredator.resources().M577_APC.getPart("Mesh55_APCWhPlt6_Group8_Model");
			Part tire2Fin13 = AliensVsPredator.resources().M577_APC.getPart("Mesh56_APCWhPlt6_Group8_Model");
			Part tire2Fin14 = AliensVsPredator.resources().M577_APC.getPart("Mesh57_APCWhPlt6_Group8_Model");

			Part tire3 = AliensVsPredator.resources().M577_APC.getPart("Mesh34_APCTire1_1_Group7_Model");
			Part tire3Rim = AliensVsPredator.resources().M577_APC.getPart("Mesh35_APCWhAmr1_Group7_Model");
			Part tire3Fin0 = AliensVsPredator.resources().M577_APC.getPart("Mesh24_APCWhPlt1_Group7_Model");
			Part tire3Fin1 = AliensVsPredator.resources().M577_APC.getPart("Mesh25_APCWhPlt1_Group7_Model");
			Part tire3Fin2 = AliensVsPredator.resources().M577_APC.getPart("Mesh26_APCWhPlt1_Group7_Model");
			Part tire3Fin3 = AliensVsPredator.resources().M577_APC.getPart("Mesh27_APCWhPlt1_Group7_Model");
			Part tire3Fin4 = AliensVsPredator.resources().M577_APC.getPart("Mesh28_APCWhPlt1_Group7_Model");
			Part tire3Fin5 = AliensVsPredator.resources().M577_APC.getPart("Mesh29_APCWhPlt2_Group7_Model");
			Part tire3Fin6 = AliensVsPredator.resources().M577_APC.getPart("Mesh30_APCWhPlt2_Group7_Model");
			Part tire3Fin7 = AliensVsPredator.resources().M577_APC.getPart("Mesh31_APCWhPlt2_Group7_Model");
			Part tire3Fin8 = AliensVsPredator.resources().M577_APC.getPart("Mesh32_APCWhPlt2_Group7_Model");
			Part tire3Fin9 = AliensVsPredator.resources().M577_APC.getPart("Mesh33_APCWhPlt2_Group7_Model");
			Part tire3Fin10 = AliensVsPredator.resources().M577_APC.getPart("Mesh37_APCWhPlt3_Group7_Model");
			Part tire3Fin11 = AliensVsPredator.resources().M577_APC.getPart("Mesh38_APCWhPlt3_Group7_Model");
			Part tire3Fin12 = AliensVsPredator.resources().M577_APC.getPart("Mesh39_APCWhPlt3_Group7_Model");
			Part tire3Fin13 = AliensVsPredator.resources().M577_APC.getPart("Mesh40_APCWhPlt3_Group7_Model");
			Part tire3Fin14 = AliensVsPredator.resources().M577_APC.getPart("Mesh36_APCWhPlt3_Group7_Model");

			Part turret = AliensVsPredator.resources().M577_APC.getPart("Mesh13_APCMnTrt1_Group5_Model");
			Part turret1 = AliensVsPredator.resources().M577_APC.getPart("Mesh14_APCMnGun1_Group5_Model");
			Part turret2 = AliensVsPredator.resources().M577_APC.getPart("Mesh15_APCMnGun2_Group5_Model");
			Part turret3 = AliensVsPredator.resources().M577_APC.getPart("Mesh16_APCAmHdl1_Group5_Model");
			Part turret4 = AliensVsPredator.resources().M577_APC.getPart("Mesh17_APCAmHdl1_Group5_Model");
			Part turret5 = AliensVsPredator.resources().M577_APC.getPart("Mesh18_APCAmHdl1_Group5_Model");
			Part turret6 = AliensVsPredator.resources().M577_APC.getPart("Mesh19_APCAmHdl2_Group5_Model");
			Part turret7 = AliensVsPredator.resources().M577_APC.getPart("Mesh20_APCAmHdl2_Group5_Model");
			Part turret8 = AliensVsPredator.resources().M577_APC.getPart("Mesh21_APCAmHdl2_Group5_Model");
			
			
			
			for (Part p : AliensVsPredator.resources().M577_APC.nameToPartHash.values())
			{
				if(p == turret || p == turret1 || p == turret2 || p == turret3 || p == turret4 || p == turret5 || p == turret6 || p == turret7 || p == turret8)
				{
					if(entityIn.riddenByEntity != null && entityIn.riddenByEntity instanceof EntityPlayer)
					{
						GL11.glPushMatrix();
						{
							EntityPlayer playerIn = (EntityPlayer) entityIn.riddenByEntity;
							GL11.glTranslatef(-2.9F, 0.75F, -0.25F);
							GL11.glRotatef(-90, 0F, 1F, 0F);
							GL11.glRotatef(-playerIn.rotationYawHead, 0F, 1F, 0F);
							GL11.glTranslatef(2.9F, -0.75F, 0.25F);
							p.draw();
						}
						GL11.glPopMatrix();
					}
				}
				
				if(entityIn.motionX > 0.05 || entityIn.motionY > 0.05 || entityIn.motionZ > 0.05)
				{
					if (p == tire0 || p == tire0Rim || p == tire0Fin0 || p == tire0Fin1 || p == tire0Fin2 || p == tire0Fin3 || p == tire0Fin4 || p == tire0Fin5 || p == tire0Fin6 || p == tire0Fin7 || p == tire0Fin8 || p == tire0Fin9 || p == tire0Fin10 || p == tire0Fin11 || p == tire0Fin12 || p == tire0Fin13 || p == tire0Fin14)
					{
						GL11.glPushMatrix();
						{
							GL11.glTranslatef(-3.2F, 0.8F, -0.01F);
							GL11.glRotatef(-Minecraft.getMinecraft().thePlayer.worldObj.getWorldTime() % 360 * 8, 0, 0, 1);
							GL11.glTranslatef(3.2F, -0.8F, 0);
							p.draw();
						}
						GL11.glPopMatrix();
					}
					else if (p == tire1 || p == tire1Rim || p == tire1Fin0 || p == tire1Fin1 || p == tire1Fin2 || p == tire1Fin3 || p == tire1Fin4 || p == tire1Fin5 || p == tire1Fin6 || p == tire1Fin7 || p == tire1Fin8 || p == tire1Fin9 || p == tire1Fin10 || p == tire1Fin11 || p == tire1Fin12 || p == tire1Fin13 || p == tire1Fin14)
					{
						GL11.glPushMatrix();
						{
							GL11.glTranslatef(-3.2F, 0.8F, -0.05F);
							GL11.glRotatef(-Minecraft.getMinecraft().thePlayer.worldObj.getWorldTime() % 360 * 8, 0, 0, 1);
							GL11.glTranslatef(3.2F, -0.8F, 0);
							p.draw();
						}
						GL11.glPopMatrix();
					}
					else if (p == tire2 || p == tire2Rim || p == tire2Fin0 || p == tire2Fin1 || p == tire2Fin2 || p == tire2Fin3 || p == tire2Fin4 || p == tire2Fin5 || p == tire2Fin6 || p == tire2Fin7 || p == tire2Fin8 || p == tire2Fin9 || p == tire2Fin10 || p == tire2Fin11 || p == tire2Fin12 || p == tire2Fin13 || p == tire2Fin14)
					{
						GL11.glPushMatrix();
						{
							GL11.glTranslatef(1.6F, 0.8F, 0F);
							GL11.glRotatef(-Minecraft.getMinecraft().thePlayer.worldObj.getWorldTime() % 360 * 8, 0, 0, 1);
							GL11.glTranslatef(-1.6F, -0.8F, 0F);
							p.draw();
						}
						GL11.glPopMatrix();
					}
					else if (p == tire3 || p == tire3Rim || p == tire3Fin0 || p == tire3Fin1 || p == tire3Fin2 || p == tire3Fin3 || p == tire3Fin4 || p == tire3Fin5 || p == tire3Fin6 || p == tire3Fin7 || p == tire3Fin8 || p == tire3Fin9 || p == tire3Fin10 || p == tire3Fin11 || p == tire3Fin12 || p == tire3Fin13 || p == tire3Fin14)
					{
						GL11.glPushMatrix();
						{
							GL11.glTranslatef(1.6F, 0.8F, 0F);
							GL11.glRotatef(-Minecraft.getMinecraft().thePlayer.worldObj.getWorldTime() % 360 * 8, 0, 0, 1);
							GL11.glTranslatef(-1.6F, -0.8F, 0F);
							p.draw();
						}
						GL11.glPopMatrix();
					}
					else
					{
						if((p == turret || p == turret1 || p == turret2 || p == turret3 || p == turret4 || p == turret5 || p == turret6 || p == turret7 || p == turret8) && entityIn.riddenByEntity != null );
						
						else
						{
							p.draw();
						}
					}
				}
				else
				{
					if((p == turret || p == turret1 || p == turret2 || p == turret3 || p == turret4 || p == turret5 || p == turret6 || p == turret7 || p == turret8) && entityIn.riddenByEntity != null );
					
					else
					{
						p.draw();
					}
				}
			}
		}
		GL11.glPopMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entityIn)
	{
		return null;
	}

	@Override
	public void doRender(Entity entityIn, double posX, double posY, double posZ, float yaw, float partialTicks)
	{
		this.doRender((EntityAPC)entityIn, posX, posY, posZ, yaw, partialTicks);
	}
}