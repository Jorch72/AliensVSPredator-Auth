package org.avp.entities.mob.model;

import com.arisux.airi.lib.client.ModelBaseWrapper;

import net.minecraft.client.model.ModelRenderer;

public class ModelPredalien extends ModelBaseWrapper
{
    public ModelRenderer leftFootToe2, leftFootBackToe, LeftThigh, leftFootToe1, leftFoot, leftFootToe3, leftShin, topTorso, abdomin, backSpikes, rightLowerSpike, rightTopSpike, leftTopSpike, leftLowerSpike, neck, rightFootToe3, rightFootToe2, rightFootBackToe, rightShin, RightThigh, rightFootToe1, rightFoot, leftFinger4, leftForearm, leftBicep, leftFinger3, leftFinger2, leftFinger1, leftShoulder, rightFinger4, rightShoulder, rightBicep, rightForearm, rightFinger2, rightFinger3, rightFinger1, tailBase, tail1, tail2, tail3, tail4, tailStabber, headTop, dread7, midHeadSpike, dread8, dread6, dread5, dread4, faceMid, dread3, rightLowerMandible, dread2, leftLowerMandible, dread1, rightLowerMandible2, headTopRidge, leftLowerMandible2, rightInnerJawWebbing, faceTop, rightJawWebbing, rightUpperTooth, leftLowerTooth, leftUpperTooth, rightLowerTooth, leftUpperMandible, leftJawWebbing, bottomTeeth, leftInnerJawWebbing, midJaw, rightUpperMandible, topTeeth;

