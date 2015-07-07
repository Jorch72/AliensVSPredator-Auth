package com.arisux.avp.entities.tile;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;

import com.arisux.avp.interfaces.IPowerDevice;
import com.google.common.collect.Lists;

public abstract class PoweredTileEntity extends TileEntity implements IPowerDevice
{
	public double voltage, amps;
	public boolean state = false;
	
	@Override
	public void updateEntity()
	{
		super.updateEntity();
		
		if (this.isVoltageInOperatingRange())
		{
			this.onVoltageTick();
		}
		
		if (this.voltage > this.getMaxOperatingVoltage())
		{
			this.onOverloadTick();
		}
<<<<<<< HEAD
			
		if(!this.state)
		{
			this.voltage = 0;
		}
		
		if (this.voltage <= this.getMinOperatingVoltage())
=======
		if(this instanceof TileEntityPowerline){
			TileEntityPowerline te = (TileEntityPowerline) this;
			if(!te.state){
				this.voltage = 0;
			}
			if(!te.isOriginalPowerSourceAttached())
			{
				te.setVoltage(0);
			}
			if(te.getPowerSource() == null)
			{
				this.voltage = 0;
				te.state = false;
			}
		}
		if (this.voltage <= this.getMinOperatingVoltage())
		{
			this.onUnderloadTick();
		}
		if (this instanceof TileEntityR2PConvertor)
		{
			TileEntityR2PConvertor te = (TileEntityR2PConvertor) this;
			if(!te.isActiveRedstoneWireAttached){
				te.setVoltage(0);
			}
		}
		
		if (!(this instanceof TileEntityPowerline) && !(this instanceof TileEntitySolarPanel) && !(this instanceof TileEntityRepulsionGenerator))
>>>>>>> origin/master
		{
			this.onUnderloadTick();
		}
		
		if (this.canOutputPower())
		{
			this.outputPower();
		}
	}
	
