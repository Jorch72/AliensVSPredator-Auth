package com.arisux.avp.block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.arisux.airi.lib.BlockTypeLib.HookedBlockContainer;
import com.arisux.avp.entities.tile.TileEntityHiveNode;

public class BlockHiveNode extends HookedBlockContainer
{
	public BlockHiveNode(Material par3)
	{
		super(par3);
		this.setLightOpacity(2);
		float var5 = 0.38F;
		this.setBlockBounds(var5, 0.0F, var5, 1.0F - var5, 0.9F, 1.0F - var5);
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		super.updateTick(par1World, par2, par3, par4, par5Random);
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2)
	{
		return new TileEntityHiveNode();
	}
}
