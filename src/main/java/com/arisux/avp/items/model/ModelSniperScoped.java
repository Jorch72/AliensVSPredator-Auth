package com.arisux.avp.items.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSniperScoped extends ModelBase
{
	ModelRenderer barrel = new ModelRenderer(this, 0, 0);
	ModelRenderer clipHolder1;
	ModelRenderer clipHolder2;
	ModelRenderer base1;
	ModelRenderer clip;
	ModelRenderer handle;
	ModelRenderer triggerGuard;
	ModelRenderer trigger;
	ModelRenderer stock1;
	ModelRenderer stock2;
	ModelRenderer stockEnd;
	ModelRenderer barrelSupport;
	ModelRenderer scopeSupport;
	ModelRenderer scopeBase;
	ModelRenderer scope;

	public ModelSniperScoped()
	{
		this.barrel.addBox(0.0F, 0.6666667F, 0.0F, 1, 1, 10);
		this.barrel.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.barrel.setTextureSize(64, 32);
		this.barrel.mirror = true;
		this.setRotation(this.barrel, 0.0F, 0.0F, 0.0F);
		this.clipHolder1 = new ModelRenderer(this, 0, 21);
		this.clipHolder1.addBox(0.0F, 2.0F, -1.6F, 1, 1, 2);
		this.clipHolder1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.clipHolder1.setTextureSize(64, 32);
		this.clipHolder1.mirror = true;
		this.setRotation(this.clipHolder1, 0.0F, 0.0F, 0.0F);
		this.clipHolder2 = new ModelRenderer(this, 0, 25);
		this.clipHolder2.addBox(0.0F, 1.7F, -2.7F, 1, 1, 1);
		this.clipHolder2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.clipHolder2.setTextureSize(64, 32);
		this.clipHolder2.mirror = true;
		this.setRotation(this.clipHolder2, 0.2617994F, 0.0F, 0.0F);
		this.base1 = new ModelRenderer(this, 40, 8);
		this.base1.addBox(-0.5F, 0.4F, -5.6F, 2, 2, 6);
		this.base1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.base1.setTextureSize(64, 32);
		this.base1.mirror = true;
		this.setRotation(this.base1, 0.0F, 0.0F, 0.0F);
		this.clip = new ModelRenderer(this, 16, 22);
		this.clip.addBox(0.0F, 2.3F, -2.4F, 1, 3, 2);
		this.clip.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.clip.setTextureSize(64, 32);
		this.clip.mirror = true;
		this.setRotation(this.clip, 0.1919862F, 0.0F, 0.0F);
		this.handle = new ModelRenderer(this, 17, 17);
		this.handle.addBox(0.0F, 1.5F, -4.5F, 1, 3, 1);
		this.handle.setRotationPoint(0.0F, 2.0F, 0.0F);
		this.handle.setTextureSize(64, 32);
		this.handle.mirror = true;
		this.setRotation(this.handle, -0.3665191F, 0.0F, 0.0F);
		this.triggerGuard = new ModelRenderer(this, 7, 21);
		this.triggerGuard.addBox(0.0F, 3.3F, -4.9F, 1, 0, 3);
		this.triggerGuard.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.triggerGuard.setTextureSize(64, 32);
		this.triggerGuard.mirror = true;
		this.setRotation(this.triggerGuard, 0.0F, 0.0F, 0.0F);
		this.trigger = new ModelRenderer(this, 0, 28);
		this.trigger.addBox(0.5F, 2.3F, -4.5F, 0, 1, 2);
		this.trigger.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.trigger.setTextureSize(64, 32);
		this.trigger.mirror = true;
		this.setRotation(this.trigger, 0.0F, 0.0F, 0.0F);
		this.stock1 = new ModelRenderer(this, 0, 12);
		this.stock1.addBox(0.0F, 0.6F, -11.7F, 1, 1, 7);
		this.stock1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.stock1.setTextureSize(64, 32);
		this.stock1.mirror = true;
		this.setRotation(this.stock1, 0.0F, 0.0F, 0.0F);
		this.stock2 = new ModelRenderer(this, 23, 8);
		this.stock2.addBox(0.0F, 0.6F, -11.0F, 1, 1, 6);
		this.stock2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.stock2.setTextureSize(64, 32);
		this.stock2.mirror = true;
		this.setRotation(this.stock2, 0.0942478F, 0.0F, 0.0F);
		this.stockEnd = new ModelRenderer(this, 17, 12);
		this.stockEnd.addBox(0.0F, 0.4F, -11.7F, 1, 3, 1);
		this.stockEnd.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.stockEnd.setTextureSize(64, 32);
		this.stockEnd.mirror = true;
		this.setRotation(this.stockEnd, 0.0F, 0.0F, 0.0F);
		this.barrelSupport = new ModelRenderer(this, 23, 0);
		this.barrelSupport.addBox(0.5F, 0.0F, 0.9F, 0, 1, 6);
		this.barrelSupport.setRotationPoint(0.0F, 0.0F, -0.5F);
		this.barrelSupport.setTextureSize(64, 32);
		this.barrelSupport.mirror = true;
		this.setRotation(this.barrelSupport, 0.0F, 0.0F, 0.0F);
		this.scopeSupport = new ModelRenderer(this, 5, 28);
		this.scopeSupport.addBox(0.5F, -0.3F, -5.366667F, 0, 1, 3);
		this.scopeSupport.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.scopeSupport.setTextureSize(64, 32);
		this.scopeSupport.mirror = true;
		this.setRotation(this.scopeSupport, 0.0F, 0.0F, 0.0F);
		this.scopeBase = new ModelRenderer(this, 36, 0);
		this.scopeBase.addBox(0.0F, 0.0F, -5.1F, 1, 1, 6);
		this.scopeBase.setRotationPoint(0.0F, 0.0F, -0.5F);
		this.scopeBase.setTextureSize(64, 32);
		this.scopeBase.mirror = true;
		this.setRotation(this.scopeBase, 0.0F, 0.0F, 0.0F);
		this.scope = new ModelRenderer(this, 28, 21);
		this.scope.addBox(0.0F, -1.3F, -5.5F, 1, 1, 2);
		this.scope.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.scope.setTextureSize(64, 32);
		this.scope.mirror = true;
		this.setRotation(this.scope, 0.0F, 0.0F, 0.0F);
	}

	/**
	 * Sets the models various rotation angles then renders the model.
	 */
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.barrel.render(f5);
		this.clipHolder1.render(f5);
		this.clipHolder2.render(f5);
		this.base1.render(f5);
		this.clip.render(f5);
		this.handle.render(f5);
		this.triggerGuard.render(f5);
		this.trigger.render(f5);
		this.stock1.render(f5);
		this.stock2.render(f5);
		this.stockEnd.render(f5);
		this.barrelSupport.render(f5);
		this.scopeSupport.render(f5);
		this.scopeBase.render(f5);
		this.scope.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) null);
	}
}