	private boolean isConnectedToAnything(PoweredTileEntity poweredTileEntity) {
		List<PoweredTileEntity> list = new ArrayList<PoweredTileEntity>();
		list.add(poweredTileEntity.getTop());
		list.add(poweredTileEntity.getBack());
		list.add(poweredTileEntity.getBottom());
		list.add(poweredTileEntity.getLeft());
		list.add(poweredTileEntity.getRight());
		list.add(poweredTileEntity.getFront());
		for(PoweredTileEntity te : list)
		{
			if(te instanceof TileEntitySolarPanel || te instanceof TileEntityRepulsionGenerator || te instanceof TileEntityPowerline || te instanceof TileEntityR2PConvertor){
				if(te instanceof TileEntityR2PConvertor)
				{
					TileEntityR2PConvertor ter = (TileEntityR2PConvertor) te;
					if(ter.isActiveRedstoneWireAttached)
					{
						return true;
					}
					else
					{
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}

	public boolean isPowerSource(){
		if(this.canOutputPower() && getPowerSourceTile(this) == this){
			return true;
		}
		return false;
	}
	public void outputPower()
	{
		double voltage = this.getVoltageAfterApplyingResistance();
		List<PoweredTileEntity> list = Lists.newArrayList(this.children);
		for(PoweredTileEntity e : list)
		{
			this.outputPowerToTile(e, voltage);
		}
	}
	
	public void outputPowerToTile(PoweredTileEntity tile, double voltage)
	{
		if (tile != null && tile.getPowerSourceTile(tile) == this)
		{
			tile.setVoltage(voltage);
		}
		else if(tile != null && tile instanceof TileEntityPowerline && tile.getVoltage() == 0)
		{
			tile.setVoltage(this.getVoltage());
		}
	}

	@Override
	public abstract void onVoltageTick();

	@Override
	public abstract void onOverloadTick();

	@Override
	public abstract void onUnderloadTick();
	
	@Override
	public void updateChildren()
	{
		if(this.children.size() > 0)
		{
			if(this.children.contains(this))
			{
				this.children.remove(this);
			}
			if(this.children.size() > 0)
			{
				List <PoweredTileEntity> list = Lists.newArrayList(this.children);
				for(PoweredTileEntity te : list)
				{
					if(te == null);
					else
					{
						te.state = this.state;
						te.updateChildren();
					}
				}
			}
		}
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
	public void writeToNBT(NBTTagCompound tag)
	{
		super.writeToNBT(tag);

		tag.setDouble("Volts", this.voltage);
		tag.setDouble("Amps", this.amps);
	}

	@Override
	public void readFromNBT(NBTTagCompound tag)
	{
		super.readFromNBT(tag);

		this.voltage = tag.getDouble("Volts");
		this.amps = tag.getDouble("Amps");
	}

	public void setVoltage(double voltageIn)
	{
		this.voltage = voltageIn;
	}

	public double getVoltageAfterApplyingResistance()
	{
		return this.getVoltage() - this.getResistance() <= 0 ? 0 : this.getVoltage() - this.getResistance();
	}

	public void setAmps(double ampsIn)
	{
		this.amps = ampsIn;
	}

	public PoweredTileEntity getPoweredTileAt(int x, int y, int z)
	{
		return this.worldObj.getTileEntity(x, y, z) instanceof PoweredTileEntity ? (PoweredTileEntity) this.worldObj.getTileEntity(x, y, z) : null;
	}

	public PoweredTileEntity getPowerSourceTile(PoweredTileEntity e){
		if (getTop() != null && getTop().isOutputVoltageHigherThan(this) && getTop().canOutputPower())
		{
			return getTop();
		}
		if (getBottom() != null && getBottom().isOutputVoltageHigherThan(this) && getBottom().canOutputPower())
		{
			return getBottom();
		}
		if (getFront() != null && getFront().isOutputVoltageHigherThan(this) && getFront().canOutputPower())
		{
			return getFront();
		}
		if (getBack() != null && getBack().isOutputVoltageHigherThan(this) && getBack().canOutputPower())
		{
			return getBack();
		}
		if (getLeft() != null && getLeft().isOutputVoltageHigherThan(this) && getLeft().canOutputPower())
		{
			return getLeft();
		}
		if (getRight() != null && getRight().isOutputVoltageHigherThan(this) && getRight().canOutputPower())
		{
			return getRight();
		}
		if (getTop() instanceof TileEntityTransformer)
		{
			TileEntityTransformer t = (TileEntityTransformer)getTop();
			if(!t.isOriginalPowerSourceAttached()){
				return null;
			}
			return (PoweredTileEntity) t.getPowerSource();
		}
		if (getBottom() instanceof TileEntityTransformer)
		{
			TileEntityTransformer t = (TileEntityTransformer)getBottom();
			if(!t.isOriginalPowerSourceAttached()){
				return null;
			}
			return (PoweredTileEntity) t.getPowerSource();
		}
		if (getFront() instanceof TileEntityTransformer)
		{
			TileEntityTransformer t = (TileEntityTransformer)getFront();
			if(!t.isOriginalPowerSourceAttached()){
				return null;
			}
			return (PoweredTileEntity) t.getPowerSource();
		}
		if (getBack() instanceof TileEntityTransformer)
		{
			TileEntityTransformer t = (TileEntityTransformer)getBack();
			if(!t.isOriginalPowerSourceAttached()){
				return null;
			}
			return (PoweredTileEntity) t.getPowerSource();
		}
		if (getLeft() instanceof TileEntityTransformer)
		{
			TileEntityTransformer t = (TileEntityTransformer)getLeft();
			if(!t.isOriginalPowerSourceAttached()){
				return null;
			}
			return (PoweredTileEntity) t.getPowerSource();
		}
		if (getRight() instanceof TileEntityTransformer)
		{
			TileEntityTransformer t = (TileEntityTransformer)getRight();
			if(!t.isOriginalPowerSourceAttached()){
				return null;
			}
			return (PoweredTileEntity) t.getPowerSource();
		}
		if (getTop() instanceof TileEntityNegativeTransformer)
		{
			TileEntityNegativeTransformer t = (TileEntityNegativeTransformer)getTop();
			if(!t.isOriginalPowerSourceAttached()){
				return null;
			}
			return (PoweredTileEntity) t.getPowerSource();
		}
		if (getBottom() instanceof TileEntityNegativeTransformer)
		{
			TileEntityNegativeTransformer t = (TileEntityNegativeTransformer)getBottom();
			if(!t.isOriginalPowerSourceAttached()){
				return null;
			}
			return (PoweredTileEntity) t.getPowerSource();
		}
		if (getFront() instanceof TileEntityNegativeTransformer)
		{
			TileEntityNegativeTransformer t = (TileEntityNegativeTransformer)getFront();
			if(!t.isOriginalPowerSourceAttached()){
				return null;
			}
			return (PoweredTileEntity) t.getPowerSource();
		}
		if (getBack() instanceof TileEntityNegativeTransformer)
		{
			TileEntityNegativeTransformer t = (TileEntityNegativeTransformer)getBack();
			if(!t.isOriginalPowerSourceAttached()){
				return null;
			}
			return (PoweredTileEntity) t.getPowerSource();
		}
		if (getLeft() instanceof TileEntityNegativeTransformer)
		{
			TileEntityNegativeTransformer t = (TileEntityNegativeTransformer)getLeft();
			if(!t.isOriginalPowerSourceAttached()){
				return null;
			}
			return (PoweredTileEntity) t.getPowerSource();
		}
		if (getRight() instanceof TileEntityNegativeTransformer)
		{
			TileEntityNegativeTransformer t = (TileEntityNegativeTransformer)getRight();
			if(!t.isOriginalPowerSourceAttached()){
				return null;
			}
			return (PoweredTileEntity) t.getPowerSource();
		}
		return null;
	}
	
	public boolean isVoltageInOperatingRange()
	{
		return this.getVoltage() < this.getMaxOperatingVoltage() && this.getVoltage() > this.getMinOperatingVoltage();
	}

	public boolean isPowered()
	{
		return this.getVoltage() != 0;
	}

	public boolean isOutputVoltageLessThan(PoweredTileEntity device)
	{
		return this.getVoltage() < device.getVoltage();
	}

	public boolean isOutputVoltageHigherThan(PoweredTileEntity device)
	{
		return this.getVoltage() > device.getVoltage();
	}

	public PoweredTileEntity getTop()
	{
		return this.getPoweredTileAt(this.xCoord, this.yCoord + 1, this.zCoord);
	}

	public PoweredTileEntity getBottom()
	{
		return this.getPoweredTileAt(this.xCoord, this.yCoord - 1, this.zCoord);
	}

	public PoweredTileEntity getFront()
	{
		return this.getPoweredTileAt(this.xCoord, this.yCoord, this.zCoord - 1);
	}

	public PoweredTileEntity getBack()
	{
		return this.getPoweredTileAt(this.xCoord, this.yCoord, this.zCoord + 1);
	}

	public PoweredTileEntity getRight()
	{
		return this.getPoweredTileAt(this.xCoord - 1, this.yCoord, this.zCoord);
	}

	public PoweredTileEntity getLeft()
	{
		return this.getPoweredTileAt(this.xCoord + 1, this.yCoord, this.zCoord);
	}

	@Override
	public double getVoltage()
	{
		return this.voltage;
	}

	@Override
	public double getMaxOperatingVoltage()
	{
		return 140;
	}

	@Override
	public double getMinOperatingVoltage()
	{
		return 110;
	}

	@Override
	public double getAmperage()
	{
		return this.amps;
	}

	@Override
	public double getMaxOperatingAmps()
	{
		return 4;
	}

	@Override
	public double getMinOperatingAmps()
	{
		return 1;
	}

	@Override
	public double getResistance()
	{
		return 0.1;
	}

	@Override
	public boolean canOutputPower()
	{
		return false;
	}
}