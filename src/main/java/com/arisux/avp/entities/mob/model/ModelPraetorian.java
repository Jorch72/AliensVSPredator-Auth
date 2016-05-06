package com.arisux.avp.entities.mob.model;

import com.arisux.airi.lib.client.ModelBaseWrapper;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelPraetorian extends ModelBaseWrapper
{
    public ModelRenderer torso, stomache, rThigh, lThigh, lShin, rShin, lShin1, rShin1, lFoot, rFoot, lArm, rArm, lClaw, rArm2, neck, headBase, face1, jaw1, jaw2, head2, lArm2, rClaw, lClaw2, rClaw2, vertibrae1, vertibrae2, tailspines1, tail2, tail3, stabber, tail4, tail5, face2, tailspines5, tailspikes5, tailspikes4, tailspines4, tailspines3, tailspikes3, tailspines2, tailspikes2, tail1, tailspikes1, backStabber1, backStabber2, backStabber3, backStabber4, headSide1, headSide2, backStabber5, backStabber6;
    private float wingspeed = 0.0F;

    public ModelPraetorian()
    {
        this.wingspeed = 0.22F;
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.torso = new ModelRenderer(this, 0, 46);
        this.torso.addBox(-4.5F, -2.0F, 0.0F, 9, 8, 10);
        this.torso.setRotationPoint(0.0F, -2.5F, -8.0F);
        this.torso.setTextureSize(256, 128);
        this.torso.mirror = true;
        this.setRotation(this.torso, -0.1919862F, 0.0F, 0.0F);
        this.stomache = new ModelRenderer(this, 0, 27);
        this.stomache.addBox(-3.5F, -5.0F, 8.0F, 7, 6, 12);
        this.stomache.setRotationPoint(0.0F, -2.5F, -8.0F);
        this.stomache.setTextureSize(256, 128);
        this.stomache.mirror = true;
        this.setRotation(this.stomache, -0.5585054F, 0.0F, 0.0F);
        this.rThigh = new ModelRenderer(this, 59, 45);
        this.rThigh.addBox(-1.5F, -4.0F, -2.5F, 4, 14, 5);
        this.rThigh.setRotationPoint(-4.5F, 7.0F, 8.0F);
        this.rThigh.setTextureSize(256, 128);
        this.rThigh.mirror = true;
        this.setRotation(this.rThigh, -0.8028515F, 0.2443461F, 0.418879F);
        this.lThigh = new ModelRenderer(this, 40, 45);
        this.lThigh.addBox(-2.5F, -4.0F, -2.5F, 4, 14, 5);
        this.lThigh.setRotationPoint(4.5F, 7.0F, 8.0F);
        this.lThigh.setTextureSize(256, 128);
        this.lThigh.mirror = true;
        this.setRotation(this.lThigh, -0.8028515F, -0.2443461F, -0.418879F);
        this.lShin = new ModelRenderer(this, 79, 49);
        this.lShin.addBox(-2.0F, 8.0F, -5.5F, 3, 3, 12);
        this.lShin.setRotationPoint(4.5F, 7.0F, 8.0F);
        this.lShin.setTextureSize(256, 128);
        this.lShin.mirror = true;
        this.setRotation(this.lShin, -0.4014257F, -0.2443461F, -0.418879F);
        this.rShin = new ModelRenderer(this, 79, 33);
        this.rShin.addBox(-1.0F, 8.0F, -5.5F, 3, 3, 12);
        this.rShin.setRotationPoint(-4.5F, 7.0F, 8.0F);
        this.rShin.setTextureSize(256, 128);
        this.rShin.mirror = true;
        this.setRotation(this.rShin, -0.4014257F, 0.2443461F, 0.418879F);
        this.lShin1 = new ModelRenderer(this, 113, 40);
        this.lShin1.addBox(-1.5F, 5.5F, 9.0F, 2, 9, 2);
        this.lShin1.setRotationPoint(4.5F, 7.0F, 8.0F);
        this.lShin1.setTextureSize(256, 128);
        this.lShin1.mirror = true;
        this.setRotation(this.lShin1, -0.8028515F, -0.2443461F, -0.418879F);
        this.rShin1 = new ModelRenderer(this, 113, 53);
        this.rShin1.addBox(-0.5F, 5.5F, 9.0F, 2, 9, 2);
        this.rShin1.setRotationPoint(-4.5F, 7.0F, 8.0F);
        this.rShin1.setTextureSize(256, 128);
        this.rShin1.mirror = true;
        this.setRotation(this.rShin1, -0.8028515F, 0.2443461F, 0.418879F);
        this.lFoot = new ModelRenderer(this, 110, 24);
        this.lFoot.addBox(5.0F, 15.0F, -8.0F, 2, 2, 5);
        this.lFoot.setRotationPoint(4.5F, 7.0F, 9.0F);
        this.lFoot.setTextureSize(256, 128);
        this.lFoot.mirror = true;
        this.setRotation(this.lFoot, 0.0F, -0.2443461F, 0.0F);
        this.rFoot = new ModelRenderer(this, 95, 24);
        this.rFoot.addBox(-7.0F, 15.0F, -8.0F, 2, 2, 5);
        this.rFoot.setRotationPoint(-4.5F, 7.0F, 9.0F);
        this.rFoot.setTextureSize(256, 128);
        this.rFoot.mirror = true;
        this.setRotation(this.rFoot, 0.0F, 0.2443461F, 0.0F);
        this.neck = new ModelRenderer(this, 23, 86);
        this.neck.addBox(-2.0F, -2.0F, -4.0F, 4, 6, 5);
        this.neck.setRotationPoint(0.0F, -2.5F, -8.0F);
        this.neck.setTextureSize(256, 128);
        this.neck.mirror = true;
        this.setRotation(this.neck, -0.1919862F, 0.0F, 0.0F);
        this.headBase = new ModelRenderer(this, 0, 0);
        this.headBase.addBox(-2.5F, -5.0F, -3.0F, 5, 10, 5);
        this.headBase.setRotationPoint(0.0F, -2.5F, -12.0F);
        this.headBase.setTextureSize(256, 128);
        this.headBase.mirror = true;
        this.setRotation(this.headBase, -((float) Math.PI / 5F), 0.0F, 0.0F);
        this.face1 = new ModelRenderer(this, 34, 0);
        this.face1.addBox(-2.51F, 3.0F, -5.0F, 3, 3, 5);
        this.face1.setRotationPoint(0.0F, -2.5F, -12.0F);
        this.face1.setTextureSize(256, 128);
        this.face1.mirror = true;
        this.setRotation(this.face1, -0.122173F, 0.0F, 0.0F);
        this.jaw1 = new ModelRenderer(this, 51, 10);
        this.jaw1.addBox(-2.5F, 2.8F, -5.0F, 5, 3, 4);
        this.jaw1.setRotationPoint(0.0F, -2.5F, -12.0F);
        this.jaw1.setTextureSize(256, 128);
        this.jaw1.mirror = true;
        this.setRotation(this.jaw1, 0.122173F, 0.0F, 0.0F);
        this.jaw2 = new ModelRenderer(this, 52, 20);
        this.jaw2.addBox(-1.5F, 4.1F, -6.1F, 3, 2, 5);
        this.jaw2.setRotationPoint(0.0F, -2.5F, -12.0F);
        this.jaw2.setTextureSize(256, 128);
        this.jaw2.mirror = true;
        this.setRotation(this.jaw2, 0.122173F, 0.0F, 0.0F);
        this.head2 = new ModelRenderer(this, 127, 10);
        this.head2.addBox(-2.5F, -21.0F, -4.2F, 5, 17, 5);
        this.head2.setRotationPoint(0.0F, -2.5F, -12.0F);
        this.head2.setTextureSize(256, 128);
        this.head2.mirror = true;
        this.setRotation(this.head2, -0.9075712F, 0.0F, 0.0F);
        this.vertibrae1 = new ModelRenderer(this, 0, 65);
        this.vertibrae1.addBox(0.0F, -10.0F, 0.0F, 0, 8, 10);
        this.vertibrae1.setRotationPoint(0.0F, -2.5F, -8.0F);
        this.vertibrae1.setTextureSize(256, 128);
        this.vertibrae1.mirror = true;
        this.setRotation(this.vertibrae1, -0.1919862F, 0.0F, 0.0F);
        this.vertibrae2 = new ModelRenderer(this, 23, 65);
        this.vertibrae2.addBox(0.0F, -11.0F, 8.0F, 0, 6, 12);
        this.vertibrae2.setRotationPoint(0.0F, -2.5F, -8.0F);
        this.vertibrae2.setTextureSize(256, 128);
        this.vertibrae2.mirror = true;
        this.setRotation(this.vertibrae2, -0.5585054F, 0.0F, 0.0F);
        this.face2 = new ModelRenderer(this, 53, 0);
        this.face2.addBox(-0.499F, 3.0F, -5.0F, 3, 3, 5);
        this.face2.setRotationPoint(0.0F, -2.5F, -12.0F);
        this.face2.setTextureSize(256, 128);
        this.face2.mirror = true;
        this.setRotation(this.face2, -0.122173F, 0.0F, 0.0F);
        this.headSide1 = new ModelRenderer(this, 151, 10);
        this.headSide1.addBox(-2.8F, -21.0F, -3.2F, 5, 17, 2);
        this.headSide1.setRotationPoint(0.0F, -2.5F, -12.0F);
        this.headSide1.setTextureSize(256, 128);
        this.headSide1.mirror = true;
        this.setRotation(this.headSide1, -0.8552113F, 0.3665191F, 0.0F);
        this.headSide2 = new ModelRenderer(this, 169, 10);
        this.headSide2.addBox(-1.8F, -21.0F, -3.2F, 5, 17, 2);
        this.headSide2.setRotationPoint(0.0F, -2.5F, -12.0F);
        this.headSide2.setTextureSize(256, 128);
        this.headSide2.mirror = true;
        this.setRotation(this.headSide2, -0.8552113F, -0.3665191F, 0.0F);
        this.backStabber1 = new ModelRenderer(this, 0, 86);
        this.backStabber1.addBox(0.0F, -18.0F, 0.0F, 2, 19, 0);
        this.backStabber1.setRotationPoint(-3.0F, -2.3F, 1.0F);
        this.backStabber1.setTextureSize(256, 128);
        this.backStabber1.mirror = true;
        this.setRotation(this.backStabber1, -0.5235988F, -1.134464F, 0.2617994F);
        this.backStabber2 = new ModelRenderer(this, 0, 86);
        this.backStabber2.addBox(0.0F, -18.0F, 0.0F, 2, 19, 0);
        this.backStabber2.setRotationPoint(3.0F, -3.3F, -2.0F);
        this.backStabber2.setTextureSize(256, 128);
        this.backStabber2.mirror = true;
        this.setRotation(this.backStabber2, ((float) Math.PI * 2F / 9F), -1.919862F, 0.0F);
        this.backStabber3 = new ModelRenderer(this, 8, 86);
        this.backStabber3.addBox(0.0F, -15.0F, 0.0F, 2, 16, 0);
        this.backStabber3.setRotationPoint(-3.0F, -1.3F, 3.0F);
        this.backStabber3.setTextureSize(256, 128);
        this.backStabber3.mirror = true;
        this.setRotation(this.backStabber3, -0.3490659F, -1.134464F, 0.6108652F);
        this.backStabber4 = new ModelRenderer(this, 8, 86);
        this.backStabber4.addBox(0.0F, -16.0F, 0.0F, 2, 16, 0);
        this.backStabber4.setRotationPoint(3.0F, -2.3F, 1.0F);
        this.backStabber4.setTextureSize(256, 128);
        this.backStabber4.mirror = true;
        this.setRotation(this.backStabber4, 0.5235988F, -1.919862F, 0.2617994F);
        this.backStabber5 = new ModelRenderer(this, 8, 86);
        this.backStabber5.addBox(0.0F, -15.0F, 0.0F, 2, 16, 0);
        this.backStabber5.setRotationPoint(-3.0F, -3.3F, -2.0F);
        this.backStabber5.setTextureSize(256, 128);
        this.backStabber5.mirror = true;
        this.setRotation(this.backStabber5, -((float) Math.PI * 2F / 9F), -1.134464F, 0.0F);
        this.backStabber6 = new ModelRenderer(this, 8, 86);
        this.backStabber6.addBox(0.0F, -15.0F, 0.0F, 2, 16, 0);
        this.backStabber6.setRotationPoint(3.0F, -1.3F, 3.0F);
        this.backStabber6.setTextureSize(256, 128);
        this.backStabber6.mirror = true;
        this.setRotation(this.backStabber6, 0.3665191F, -1.919862F, 0.6108652F);
        this.tailspines1 = new ModelRenderer(this, 50, 83);
        this.tailspines1.addBox(-4.0F, -0.5F, 0.0F, 8, 0, 11);
        this.tailspines1.setRotationPoint(0.0F, 6.5F, 10.5F);
        this.tailspines1.setTextureSize(256, 128);
        this.tailspines1.mirror = true;
        this.setRotation(this.tailspines1, -0.4014257F, 0.0F, 0.0F);
        this.tail2 = new ModelRenderer(this, 85, 66);
        this.tail2.addBox(-2.0F, -1.5F, 0.0F, 4, 4, 11);
        this.tail2.setRotationPoint(0.0F, 9.5F, 20.5F);
        this.tail2.setTextureSize(256, 128);
        this.tail2.mirror = true;
        this.setRotation(this.tail2, -((float) Math.PI / 10F), 0.0F, 0.0F);
        this.tail3 = new ModelRenderer(this, 118, 66);
        this.tail3.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 11);
        this.tail3.setRotationPoint(0.0F, 13.5F, 30.5F);
        this.tail3.setTextureSize(256, 128);
        this.tail3.mirror = true;
        this.setRotation(this.tail3, -0.2094395F, 0.0F, 0.0F);
        this.stabber = new ModelRenderer(this, 205, 66);
        this.stabber.addBox(-1.5F, 0.0F, 0.0F, 3, 0, 11);
        this.stabber.setRotationPoint(0.0F, 18.5F, 61.5F);
        this.stabber.setTextureSize(256, 128);
        this.stabber.mirror = true;
        this.setRotation(this.stabber, -0.0523599F, 0.0F, 0.0F);
        this.tail4 = new ModelRenderer(this, 149, 66);
        this.tail4.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 11);
        this.tail4.setRotationPoint(0.0F, 15.5F, 40.5F);
        this.tail4.setTextureSize(256, 128);
        this.tail4.mirror = true;
        this.setRotation(this.tail4, -0.1396263F, 0.0F, 0.0F);
        this.tail5 = new ModelRenderer(this, 178, 66);
        this.tail5.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 11);
        this.tail5.setRotationPoint(0.0F, 17.5F, 50.5F);
        this.tail5.setTextureSize(256, 128);
        this.tail5.mirror = true;
        this.setRotation(this.tail5, -0.0523599F, 0.0F, 0.0F);
        this.tailspines5 = new ModelRenderer(this, 178, 80);
        this.tailspines5.addBox(-1.5F, 0.0F, 0.0F, 3, 0, 11);
        this.tailspines5.setRotationPoint(0.0F, 17.5F, 51.5F);
        this.tailspines5.setTextureSize(256, 128);
        this.tailspines5.mirror = true;
        this.setRotation(this.tailspines5, -0.0523599F, 0.0F, 0.0F);
        this.tailspikes5 = new ModelRenderer(this, 178, 96);
        this.tailspikes5.addBox(0.0F, -1.5F, 0.0F, 0, 3, 11);
        this.tailspikes5.setRotationPoint(0.0F, 17.5F, 51.5F);
        this.tailspikes5.setTextureSize(256, 128);
        this.tailspikes5.mirror = true;
        this.setRotation(this.tailspikes5, -0.0523599F, 0.0F, 0.0F);
        this.tailspikes4 = new ModelRenderer(this, 149, 96);
        this.tailspikes4.addBox(0.0F, -2.0F, 0.0F, 0, 4, 10);
        this.tailspikes4.setRotationPoint(0.0F, 15.5F, 41.5F);
        this.tailspikes4.setTextureSize(256, 128);
        this.tailspikes4.mirror = true;
        this.setRotation(this.tailspikes4, -0.1396263F, 0.0F, 0.0F);
        this.tailspines4 = new ModelRenderer(this, 149, 81);
        this.tailspines4.addBox(-2.0F, 0.0F, 0.0F, 4, 0, 10);
        this.tailspines4.setRotationPoint(0.0F, 15.5F, 41.5F);
        this.tailspines4.setTextureSize(256, 128);
        this.tailspines4.mirror = true;
        this.setRotation(this.tailspines4, -0.1396263F, 0.0F, 0.0F);
        this.tailspines3 = new ModelRenderer(this, 118, 82);
        this.tailspines3.addBox(-3.0F, 0.0F, 0.0F, 6, 0, 10);
        this.tailspines3.setRotationPoint(0.0F, 13.5F, 31.5F);
        this.tailspines3.setTextureSize(256, 128);
        this.tailspines3.mirror = true;
        this.setRotation(this.tailspines3, -0.2094395F, 0.0F, 0.0F);
        this.tailspikes3 = new ModelRenderer(this, 118, 94);
        this.tailspikes3.addBox(0.0F, -3.0F, 0.0F, 0, 6, 10);
        this.tailspikes3.setRotationPoint(0.0F, 13.5F, 31.5F);
        this.tailspikes3.setTextureSize(256, 128);
        this.tailspikes3.mirror = true;
        this.setRotation(this.tailspikes3, -0.2094395F, 0.0F, 0.0F);
        this.tailspines2 = new ModelRenderer(this, 85, 85);
        this.tailspines2.addBox(-4.0F, 0.5F, 1.0F, 8, 0, 11);
        this.tailspines2.setRotationPoint(0.0F, 9.5F, 19.5F);
        this.tailspines2.setTextureSize(256, 128);
        this.tailspines2.mirror = true;
        this.setRotation(this.tailspines2, -((float) Math.PI / 10F), 0.0F, 0.0F);
        this.tailspikes2 = new ModelRenderer(this, 90, 93);
        this.tailspikes2.addBox(0.0F, -3.5F, 0.0F, 0, 8, 11);
        this.tailspikes2.setRotationPoint(0.0F, 9.5F, 20.5F);
        this.tailspikes2.setTextureSize(256, 128);
        this.tailspikes2.mirror = true;
        this.setRotation(this.tailspikes2, -((float) Math.PI / 10F), 0.0F, 0.0F);
        this.tail1 = new ModelRenderer(this, 50, 66);
        this.tail1.addBox(-2.0F, -2.5F, 0.0F, 4, 4, 11);
        this.tail1.setRotationPoint(0.0F, 6.5F, 10.5F);
        this.tail1.setTextureSize(256, 128);
        this.tail1.mirror = true;
        this.setRotation(this.tail1, -0.4014257F, 0.0F, 0.0F);
        this.tailspikes1 = new ModelRenderer(this, 58, 93);
        this.tailspikes1.addBox(0.0F, -4.5F, 0.0F, 0, 8, 11);
        this.tailspikes1.setRotationPoint(0.0F, 6.5F, 10.5F);
        this.tailspikes1.setTextureSize(256, 128);
        this.tailspikes1.mirror = true;
        this.setRotation(this.tailspikes1, -0.4014257F, 0.0F, 0.0F);
        this.lArm = new ModelRenderer(this, 40, 29);
        this.lArm.addBox(-1.0F, -1.0F, -1.0F, 2, 13, 2);
        this.lArm.setRotationPoint(4.5F, 0.0F, -10.0F);
        this.lArm.setTextureSize(64, 32);
        this.lArm.mirror = true;
        this.setRotation(this.lArm, 0.3665191F, 0.0F, -0.5934119F);
        this.rArm = new ModelRenderer(this, 50, 29);
        this.rArm.addBox(-1.0F, -1.0F, -1.0F, 2, 13, 2);
        this.rArm.setRotationPoint(-4.5F, 0.0F, -10.0F);
        this.rArm.setTextureSize(64, 32);
        this.rArm.mirror = true;
        this.setRotation(this.rArm, 0.3665191F, 0.0F, 0.5934119F);
        this.lArm2 = new ModelRenderer(this, 83, 24);
        this.lArm2.addBox(-1.0F, 11.0F, -13.5F, 2, 1, 3);
        this.lArm2.setRotationPoint(4.5F, 0.0F, -10.0F);
        this.lArm2.setTextureSize(64, 32);
        this.lArm2.mirror = true;
        this.setRotation(this.lArm2, 0.3665191F, 0.0F, -0.5934119F);
        this.rArm2 = new ModelRenderer(this, 98, 9);
        this.rArm2.addBox(-1.0F, 10.5F, -10.5F, 2, 2, 11);
        this.rArm2.setRotationPoint(-4.5F, 0.0F, -10.0F);
        this.rArm2.setTextureSize(64, 32);
        this.rArm2.mirror = true;
        this.setRotation(this.rArm2, 0.3665191F, 0.0F, 0.5934119F);
        this.lClaw = new ModelRenderer(this, 71, 9);
        this.lClaw.addBox(-1.0F, 10.5F, -10.5F, 2, 2, 11);
        this.lClaw.setRotationPoint(4.5F, 0.0F, -10.0F);
        this.lClaw.setTextureSize(64, 32);
        this.lClaw.mirror = true;
        this.setRotation(this.lClaw, 0.3665191F, 0.0F, -0.5934119F);
        this.rClaw = new ModelRenderer(this, 72, 24);
        this.rClaw.addBox(-1.0F, 11.0F, -13.5F, 2, 1, 3);
        this.rClaw.setRotationPoint(-4.5F, 0.0F, -10.0F);
        this.rClaw.setTextureSize(64, 32);
        this.rClaw.mirror = true;
        this.setRotation(this.rClaw, 0.3665191F, 0.0F, 0.5934119F);
        this.lClaw2 = new ModelRenderer(this, 60, 30);
        this.lClaw2.addBox(-2.0F, 11.5F, -16.5F, 3, 0, 6);
        this.lClaw2.setRotationPoint(4.5F, 0.0F, -10.0F);
        this.lClaw2.setTextureSize(64, 32);
        this.lClaw2.mirror = true;
        this.setRotation(this.lClaw2, 0.3665191F, 0.0F, -0.5934119F);
        this.rClaw2 = new ModelRenderer(this, 60, 38);
        this.rClaw2.addBox(-1.0F, 11.5F, -16.5F, 3, 0, 6);
        this.rClaw2.setRotationPoint(-4.5F, 0.0F, -10.0F);
        this.rClaw2.setTextureSize(64, 32);
        this.rClaw2.mirror = true;
        this.setRotation(this.rClaw2, 0.3665191F, 0.0F, 0.5934119F);
    }

    @Override
    public void render(Entity entity, float swingProgress, float swingProgressPrev, float idleProgress, float headYaw, float headPitch, float boxTranslation)
    {
        super.render(entity, swingProgress, swingProgressPrev, idleProgress, headYaw, headPitch, boxTranslation);
        this.setRotationAngles(swingProgress, swingProgressPrev, idleProgress, headYaw, headPitch, boxTranslation, entity);
        this.torso.render(boxTranslation);
        this.stomache.render(boxTranslation);
        this.rThigh.render(boxTranslation);
        this.lThigh.render(boxTranslation);
        this.lShin.render(boxTranslation);
        this.rShin.render(boxTranslation);
        this.lShin1.render(boxTranslation);
        this.rShin1.render(boxTranslation);
        this.lFoot.render(boxTranslation);
        this.rFoot.render(boxTranslation);
        this.lArm.render(boxTranslation);
        this.rArm.render(boxTranslation);
        this.lClaw.render(boxTranslation);
        this.rArm2.render(boxTranslation);
        this.neck.render(boxTranslation);
        this.headBase.render(boxTranslation);
        this.face1.render(boxTranslation);
        this.jaw1.render(boxTranslation);
        this.jaw2.render(boxTranslation);
        this.head2.render(boxTranslation);
        this.lArm2.render(boxTranslation);
        this.rClaw.render(boxTranslation);
        this.lClaw2.render(boxTranslation);
        this.rClaw2.render(boxTranslation);
        this.vertibrae1.render(boxTranslation);
        this.vertibrae2.render(boxTranslation);
        this.tailspines1.render(boxTranslation);
        this.tail2.render(boxTranslation);
        this.tail3.render(boxTranslation);
        this.stabber.render(boxTranslation);
        this.tail4.render(boxTranslation);
        this.tail5.render(boxTranslation);
        this.face2.render(boxTranslation);
        this.tailspines5.render(boxTranslation);
        this.tailspikes5.render(boxTranslation);
        this.tailspikes4.render(boxTranslation);
        this.tailspines4.render(boxTranslation);
        this.tailspines3.render(boxTranslation);
        this.tailspikes3.render(boxTranslation);
        this.tailspines2.render(boxTranslation);
        this.tailspikes2.render(boxTranslation);
        this.tail1.render(boxTranslation);
        this.tailspikes1.render(boxTranslation);
        this.backStabber1.render(boxTranslation);
        this.backStabber2.render(boxTranslation);
        this.backStabber3.render(boxTranslation);
        this.backStabber4.render(boxTranslation);
        this.headSide1.render(boxTranslation);
        this.headSide2.render(boxTranslation);
        this.backStabber5.render(boxTranslation);
        this.backStabber6.render(boxTranslation);
    }

    @Override
    public void setRotationAngles(float swingProgress, float swingProgressPrev, float idleProgress, float headYaw, float headPitch, float boxTranslation, Entity entity)
    {
        super.setRotationAngles(swingProgress, swingProgressPrev, idleProgress, headYaw, headPitch, boxTranslation, entity);

        float newangle = MathHelper.cos(idleProgress * 4.0F * this.wingspeed) * (float) Math.PI * 0.5F * swingProgressPrev;
        this.doTail(newangle);
        this.lThigh.rotateAngleX = MathHelper.cos(swingProgress * 0.6662F) * 1.4F * swingProgressPrev - 0.8028515F;
        this.lShin.rotateAngleX = MathHelper.cos(swingProgress * 0.6662F) * 1.4F * swingProgressPrev - 0.4014257F;
        this.lShin1.rotateAngleX = MathHelper.cos(swingProgress * 0.6662F) * 1.4F * swingProgressPrev - 0.8028515F;
        this.lFoot.rotateAngleX = MathHelper.cos(swingProgress * 0.6662F) * 1.4F * swingProgressPrev;
        this.rThigh.rotateAngleX = MathHelper.cos(swingProgress * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev - 0.8028515F;
        this.rShin.rotateAngleX = MathHelper.cos(swingProgress * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev - 0.4014257F;
        this.rShin1.rotateAngleX = MathHelper.cos(swingProgress * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev - 0.8028515F;
        this.rFoot.rotateAngleX = MathHelper.cos(swingProgress * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev;
        this.rArm.rotateAngleX = MathHelper.cos(swingProgress * 0.6662F) * 1.4F * swingProgressPrev + 0.3665191F;
        this.rClaw.rotateAngleX = MathHelper.cos(swingProgress * 0.6662F) * 1.4F * swingProgressPrev + 0.3665191F;
        this.rArm2.rotateAngleX = MathHelper.cos(swingProgress * 0.6662F) * 1.4F * swingProgressPrev + 0.3665191F;
        this.rClaw2.rotateAngleX = MathHelper.cos(swingProgress * 0.6662F) * 1.4F * swingProgressPrev + 0.3665191F;
        this.lArm.rotateAngleX = MathHelper.cos(swingProgress * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev + 0.3665191F;
        this.lClaw.rotateAngleX = MathHelper.cos(swingProgress * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev + 0.3665191F;
        this.lArm2.rotateAngleX = MathHelper.cos(swingProgress * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev + 0.3665191F;
        this.lClaw2.rotateAngleX = MathHelper.cos(swingProgress * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev + 0.3665191F;
        this.headSide1.rotateAngleY = 0.36F + (float) Math.toRadians(headYaw) * 0.75F;
        this.headSide2.rotateAngleY = -0.36F + (float) Math.toRadians(headYaw) * 0.75F;
        this.head2.rotateAngleY = (float) Math.toRadians(headYaw) * 0.75F;
        this.headBase.rotateAngleY = (float) Math.toRadians(headYaw) * 0.75F;
        this.jaw1.rotateAngleY = (float) Math.toRadians(headYaw) * 0.75F;
        this.face1.rotateAngleY = (float) Math.toRadians(headYaw) * 0.75F;
        this.face2.rotateAngleY = (float) Math.toRadians(headYaw) * 0.75F;
        this.jaw2.rotateAngleY = (float) Math.toRadians(headYaw) * 0.75F;
        this.jaw2.rotateAngleX = 0.122F + Math.abs(newangle);
        this.backStabber2.rotateAngleX = 0.69F + Math.abs(newangle);
        this.backStabber5.rotateAngleX = -0.69F - Math.abs(newangle);
        this.backStabber4.rotateAngleX = 0.52F + Math.abs(newangle * 0.75F);
        this.backStabber1.rotateAngleX = -1.1F - Math.abs(newangle * 0.75F);
        this.backStabber6.rotateAngleX = 0.35F + Math.abs(newangle * 0.5F);
        this.backStabber3.rotateAngleX = -1.5F - Math.abs(newangle * 0.5F);
        newangle = MathHelper.cos(idleProgress * 3.5F * this.wingspeed) * (float) Math.PI * 0.4F;
    }

    private void doTail(float angle)
    {
        this.tail1.rotateAngleY = angle;
        this.tailspikes1.rotateAngleY = angle;
        this.tailspines1.rotateAngleY = angle;
        this.tail2.rotateAngleY = angle * 0.5F;
        this.tail2.rotationPointZ = this.tail1.rotationPointZ + (float) Math.cos(this.tail1.rotateAngleY) * 10.0F;
        this.tail2.rotationPointX = this.tail1.rotationPointX + (float) Math.sin(this.tail1.rotateAngleY) * 10.0F;
        this.tailspikes2.rotateAngleY = angle;
        this.tailspikes2.rotationPointZ = this.tail1.rotationPointZ + (float) Math.cos(this.tail1.rotateAngleY) * 10.0F;
        this.tailspikes2.rotationPointX = this.tail1.rotationPointX + (float) Math.sin(this.tail1.rotateAngleY) * 10.0F;
        this.tailspines2.rotateAngleY = angle;
        this.tailspines2.rotationPointZ = this.tail1.rotationPointZ + (float) Math.cos(this.tail1.rotateAngleY) * 10.0F;
        this.tailspines2.rotationPointX = this.tail1.rotationPointX + (float) Math.sin(this.tail1.rotateAngleY) * 10.0F;
        this.tail3.rotateAngleY = angle * 0.8F;
        this.tail3.rotationPointZ = this.tail2.rotationPointZ + (float) Math.cos(this.tail2.rotateAngleY) * 10.0F;
        this.tail3.rotationPointX = this.tail2.rotationPointX + (float) Math.sin(this.tail2.rotateAngleY) * 10.0F;
        this.tailspikes3.rotateAngleY = angle;
        this.tailspikes3.rotationPointZ = this.tail2.rotationPointZ + (float) Math.cos(this.tail2.rotateAngleY) * 10.0F;
        this.tailspikes3.rotationPointX = this.tail2.rotationPointX + (float) Math.sin(this.tail2.rotateAngleY) * 10.0F;
        this.tailspines3.rotateAngleY = angle;
        this.tailspines3.rotationPointZ = this.tail2.rotationPointZ + (float) Math.cos(this.tail2.rotateAngleY) * 10.0F;
        this.tailspines3.rotationPointX = this.tail2.rotationPointX + (float) Math.sin(this.tail2.rotateAngleY) * 10.0F;
        this.tail4.rotateAngleY = angle * 1.25F;
        this.tail4.rotationPointZ = this.tail3.rotationPointZ + (float) Math.cos(this.tail3.rotateAngleY) * 10.0F;
        this.tail4.rotationPointX = this.tail3.rotationPointX + (float) Math.sin(this.tail3.rotateAngleY) * 10.0F;
        this.tailspikes4.rotateAngleY = angle;
        this.tailspikes4.rotationPointZ = this.tail3.rotationPointZ + (float) Math.cos(this.tail3.rotateAngleY) * 10.0F;
        this.tailspikes4.rotationPointX = this.tail3.rotationPointX + (float) Math.sin(this.tail3.rotateAngleY) * 10.0F;
        this.tailspines4.rotateAngleY = angle;
        this.tailspines4.rotationPointZ = this.tail3.rotationPointZ + (float) Math.cos(this.tail3.rotateAngleY) * 10.0F;
        this.tailspines4.rotationPointX = this.tail3.rotationPointX + (float) Math.sin(this.tail3.rotateAngleY) * 10.0F;
        this.tail5.rotateAngleY = angle * 1.5F;
        this.tail5.rotationPointZ = this.tail4.rotationPointZ + (float) Math.cos(this.tail4.rotateAngleY) * 10.0F;
        this.tail5.rotationPointX = this.tail4.rotationPointX + (float) Math.sin(this.tail4.rotateAngleY) * 10.0F;
        this.tailspikes5.rotateAngleY = angle;
        this.tailspikes5.rotationPointZ = this.tail4.rotationPointZ + (float) Math.cos(this.tail4.rotateAngleY) * 10.0F;
        this.tailspikes5.rotationPointX = this.tail4.rotationPointX + (float) Math.sin(this.tail4.rotateAngleY) * 10.0F;
        this.tailspines5.rotateAngleY = angle;
        this.tailspines5.rotationPointZ = this.tail4.rotationPointZ + (float) Math.cos(this.tail4.rotateAngleY) * 10.0F;
        this.tailspines5.rotationPointX = this.tail4.rotationPointX + (float) Math.sin(this.tail4.rotateAngleY) * 10.0F;
        this.stabber.rotateAngleY = angle * 2.0F;
        this.stabber.rotationPointZ = this.tail5.rotationPointZ + (float) Math.cos(this.tail5.rotateAngleY) * 10.0F;
        this.stabber.rotationPointX = this.tail5.rotationPointX + (float) Math.sin(this.tail5.rotateAngleY) * 10.0F;
    }
}