    public ModelPredalien()
    {
        textureWidth = 256;
        textureHeight = 256;

        leftFootToe2 = new ModelRenderer(this, 143, 69);
        leftFootToe2.addBox(3F, 21.3F, -20.2F, 0, 3, 9);
        leftFootToe2.setRotationPoint(1F, -6F, 7F);
        leftFootToe2.setTextureSize(256, 256);
        leftFootToe2.mirror = true;
        setRotation(leftFootToe2, 0.2792527F, -0.296706F, -0.0296706F);
        leftFootBackToe = new ModelRenderer(this, 143, 82);
        leftFootBackToe.addBox(3.5F, 21.4F, 4.5F, 0, 3, 5);
        leftFootBackToe.setRotationPoint(1F, -6F, 7F);
        leftFootBackToe.setTextureSize(256, 256);
        leftFootBackToe.mirror = true;
        setRotation(leftFootBackToe, -0.296706F, -0.296706F, -0.0296706F);
        LeftThigh = new ModelRenderer(this, 122, 69);
        LeftThigh.addBox(-1.5F, -2F, -2F, 5, 16, 5);
        LeftThigh.setRotationPoint(1F, -6F, 7F);
        LeftThigh.setTextureSize(256, 256);
        LeftThigh.mirror = true;
        setRotation(LeftThigh, -0.4712389F, -0.3490659F, -0.2443461F);
        leftFootToe1 = new ModelRenderer(this, 162, 69);
        leftFootToe1.addBox(1.7F, 21.5F, -19.2F, 0, 3, 9);
        leftFootToe1.setRotationPoint(1F, -6F, 7F);
        leftFootToe1.setTextureSize(256, 256);
        leftFootToe1.mirror = true;
        setRotation(leftFootToe1, 0.2792527F, -0.1047198F, -0.0645772F);
        leftFoot = new ModelRenderer(this, 122, 91);
        leftFoot.addBox(2.6F, 21.7F, -15.2F, 4, 2, 7);
        leftFoot.setRotationPoint(1F, -6F, 7F);
        leftFoot.setTextureSize(256, 256);
        leftFoot.mirror = true;
        setRotation(leftFoot, 0.296706F, -0.2443461F, 0.0174533F);
        leftFootToe3 = new ModelRenderer(this, 181, 69);
        leftFootToe3.addBox(3.7F, 21.2F, -20.2F, 0, 3, 9);
        leftFootToe3.setRotationPoint(1F, -6F, 7F);
        leftFootToe3.setTextureSize(256, 256);
        leftFootToe3.mirror = true;
        setRotation(leftFootToe3, 0.2792527F, -0.418879F, -0.0296706F);
        leftShin = new ModelRenderer(this, 105, 69);
        leftShin.addBox(2.6F, 9.7F, -7.9F, 4, 15, 4);
        leftShin.setRotationPoint(1F, -6F, 7F);
        leftShin.setTextureSize(256, 256);
        leftShin.mirror = true;
        setRotation(leftShin, 0.1047198F, -0.2443461F, 0.0174533F);
        topTorso = new ModelRenderer(this, 0, 0);
        topTorso.addBox(-2F, -1.6F, -4F, 12, 8, 8);
        topTorso.setRotationPoint(-4F, -20F, 5F);
        topTorso.setTextureSize(256, 256);
        topTorso.mirror = true;
        setRotation(topTorso, 0.1745329F, 0F, 0F);
        abdomin = new ModelRenderer(this, 0, 17);
        abdomin.addBox(0F, 4.4F, -3.5F, 8, 10, 6);
        abdomin.setRotationPoint(-4F, -20F, 5F);
        abdomin.setTextureSize(256, 256);
        abdomin.mirror = true;
        setRotation(abdomin, 0.2792527F, 0F, 0F);
        backSpikes = new ModelRenderer(this, 29, 17);
        backSpikes.addBox(4F, -1.6F, 3F, 0, 15, 8);
        backSpikes.setRotationPoint(-4F, -20F, 5F);
        backSpikes.setTextureSize(256, 256);
        backSpikes.mirror = true;
        setRotation(backSpikes, 0.1745329F, 0F, 0F);
        rightLowerSpike = new ModelRenderer(this, 46, 17);
        rightLowerSpike.addBox(0.2333333F, 2.266667F, 3F, 2, 2, 11);
        rightLowerSpike.setRotationPoint(-4F, -20F, 5F);
        rightLowerSpike.setTextureSize(256, 256);
        rightLowerSpike.mirror = true;
        setRotation(rightLowerSpike, -0.2094395F, -0.4712389F, -0.4014257F);
        rightTopSpike = new ModelRenderer(this, 41, 0);
        rightTopSpike.addBox(0.5F, 0.2666667F, 2F, 2, 2, 14);
        rightTopSpike.setRotationPoint(-4F, -20F, 5F);
        rightTopSpike.setTextureSize(256, 256);
        rightTopSpike.mirror = true;
        setRotation(rightTopSpike, 0.2094395F, -0.4712389F, -0.4014257F);
        leftTopSpike = new ModelRenderer(this, 41, 0);
        leftTopSpike.addBox(-0.5F, -0.3F, 3F, 2, 2, 14);
        leftTopSpike.setRotationPoint(1.5F, -20F, 5F);
        leftTopSpike.setTextureSize(256, 256);
        leftTopSpike.mirror = true;
        setRotation(leftTopSpike, 0.2094395F, 0.4712389F, 0.4014257F);
        leftLowerSpike = new ModelRenderer(this, 46, 17);
        leftLowerSpike.addBox(-0.2F, 1F, 3F, 2, 2, 11);
        leftLowerSpike.setRotationPoint(1.5F, -20F, 5F);
        leftLowerSpike.setTextureSize(256, 256);
        leftLowerSpike.mirror = true;
        setRotation(leftLowerSpike, -0.2094395F, 0.4712389F, 0.4014257F);
        neck = new ModelRenderer(this, 0, 34);
        neck.addBox(-2.5F, -3F, -2F, 5, 9, 6);
        neck.setRotationPoint(0F, -25F, 2F);
        neck.setTextureSize(256, 256);
        neck.mirror = true;
        setRotation(neck, 0.4886922F, 0F, 0F);
        rightFootToe3 = new ModelRenderer(this, 181, 69);
        rightFootToe3.addBox(-4.8F, 21F, -21.2F, 0, 3, 9);
        rightFootToe3.setRotationPoint(-1F, -6F, 7F);
        rightFootToe3.setTextureSize(256, 256);
        rightFootToe3.mirror = true;
        setRotation(rightFootToe3, 0.2792527F, 0.4537856F, -0.0261799F);
        rightFootToe2 = new ModelRenderer(this, 143, 69);
        rightFootToe2.addBox(-4.8F, 21F, -20.5F, 0, 3, 9);
        rightFootToe2.setRotationPoint(-1F, -6F, 7F);
        rightFootToe2.setTextureSize(256, 256);
        rightFootToe2.mirror = true;
        setRotation(rightFootToe2, 0.2792527F, 0.2443461F, -0.0174533F);
        rightFootBackToe = new ModelRenderer(this, 143, 82);
        rightFootBackToe.addBox(-4.8F, 21.7F, 3.8F, 0, 3, 5);
        rightFootBackToe.setRotationPoint(-1F, -6F, 7F);
        rightFootBackToe.setTextureSize(256, 256);
        rightFootBackToe.mirror = true;
        setRotation(rightFootBackToe, -0.2617994F, 0.2443461F, -0.0174533F);
        rightShin = new ModelRenderer(this, 105, 69);
        rightShin.addBox(-6.6F, 9.7F, -8F, 4, 15, 4);
        rightShin.setRotationPoint(-1F, -6F, 7F);
        rightShin.setTextureSize(256, 256);
        rightShin.mirror = true;
        setRotation(rightShin, 0.1047198F, 0.2443461F, -0.0174533F);
        RightThigh = new ModelRenderer(this, 122, 69);
        RightThigh.addBox(-3.5F, -2F, -2F, 5, 16, 5);
        RightThigh.setRotationPoint(-1F, -6F, 7F);
        RightThigh.setTextureSize(256, 256);
        RightThigh.mirror = true;
        setRotation(RightThigh, -0.4712389F, 0.3490659F, 0.2443461F);
        rightFootToe1 = new ModelRenderer(this, 162, 69);
        rightFootToe1.addBox(-3.8F, 21.4F, -19.2F, 0, 3, 9);
        rightFootToe1.setRotationPoint(-1F, -6F, 7F);
        rightFootToe1.setTextureSize(256, 256);
        rightFootToe1.mirror = true;
        setRotation(rightFootToe1, 0.2792527F, 0.0698132F, 0F);
        rightFoot = new ModelRenderer(this, 122, 91);
        rightFoot.addBox(-6.6F, 21.7F, -15.2F, 4, 2, 7);
        rightFoot.setRotationPoint(-1F, -6F, 7F);
        rightFoot.setTextureSize(256, 256);
        rightFoot.mirror = true;
        setRotation(rightFoot, 0.2792527F, 0.2443461F, -0.0174533F);
        leftFinger4 = new ModelRenderer(this, 105, 55);
        leftFinger4.addBox(-2.6F, 16.8F, 2F, 0, 9, 3);
        leftFinger4.setRotationPoint(6F, -19F, 6F);
        leftFinger4.setTextureSize(256, 256);
        leftFinger4.mirror = true;
        setRotation(leftFinger4, -0.4066617F, 0F, -0.665494F);
        leftForearm = new ModelRenderer(this, 133, 52);
        leftForearm.addBox(-3.3F, 7.4F, 4.6F, 3, 13, 2);
        leftForearm.setRotationPoint(6F, -19F, 6F);
        leftForearm.setTextureSize(256, 256);
        leftForearm.mirror = false;
        setRotation(leftForearm, -0.4991642F, 0F, -0.5607743F);
        leftBicep = new ModelRenderer(this, 144, 51);
        leftBicep.addBox(-3.5F, -1.6F, -2.5F, 4, 12, 4);
        leftBicep.setRotationPoint(6F, -19F, 6F);
        leftBicep.setTextureSize(256, 256);
        leftBicep.mirror = true;
        setRotation(leftBicep, 0.1396263F, 0F, -0.5235988F);
        leftFinger3 = new ModelRenderer(this, 112, 54);
        leftFinger3.addBox(-1.5F, 17F, 2F, 0, 10, 3);
        leftFinger3.setRotationPoint(6F, -19F, 6F);
        leftFinger3.setTextureSize(256, 256);
        leftFinger3.mirror = true;
        setRotation(leftFinger3, -0.4068485F, 0.1570796F, -0.5956809F);
        leftFinger2 = new ModelRenderer(this, 119, 54);
        leftFinger2.addBox(-0.2F, 16.9F, 2F, 0, 10, 3);
        leftFinger2.setRotationPoint(6F, -19F, 6F);
        leftFinger2.setTextureSize(256, 256);
        leftFinger2.mirror = true;
        setRotation(leftFinger2, -0.4068485F, 0.1745329F, -0.4909611F);
        leftFinger1 = new ModelRenderer(this, 126, 55);
        leftFinger1.addBox(2F, 16.6F, 3F, 0, 9, 3);
        leftFinger1.setRotationPoint(6F, -19F, 6F);
        leftFinger1.setTextureSize(256, 256);
        leftFinger1.mirror = true;
        setRotation(leftFinger1, -0.3968485F, 0.2617994F, -0.3513348F);
        leftShoulder = new ModelRenderer(this, 161, 55);
        leftShoulder.addBox(-4.5F, -3.6F, -3.5F, 6, 6, 6);
        leftShoulder.setRotationPoint(6F, -19F, 6F);
        leftShoulder.setTextureSize(256, 256);
        leftShoulder.mirror = true;
        setRotation(leftShoulder, 0.1396263F, 0F, -0.5235988F);
        rightFinger4 = new ModelRenderer(this, 105, 55);
        rightFinger4.addBox(3.1F, 16.6F, 2F, 0, 9, 3);
        rightFinger4.setRotationPoint(-6F, -19F, 6F);
        rightFinger4.setTextureSize(256, 256);
        rightFinger4.mirror = true;
        setRotation(rightFinger4, -0.365405F, 0.1745329F, 0.6480438F);
        rightShoulder = new ModelRenderer(this, 161, 55);
        rightShoulder.addBox(-1.5F, -3.6F, -3.5F, 6, 6, 6);
        rightShoulder.setRotationPoint(-6F, -19F, 6F);
        rightShoulder.setTextureSize(256, 256);
        rightShoulder.mirror = true;
        setRotation(rightShoulder, 0.1396263F, 0F, 0.5235988F);
        rightBicep = new ModelRenderer(this, 144, 51);
        rightBicep.addBox(-0.5F, -1.6F, -2.5F, 4, 12, 4);
        rightBicep.setRotationPoint(-6F, -19F, 6F);
        rightBicep.setTextureSize(256, 256);
        rightBicep.mirror = true;
        setRotation(rightBicep, 0.1396263F, 0F, 0.5235988F);
        rightForearm = new ModelRenderer(this, 133, 52);
        rightForearm.addBox(0.5F, 7.4F, 4.5F, 3, 13, 2);
        rightForearm.setRotationPoint(-6F, -19F, 6F);
        rightForearm.setTextureSize(256, 256);
        rightForearm.mirror = true;
        setRotation(rightForearm, -0.495405F, 0F, 0.5607774F);
        rightFinger2 = new ModelRenderer(this, 119, 54);
        rightFinger2.addBox(0F, 16.6F, 3.5F, 0, 10, 3);
        rightFinger2.setRotationPoint(-6F, -19F, 6F);
        rightFinger2.setTextureSize(256, 256);
        rightFinger2.mirror = true;
        setRotation(rightFinger2, -0.465405F, 0F, 0.4386043F);
        rightFinger3 = new ModelRenderer(this, 112, 54);
        rightFinger3.addBox(1.5F, 16.6F, 3.5F, 0, 10, 3);
        rightFinger3.setRotationPoint(-6F, -19F, 6F);
        rightFinger3.setTextureSize(256, 256);
        rightFinger3.mirror = true;
        setRotation(rightFinger3, -0.465405F, 0F, 0.5607774F);
        rightFinger1 = new ModelRenderer(this, 126, 55);
        rightFinger1.addBox(-1F, 16.6F, 2.4F, 0, 9, 3);
        rightFinger1.setRotationPoint(-6F, -19F, 6F);
        rightFinger1.setTextureSize(256, 256);
        rightFinger1.mirror = true;
        setRotation(rightFinger1, -0.3983254F, -0.1745329F, 0.3687912F);
        tailBase = new ModelRenderer(this, 49, 33);
        tailBase.addBox(-3F, 0.06666667F, -3F, 6, 9, 6);
        tailBase.setRotationPoint(0F, -7F, 8F);
        tailBase.setTextureSize(256, 256);
        tailBase.mirror = true;
        setRotation(tailBase, 0.6981317F, 0F, 0F);
        tail1 = new ModelRenderer(this, 76, 0);
        tail1.addBox(-2.5F, -0.9333333F, -4F, 5, 9, 5);
        tail1.setRotationPoint(0F, -1F, 15F);
        tail1.setTextureSize(256, 256);
        tail1.mirror = true;
        setRotation(tail1, 0.8726646F, 0F, 0F);
        tail2 = new ModelRenderer(this, 76, 15);
        tail2.addBox(-2F, -0.9333333F, -3F, 4, 9, 4);
        tail2.setRotationPoint(0F, 5F, 21F);
        tail2.setTextureSize(256, 256);
        tail2.mirror = true;
        setRotation(tail2, 1.047198F, 0F, 0F);
        tail3 = new ModelRenderer(this, 76, 29);
        tail3.addBox(-1.5F, -1.2F, -1.6F, 3, 9, 3);
        tail3.setRotationPoint(0F, 10F, 28F);
        tail3.setTextureSize(256, 256);
        tail3.mirror = true;
        setRotation(tail3, 1.396263F, 0F, 0F);
        tail4 = new ModelRenderer(this, 89, 29);
        tail4.addBox(-1F, -1.2F, -2.6F, 2, 9, 2);
        tail4.setRotationPoint(0F, 10F, 36F);
        tail4.setTextureSize(256, 256);
        tail4.mirror = true;
        setRotation(tail4, 1.53589F, 0F, 0F);
        tailStabber = new ModelRenderer(this, 97, 0);
        tailStabber.addBox(0F, -1.2F, -3.6F, 0, 10, 5);
        tailStabber.setRotationPoint(0F, 10F, 44F);
        tailStabber.setTextureSize(256, 256);
        tailStabber.mirror = true;
        setRotation(tailStabber, 1.570796F, 0F, 0F);
        headTop = new ModelRenderer(this, 57, 51);
        headTop.addBox(-3.5F, -19.6F, -11.5F, 7, 17, 7);
        headTop.setRotationPoint(0F, -22F, 0F);
        headTop.setTextureSize(256, 256);
        headTop.mirror = true;
        setRotation(headTop, -1.466077F, 0F, 0F);
        dread7 = new ModelRenderer(this, 0, 51);
        dread7.addBox(-8.5F, -16.6F, -10.5F, 17, 0, 11);
        dread7.setRotationPoint(0F, -22F, 0F);
        dread7.setTextureSize(256, 256);
        dread7.mirror = true;
        setRotation(dread7, -1.466077F, 0F, 0F);
        midHeadSpike = new ModelRenderer(this, 57, 113);
        midHeadSpike.addBox(0F, -19.6F, -15.5F, 0, 26, 10);
        midHeadSpike.setRotationPoint(0F, -22F, 0F);
        midHeadSpike.setTextureSize(256, 256);
        midHeadSpike.mirror = true;
        setRotation(midHeadSpike, -1.466077F, 0F, 0F);
        dread8 = new ModelRenderer(this, 0, 63);
        dread8.addBox(-8.5F, -18.6F, -10.5F, 17, 0, 11);
        dread8.setRotationPoint(0F, -22F, 0F);
        dread8.setTextureSize(256, 256);
        dread8.mirror = true;
        setRotation(dread8, -1.466077F, 0F, 0F);
        dread6 = new ModelRenderer(this, 0, 75);
        dread6.addBox(-8.5F, -14.6F, -10.5F, 17, 0, 11);
        dread6.setRotationPoint(0F, -22F, 0F);
        dread6.setTextureSize(256, 256);
        dread6.mirror = true;
        setRotation(dread6, -1.466077F, 0F, 0F);
        dread5 = new ModelRenderer(this, 0, 87);
        dread5.addBox(-8.5F, -12.6F, -10.5F, 17, 0, 11);
        dread5.setRotationPoint(0F, -22F, 0F);
        dread5.setTextureSize(256, 256);
        dread5.mirror = true;
        setRotation(dread5, -1.466077F, 0F, 0F);
        dread4 = new ModelRenderer(this, 0, 99);
        dread4.addBox(-8.5F, -10.6F, -10.5F, 17, 0, 11);
        dread4.setRotationPoint(0F, -22F, 0F);
        dread4.setTextureSize(256, 256);
        dread4.mirror = true;
        setRotation(dread4, -1.466077F, 0F, 0F);
        faceMid = new ModelRenderer(this, 99, 101);
        faceMid.addBox(-3.5F, -6.5F, -6.6F, 7, 3, 8);
        faceMid.setRotationPoint(0F, -22F, 0F);
        faceMid.setTextureSize(256, 256);
        faceMid.mirror = true;
        setRotation(faceMid, -0.1570796F, 0F, 0F);
        dread3 = new ModelRenderer(this, 0, 111);
        dread3.addBox(-8.5F, -8.6F, -10.5F, 17, 0, 11);
        dread3.setRotationPoint(0F, -22F, 0F);
        dread3.setTextureSize(256, 256);
        dread3.mirror = true;
        setRotation(dread3, -1.466077F, 0F, 0F);
        rightLowerMandible = new ModelRenderer(this, 99, 90);
        rightLowerMandible.addBox(-3F, -0.5F, -7.5F, 1, 1, 9);
        rightLowerMandible.setRotationPoint(0F, -22F, 0F);
        rightLowerMandible.setTextureSize(256, 256);
        rightLowerMandible.mirror = true;
        setRotation(rightLowerMandible, 0.1745329F, 0.1919862F, 0.2443461F);
        dread2 = new ModelRenderer(this, 0, 123);
        dread2.addBox(-8.5F, -6.6F, -10.5F, 17, 0, 11);
        dread2.setRotationPoint(0F, -22F, 0F);
        dread2.setTextureSize(256, 256);
        dread2.mirror = true;
        setRotation(dread2, -1.466077F, 0F, 0F);
        leftLowerMandible = new ModelRenderer(this, 99, 90);
        leftLowerMandible.addBox(1.8F, -0.5F, -7.5F, 1, 1, 9);
        leftLowerMandible.setRotationPoint(0F, -22F, 0F);
        leftLowerMandible.setTextureSize(256, 256);
        leftLowerMandible.mirror = true;
        setRotation(leftLowerMandible, 0.1745329F, -0.1919862F, -0.2443461F);
        dread1 = new ModelRenderer(this, 0, 135);
        dread1.addBox(-8.5F, -4.6F, -10.5F, 17, 0, 11);
        dread1.setRotationPoint(0F, -22F, 0F);
        dread1.setTextureSize(256, 256);
        dread1.mirror = true;
        setRotation(dread1, -1.466077F, 0F, 0F);
        rightLowerMandible2 = new ModelRenderer(this, 99, 85);
        rightLowerMandible2.addBox(-3F, -2.9F, -7.5F, 1, 2, 1);
        rightLowerMandible2.setRotationPoint(0F, -22F, 0F);
        rightLowerMandible2.setTextureSize(256, 256);
        rightLowerMandible2.mirror = true;
        setRotation(rightLowerMandible2, 0.3839724F, 0.1919862F, 0.2443461F);
        headTopRidge = new ModelRenderer(this, 78, 113);
        headTopRidge.addBox(-4.5F, -20.6F, -10.5F, 9, 18, 3);
        headTopRidge.setRotationPoint(0F, -22F, 0F);
        headTopRidge.setTextureSize(256, 256);
        headTopRidge.mirror = true;
        setRotation(headTopRidge, -1.466077F, 0F, 0F);
        leftLowerMandible2 = new ModelRenderer(this, 99, 81);
        leftLowerMandible2.addBox(1.9F, -2.9F, -7.5F, 1, 2, 1);
        leftLowerMandible2.setRotationPoint(0F, -22F, 0F);
        leftLowerMandible2.setTextureSize(256, 256);
        leftLowerMandible2.mirror = true;
        setRotation(leftLowerMandible2, 0.3839724F, -0.1745329F, -0.2443461F);
        rightInnerJawWebbing = new ModelRenderer(this, 86, 63);
        rightInnerJawWebbing.addBox(-1.1F, -6.1F, -4F, 0, 4, 8);
        rightInnerJawWebbing.setRotationPoint(0F, -22F, 0F);
        rightInnerJawWebbing.setTextureSize(256, 256);
        rightInnerJawWebbing.mirror = true;
        setRotation(rightInnerJawWebbing, 0.1919862F, 0.0349066F, -0.1570796F);
        faceTop = new ModelRenderer(this, 130, 101);
        faceTop.addBox(-3.5F, -7.3F, -9.2F, 7, 8, 5);
        faceTop.setRotationPoint(0F, -22F, 0F);
        faceTop.setTextureSize(256, 256);
        faceTop.mirror = true;
        setRotation(faceTop, -1.012291F, 0F, 0F);
        rightJawWebbing = new ModelRenderer(this, 86, 51);
        rightJawWebbing.addBox(-2F, -4.1F, -7F, 0, 3, 8);
        rightJawWebbing.setRotationPoint(0F, -22F, 0F);
        rightJawWebbing.setTextureSize(256, 256);
        rightJawWebbing.mirror = true;
        setRotation(rightJawWebbing, 0.0523599F, 0.2792527F, -0.2443461F);
        rightUpperTooth = new ModelRenderer(this, 99, 79);
        rightUpperTooth.addBox(-1.5F, -4F, -7.5F, 2, 1, 0);
        rightUpperTooth.setRotationPoint(0F, -22F, 0F);
        rightUpperTooth.setTextureSize(256, 256);
        rightUpperTooth.mirror = true;
        setRotation(rightUpperTooth, 0F, 0.4363323F, 0.0523599F);
        leftLowerTooth = new ModelRenderer(this, 145, 93);
        leftLowerTooth.addBox(2.3F, -4.9F, -7.5F, 0, 2, 1);
        leftLowerTooth.setRotationPoint(0F, -22F, 0F);
        leftLowerTooth.setTextureSize(256, 256);
        leftLowerTooth.mirror = true;
        setRotation(leftLowerTooth, 0.3839724F, -0.1919862F, -0.2443461F);
        leftUpperTooth = new ModelRenderer(this, 99, 77);
        leftUpperTooth.addBox(-0.5F, -4.1F, -7.6F, 2, 1, 0);
        leftUpperTooth.setRotationPoint(0F, -22F, 0F);
        leftUpperTooth.setTextureSize(256, 256);
        leftUpperTooth.mirror = true;
        setRotation(leftUpperTooth, 0F, -0.4363323F, -0.0523599F);
        rightLowerTooth = new ModelRenderer(this, 145, 97);
        rightLowerTooth.addBox(-2.5F, -4.9F, -7.5F, 0, 2, 1);
        rightLowerTooth.setRotationPoint(0F, -22F, 0F);
        rightLowerTooth.setTextureSize(256, 256);
        rightLowerTooth.mirror = true;
        setRotation(rightLowerTooth, 0.3839724F, 0.1919862F, 0.2443461F);
        leftUpperMandible = new ModelRenderer(this, 103, 113);
        leftUpperMandible.addBox(2.5F, -4F, -7.5F, 1, 1, 8);
        leftUpperMandible.setRotationPoint(0F, -22F, 0F);
        leftUpperMandible.setTextureSize(256, 256);
        leftUpperMandible.mirror = true;
        setRotation(leftUpperMandible, 0F, -0.2792527F, -0.0523599F);
        leftJawWebbing = new ModelRenderer(this, 78, 135);
        leftJawWebbing.addBox(2F, -4.1F, -7F, 0, 3, 8);
        leftJawWebbing.setRotationPoint(0F, -22F, 0F);
        leftJawWebbing.setTextureSize(256, 256);
        leftJawWebbing.mirror = true;
        setRotation(leftJawWebbing, 0.0523599F, -0.2792527F, 0.2443461F);
        bottomTeeth = new ModelRenderer(this, 148, 98);
        bottomTeeth.addBox(-1.5F, -2.5F, -5.5F, 3, 2, 0);
        bottomTeeth.setRotationPoint(0F, -22F, 0F);
        bottomTeeth.setTextureSize(256, 256);
        bottomTeeth.mirror = true;
        setRotation(bottomTeeth, 0F, 0F, 0F);
        leftInnerJawWebbing = new ModelRenderer(this, 103, 123);
        leftInnerJawWebbing.addBox(1.1F, -6.1F, -4F, 0, 4, 8);
        leftInnerJawWebbing.setRotationPoint(0F, -22F, 0F);
        leftInnerJawWebbing.setTextureSize(256, 256);
        leftInnerJawWebbing.mirror = true;
        setRotation(leftInnerJawWebbing, 0.1919862F, -0.0349066F, 0.1570796F);
        midJaw = new ModelRenderer(this, 95, 136);
        midJaw.addBox(-1.5F, -2F, -5.5F, 3, 1, 8);
        midJaw.setRotationPoint(0F, -22F, 0F);
        midJaw.setTextureSize(256, 256);
        midJaw.mirror = true;
        setRotation(midJaw, 0.1919862F, 0F, 0F);
        rightUpperMandible = new ModelRenderer(this, 122, 115);
        rightUpperMandible.addBox(-3.5F, -4F, -7.5F, 1, 1, 8);
        rightUpperMandible.setRotationPoint(0F, -22F, 0F);
        rightUpperMandible.setTextureSize(256, 256);
        rightUpperMandible.mirror = true;
        setRotation(rightUpperMandible, 0F, 0.2792527F, 0.0523599F);
        topTeeth = new ModelRenderer(this, 148, 95);
        topTeeth.addBox(-2F, -4F, -6.5F, 4, 2, 0);
        topTeeth.setRotationPoint(0F, -22F, 0F);
        topTeeth.setTextureSize(256, 256);
        topTeeth.mirror = true;
        setRotation(topTeeth, -0.1570796F, 0F, 0F);
    }
    
