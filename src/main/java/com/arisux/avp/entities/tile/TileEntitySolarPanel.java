package com.arisux.avp.entities.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

public class TileEntitySolarPanel extends PoweredTileEntity
{
	public int rotation;

	public void setDirection(byte direction)
	{
		this.rotation = direction;
	}

	@Override
	public Packet getDescriptionPacket()
	{
		NBTTagCompound nbtTag = new NBTTagCompound();
		this.writeToNBT(nbtTag);
		return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, nbtTag);
	}

	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity packet)
	{
		readFromNBT(packet.func_148857_g());
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt)
	{
		super.writeToNBT(nbt);
		nbt.setInteger("Rotation", this.rotation);
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		super.readFromNBT(nbt);
		this.rotation = nbt.getInteger("Rotation");
	}

	@Override
	public void outputPower()
	{
		super.outputPower();
	}

	@Override
	public void outputPowerToTile(PoweredTileEntity tile, double voltage)
	{
		if (tile != null && tile.getPowerSourceTile() == this)
		{
			tile.setVoltage(voltage);
		}
	}

	@Override
	public boolean canOutputPower()
	{
		World world = this.getWorldObj();
		if(world.getWorldTime() < 12300 || world.getWorldTime()  > 23850){
			return true;
		}
		return false;
	}
	
	@Override
	public double getVoltage()
	{
		double addedVoltage = 220;
		
		if (getTop() instanceof TileEntityRepulsionGenerator)
		{
			addedVoltage += 120;
		}
		
		if (getBottom() instanceof TileEntityRepulsionGenerator)
		{
			addedVoltage += 120;
		}
		
		if (getLeft() instanceof TileEntityRepulsionGenerator)
		{
			addedVoltage += 120;
		}
		
		if (getRight() instanceof TileEntityRepulsionGenerator)
		{
			addedVoltage += 120;
		}
		
		if (getFront() instanceof TileEntityRepulsionGenerator)
		{
			addedVoltage += 120;
		}
		
		if (getBack() instanceof TileEntityRepulsionGenerator)
		{
			addedVoltage += 120;
		}
		
		if (getTop() instanceof TileEntitySolarPanel)
		{
			addedVoltage += 220;
		}
		
		if (getBottom() instanceof TileEntitySolarPanel)
		{
			addedVoltage += 220;
		}
		
		if (getLeft() instanceof TileEntitySolarPanel)
		{
			addedVoltage += 220;
		}
		
		if (getRight() instanceof TileEntitySolarPanel)
		{
			addedVoltage += 220;
		}
		
		if (getFront() instanceof TileEntitySolarPanel)
		{
			addedVoltage += 220;
		}
		
		if (getBack() instanceof TileEntitySolarPanel)
		{
			addedVoltage += 220;
		}
		
		return addedVoltage;
	}

	@Override
	public void onVoltageTick()
	{
		;
	}

	@Override
	public void onOverloadTick()
	{
		;
	}

	@Override
	public void onUnderloadTick()
	{
		;
	}

	@Override
	public double getMaxOperatingVoltage()
	{
		return 24000;
	}

	@Override
	public boolean isOriginalPowerSourceAttached() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void getOriginalPowerSource() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TileEntityRepulsionGenerator getPowerSource() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setOriginalPowerSource(PoweredTileEntity e) {
		// TODO Auto-generated method stub
		
	}
}
