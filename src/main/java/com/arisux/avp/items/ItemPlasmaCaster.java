package com.arisux.avp.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.arisux.airi.engine.WorldEngine;
import com.arisux.airi.engine.WorldEngine.Blocks.CoordData;
import com.arisux.avp.AliensVsPredator;
import com.arisux.avp.entities.EntityPlasma;
import com.arisux.avp.entities.ExtendedEntityPlayer;

public class ItemPlasmaCaster extends Item
{
	public ItemPlasmaCaster()
	{
		super();
		this.maxStackSize = 1;
		this.setMaxDamage(50);
	}

	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
	{
		if (itemstack.getItemDamage() > 0)
		{
			itemstack.damageItem(1, (EntityLiving) entity);
		}

		if (entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) entity;

			if (player.isUsingItem())
			{
				this.onItemUse(itemstack, player, world, (int) player.posX, (int) player.posY, (int) player.posZ, player.getItemInUseCount());
			}
		}
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
	{
		entityplayer.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));

		return itemstack;
	}

	public void onItemUse(ItemStack itemstack, EntityPlayer player, World world, int posX, int posY, int posZ, int itemUseCount)
	{
		ExtendedEntityPlayer extendedPlayer = (ExtendedEntityPlayer) player.getExtendedProperties(ExtendedEntityPlayer.ID_PROPERTIES);
		EntityPlasma plasma;

		if (extendedPlayer.getPlasmaEntityId() == 0)
		{
			plasma = new EntityPlasma(world, player);
			extendedPlayer.setPlasmaEntityId(plasma.getEntityId());

			if (!world.isRemote)
			{
				world.spawnEntityInWorld(plasma);
			}
		}
		else
		{
			plasma = (EntityPlasma) WorldEngine.Entities.getEntityInCoordsRange(world, EntityPlasma.class, new CoordData(posX, posY, posZ), 1);
		}

		if (plasma != null)
		{
			plasma.setLocationAndAngles(player.posX, player.posY + player.getEyeHeight(), player.posZ, player.rotationYaw, player.rotationPitch);
			plasma.increaseSize();
		}
	}

	@Override
	public void onPlayerStoppedUsing(ItemStack itemStack, World world, EntityPlayer player, int itemUseCount)
	{
		ExtendedEntityPlayer extendedPlayer = (ExtendedEntityPlayer) player.getExtendedProperties(ExtendedEntityPlayer.ID_PROPERTIES);
		EntityPlasma plasma = (EntityPlasma) world.getEntityByID(extendedPlayer.getPlasmaEntityId());

		if (plasma != null)
		{
			if (plasma.getSize() > 0.5F)
			{
				float speed = 4F * plasma.getSize();
				plasma.setLocationAndAngles(player.posX, player.posY + player.getEyeHeight(), player.posZ, player.rotationYaw, player.rotationPitch);
				plasma.motionX = -MathHelper.sin(plasma.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(plasma.rotationPitch / 180.0F * (float) Math.PI) * speed;
				plasma.motionZ = MathHelper.cos(plasma.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(plasma.rotationPitch / 180.0F * (float) Math.PI) * speed;
				plasma.motionY = -MathHelper.sin((plasma.rotationPitch) / 180.0F * (float) Math.PI) * speed;
				plasma.release();
				world.playSoundEffect(player.posX, player.posY, player.posZ, AliensVsPredator.properties().SOUND_WEAPON_PLASMACASTER, 0.5F, 0.5F);
			}
			else
			{
				plasma.setDead();
			}
		}

		extendedPlayer.setPlasmaEntityId(0);

		super.onPlayerStoppedUsing(itemStack, world, player, itemUseCount);
	}

	@Override
	public int getMaxItemUseDuration(ItemStack itemstack)
	{
		return 72000;
	}
}