    @Override
    protected void render(IRenderObject renderObject, float boxTranslation)
    {
        leftFootToe2.render(boxTranslation);
        leftFootBackToe.render(boxTranslation);
        LeftThigh.render(boxTranslation);
        leftFootToe1.render(boxTranslation);
        leftFoot.render(boxTranslation);
        leftFootToe3.render(boxTranslation);
        leftShin.render(boxTranslation);
        topTorso.render(boxTranslation);
        abdomin.render(boxTranslation);
        backSpikes.render(boxTranslation);
        rightLowerSpike.render(boxTranslation);
        rightTopSpike.render(boxTranslation);
        leftTopSpike.render(boxTranslation);
        leftLowerSpike.render(boxTranslation);
        neck.render(boxTranslation);
        rightFootToe3.render(boxTranslation);
        rightFootToe2.render(boxTranslation);
        rightFootBackToe.render(boxTranslation);
        rightShin.render(boxTranslation);
        RightThigh.render(boxTranslation);
        rightFootToe1.render(boxTranslation);
        rightFoot.render(boxTranslation);
        leftForearm.render(boxTranslation);
        leftBicep.render(boxTranslation);
        leftFinger4.render(boxTranslation);
        leftFinger3.render(boxTranslation);
        leftFinger2.render(boxTranslation);
        leftFinger1.render(boxTranslation);
        leftShoulder.render(boxTranslation);
        rightShoulder.render(boxTranslation);
        rightBicep.render(boxTranslation);
        rightForearm.render(boxTranslation);
        rightFinger1.render(boxTranslation);
        rightFinger2.render(boxTranslation);
        rightFinger3.render(boxTranslation);
        rightFinger4.render(boxTranslation);
        tailBase.render(boxTranslation);
        tail1.render(boxTranslation);
        tail2.render(boxTranslation);
        tail3.render(boxTranslation);
        tail4.render(boxTranslation);
        tailStabber.render(boxTranslation);
        headTop.render(boxTranslation);
        dread7.render(boxTranslation);
        midHeadSpike.render(boxTranslation);
        dread8.render(boxTranslation);
        dread6.render(boxTranslation);
        dread5.render(boxTranslation);
        dread4.render(boxTranslation);
        faceMid.render(boxTranslation);
        dread3.render(boxTranslation);
        rightLowerMandible.render(boxTranslation);
        dread2.render(boxTranslation);
        leftLowerMandible.render(boxTranslation);
        dread1.render(boxTranslation);
        rightLowerMandible2.render(boxTranslation);
        headTopRidge.render(boxTranslation);
        leftLowerMandible2.render(boxTranslation);
        rightInnerJawWebbing.render(boxTranslation);
        faceTop.render(boxTranslation);
        rightJawWebbing.render(boxTranslation);
        rightUpperTooth.render(boxTranslation);
        leftLowerTooth.render(boxTranslation);
        leftUpperTooth.render(boxTranslation);
        rightLowerTooth.render(boxTranslation);
        leftUpperMandible.render(boxTranslation);
        leftJawWebbing.render(boxTranslation);
        bottomTeeth.render(boxTranslation);
        leftInnerJawWebbing.render(boxTranslation);
        midJaw.render(boxTranslation);
        rightUpperMandible.render(boxTranslation);
        topTeeth.render(boxTranslation);
    }
}