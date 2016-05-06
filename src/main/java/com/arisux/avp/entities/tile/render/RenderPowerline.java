package com.arisux.avp.entities.tile.render;

import static org.lwjgl.opengl.GL11.GL_ALPHA_TEST;
import static org.lwjgl.opengl.GL11.GL_CULL_FACE;

import org.lwjgl.opengl.GL11;

import com.arisux.airi.lib.GlStateManager;
import com.arisux.airi.lib.RenderUtil;
import com.arisux.avp.AliensVsPredator;
import com.arisux.avp.entities.tile.TileEntityPowerline;
import com.arisux.avp.entities.tile.model.ModelCable;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class RenderPowerline extends TileEntitySpecialRenderer
{
    private ModelCable model = new ModelCable();

    @Override
    public void renderTileEntityAt(TileEntity var1, double posX, double posY, double posZ, float var8)
    {
        TileEntityPowerline tile = (TileEntityPowerline) var1;

        GlStateManager.pushMatrix();
        {
            GlStateManager.disable(GL_CULL_FACE);
            this.bindTexture(AliensVsPredator.resources().CABLE);
            GlStateManager.disable(GL11.GL_TEXTURE_2D);

            GlStateManager.pushMatrix();
            {
                GlStateManager.translate(posX + 0.5F, posY + 1.5F, posZ + 0.5F);
                GlStateManager.scale(1.0F, -1.0F, 1.0F);
                GlStateManager.enable(GL_ALPHA_TEST);
                GlStateManager.color4i(0xFF222222);
                this.model.render(tile, 0.0625F);
            }
            GlStateManager.popMatrix();

            GlStateManager.enable(GL11.GL_TEXTURE_2D);

            GlStateManager.translate(posX + 0.5F, posY + 1.5F, posZ + 0.5F);

            if (Minecraft.getMinecraft().objectMouseOver != null)
            {
                TileEntity tileOver = Minecraft.getMinecraft().thePlayer.worldObj.getTileEntity(Minecraft.getMinecraft().objectMouseOver.blockX, Minecraft.getMinecraft().objectMouseOver.blockY, Minecraft.getMinecraft().objectMouseOver.blockZ);

                if (tileOver != null && tileOver == tile)
                {
                    float scale = 0.02F;
                    GlStateManager.scale(scale, scale, scale);
                    GlStateManager.disableLight();

                    GlStateManager.pushMatrix();
                    {
                        GlStateManager.rotate(Minecraft.getMinecraft().thePlayer.rotationYaw + 180, 0F, -1F, 0F);

                        GlStateManager.pushMatrix();
                        {
                            GlStateManager.rotate(Minecraft.getMinecraft().thePlayer.rotationPitch + 180, -1F, 0F, 0F);
                            RenderUtil.drawString(((float) tile.getVoltage()) + "V", -20, 30, tile.getVoltage() <= 0 ? 0xFFFF0000 : 0xFF00FF00);
                            scale = 0.5F;
                            GlStateManager.scale(scale, scale, scale);
                            RenderUtil.drawString((tile + "").replace(tile.getClass().getName(), ""), -20, 80, 0xFF00AAFF);
                        }
                        GlStateManager.popMatrix();
                    }
                    GlStateManager.popMatrix();

                    GlStateManager.enableLight();
                }
            }
        }
        GlStateManager.popMatrix();
    }
}
