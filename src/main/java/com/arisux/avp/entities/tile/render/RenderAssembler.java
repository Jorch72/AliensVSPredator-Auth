package com.arisux.avp.entities.tile.render;

import static org.lwjgl.opengl.GL11.*;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import com.arisux.airi.lib.RenderUtil;
import com.arisux.avp.entities.tile.TileEntityAssembler;

public class RenderAssembler extends TileEntitySpecialRenderer
{
	@Override
	public void renderTileEntityAt(TileEntity tile, double posX, double posY, double posZ, float renderPartialTicks)
	{
		glPushMatrix();
		{
			glDisable(GL_CULL_FACE);
			glEnable(GL_BLEND);
			glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
			glTranslated(posX + 0.5F, posY + 0.95F, posZ + 0.5F);

			glRotatef(tile.getWorldObj().getWorldTime() % 360 * 12, 0, 1, 0);

			glPushMatrix();
			{
				glScalef(0.025F, -0.025F, 0.025F);
				RenderUtil.glDisableLight();
				RenderUtil.glColorHexRGBA(0xFFFF0000);
				glEnable(GL_BLEND);
				glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_DST_COLOR);
				RenderUtil.drawItemIcon(((TileEntityAssembler) tile).getRandomItem(), -8, -60, 16, 16);
				glDisable(GL_BLEND);
				RenderUtil.glEnableLight();
			}
			glPopMatrix();
			
			glRotatef(-15, 1, 0, 0);
			glRotatef(10, 0, 0, 1);

			glPushMatrix();
			{
				glScalef(0.05F, 0.05F, 0.05F);
				RenderUtil.glDisableLight();

				for (int x = 64; x > 0; x--)
				{
					glRotatef(x * 1, 0, 1, 0);
					glRotatef(20, 0, 0, 1);
					RenderUtil.drawRect(-1, 0, 2, 1 + x / 2, 0xAAFF0000);
				}

				RenderUtil.glEnableLight();
			}
			glPopMatrix();

			glDisable(GL_BLEND);
		}
		glPopMatrix();
	}
}