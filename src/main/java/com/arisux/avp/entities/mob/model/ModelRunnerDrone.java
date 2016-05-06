package com.arisux.avp.entities.mob.model;

import com.arisux.airi.lib.client.ModelBaseWrapper;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRunnerDrone extends ModelBaseWrapper
{
    public ModelRenderer chest;
    public ModelRenderer abdomen;
    public ModelRenderer rThigh;
    public ModelRenderer lThigh;
    public ModelRenderer lShin1;
    public ModelRenderer rShin1;
    public ModelRenderer lShin2;
    public ModelRenderer rShin2;
    public ModelRenderer lFoot;
    public ModelRenderer rFoot;
    public ModelRenderer lArm1;
    public ModelRenderer rArm1;
    public ModelRenderer lClaw1;
    public ModelRenderer rArm2;
    public ModelRenderer neck;
    public ModelRenderer headBase;
    public ModelRenderer rHead;
    public ModelRenderer jaw;
    public ModelRenderer jaw2;
    public ModelRenderer headTop;
    public ModelRenderer lArm2;
    public ModelRenderer rClaw1;
    public ModelRenderer lClaw2;
    public ModelRenderer rClaw2;
    public ModelRenderer spine1;
    public ModelRenderer spine2;
    public ModelRenderer tail1;
    public ModelRenderer tail2;
    public ModelRenderer tailStabber;
    public ModelRenderer tail3;
    public ModelRenderer tail4;
    public ModelRenderer lHead;
    public ModelRenderer spine5;
    public ModelRenderer spine6;
    public ModelRenderer spine9;
    public ModelRenderer spine11;
    public ModelRenderer tail5;
    public ModelRenderer spine12;

    public ModelRunnerDrone()
    {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.spine2 = new ModelRenderer(this, 23, 65);
        this.spine2.setRotationPoint(0.0F, -2.1666667461395264F, 0.0F);
        this.spine2.addBox(0.0F, -4.5F, 8.0F, 0, 6, 12, 0.0F);
        this.tail4 = new ModelRenderer(this, 178, 66);
        this.tail4.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.tail4.addBox(-0.5F, 8.5F, 41.0F, 1, 1, 11, 0.0F);
        this.setRotation(tail4, -0.05235987901687623F, -0.0F, 0.0F);
        this.lHead = new ModelRenderer(this, 53, 0);
        this.lHead.setRotationPoint(0.0F, 1.5F, -2.0F);
        this.lHead.addBox(-0.49900001287460327F, 1.0F, -5.0F, 3, 3, 5, 0.0F);
        this.setRotation(lHead, -0.12217304855585097F, -0.0F, 0.0F);
        this.spine6 = new ModelRenderer(this, 149, 96);
        this.spine6.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.spine6.addBox(0.0F, 3.0F, 32.0F, 0, 4, 10, 0.0F);
        this.setRotation(spine6, -0.13962633907794952F, -0.0F, 0.0F);
        this.lArm2 = new ModelRenderer(this, 71, 9);
        this.lArm2.setRotationPoint(3.5F, 2.0F, 3.5F);
        this.lArm2.addBox(0.5F, 6.5F, -21.0F, 2, 2, 11, 0.0F);
        this.setRotation(lArm2, 1.1170107126235962F, -0.0F, -0.2094395160675048F);
        this.tail5 = new ModelRenderer(this, 50, 66);
        this.tail5.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.tail5.addBox(-2.0F, -2.5F, 0.0F, 4, 4, 11, 0.0F);
        this.setRotation(tail5, -0.40142571926116943F, -0.0F, 0.0F);
        this.lFoot = new ModelRenderer(this, 110, 24);
        this.lFoot.setRotationPoint(4.5F, 2.0F, 17.0F);
        this.lFoot.addBox(6.0F, 20.0F, -8.0F, 2, 2, 5, 0.0F);
        this.setRotation(lFoot, 0.0F, -0.24434609711170194F, 0.0F);
        this.tail3 = new ModelRenderer(this, 149, 66);
        this.tail3.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.tail3.addBox(-1.0F, 4.0F, 31.0F, 2, 2, 11, 0.0F);
        this.setRotation(tail3, -0.13962633907794952F, -0.0F, 0.0F);
        this.rClaw2 = new ModelRenderer(this, 60, 38);
        this.rClaw2.setRotationPoint(-3.5F, 2.0F, 3.5F);
        this.rClaw2.addBox(-7.0F, 22.0F, -7.5F, 3, 0, 6, 0.0F);
        this.rShin1 = new ModelRenderer(this, 79, 33);
        this.rShin1.setRotationPoint(-4.5F, 2.0F, 16.0F);
        this.rShin1.addBox(-1.0F, 10.0F, -0.5F, 3, 3, 12, 0.0F);
        this.setRotation(rShin1, -0.474893343048477F, 0.22284652255435927F, 0.4301964095080599F);
        this.chest = new ModelRenderer(this, 0, 46);
        this.chest.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.chest.addBox(-4.5F, 0.0F, 0.0F, 9, 8, 10, 0.0F);
        this.rThigh = new ModelRenderer(this, 59, 45);
        this.rThigh.setRotationPoint(-4.5F, 2.0F, 16.0F);
        this.rThigh.addBox(-1.5F, -2.0F, -1.0F, 4, 14, 5, 0.0F);
        this.setRotation(rThigh, -0.4923465963176727F, 0.22284652255435927F, 0.4301964095080599F);
        this.spine11 = new ModelRenderer(this, 90, 93);
        this.spine11.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.spine11.addBox(0.0F, -3.5F, 11.0F, 0, 8, 11, 0.0F);
        this.setRotation(spine11, -0.3141592741012573F, -0.0F, 0.0F);
        this.rHead = new ModelRenderer(this, 34, 0);
        this.rHead.setRotationPoint(0.0F, 1.5F, -2.0F);
        this.rHead.addBox(-2.509999990463257F, 1.0F, -5.0F, 3, 3, 5, 0.0F);
        this.setRotation(rHead, -0.12217304855585097F, -0.0F, 0.0F);
        this.jaw = new ModelRenderer(this, 51, 10);
        this.jaw.setRotationPoint(0.0F, 1.5F, -2.0F);
        this.jaw.addBox(-2.5F, 1.2999999523162842F, -4.5F, 5, 3, 4, 0.0F);
        this.setRotation(jaw, 0.12217304855585097F, -0.0F, 0.0F);
        this.lThigh = new ModelRenderer(this, 40, 45);
        this.lThigh.setRotationPoint(4.5F, 2.0F, 17.0F);
        this.lThigh.addBox(-2.5F, -2.0F, -1.0F, 4, 14, 5, 0.0F);
        this.setRotation(lThigh, -0.4923465963176727F, -0.22284652255435927F, -0.4301964095080599F);
        this.jaw2 = new ModelRenderer(this, 52, 20);
        this.jaw2.setRotationPoint(0.0F, 1.5F, -2.0F);
        this.jaw2.addBox(-1.5F, 2.5999999046325684F, -5.599999904632568F, 3, 2, 5, 0.0F);
        this.setRotation(jaw2, 0.12217304855585097F, -0.0F, 0.0F);
        this.spine5 = new ModelRenderer(this, 178, 96);
        this.spine5.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.spine5.addBox(0.0F, 7.5F, 41.0F, 0, 3, 11, 0.0F);
        this.setRotation(spine5, -0.05235987901687623F, -0.0F, 0.0F);
        this.rFoot = new ModelRenderer(this, 95, 24);
        this.rFoot.setRotationPoint(-4.5F, 2.0F, 17.0F);
        this.rFoot.addBox(-8.0F, 20.0F, -8.0F, 2, 2, 5, 0.0F);
        this.setRotation(rFoot, 0.0F, 0.24434609711170194F, 0.0F);
        this.spine1 = new ModelRenderer(this, 0, 65);
        this.spine1.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.spine1.addBox(0.0F, -8.0F, 0.0F, 0, 8, 10, 0.0F);
        this.lShin1 = new ModelRenderer(this, 79, 49);
        this.lShin1.setRotationPoint(4.5F, 2.0F, 16.0F);
        this.lShin1.addBox(-2.0F, 10.0F, -0.5F, 3, 3, 12, 0.0F);
        this.setRotation(lShin1, -0.474893343048477F, -0.22284652255435927F, -0.4301964095080599F);
        this.tail2 = new ModelRenderer(this, 118, 66);
        this.tail2.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.tail2.addBox(-1.5F, 1.5F, 21.0F, 3, 3, 11, 0.0F);
        this.setRotation(tail2, -0.2094395160675048F, -0.0F, 0.0F);
        this.lShin2 = new ModelRenderer(this, 113, 40);
        this.lShin2.setRotationPoint(4.5F, 2.0F, 16.0F);
        this.lShin2.addBox(-2.5F, 8.5F, 12.0F, 2, 9, 2, 0.0F);
        this.setRotation(lShin2, -0.7017861123851776F, -0.22284652255435927F, -0.4301964095080599F);
        this.rArm2 = new ModelRenderer(this, 98, 9);
        this.rArm2.setRotationPoint(-3.5F, 2.0F, 3.5F);
        this.rArm2.addBox(-2.5F, 6.5F, -21.0F, 2, 2, 11, 0.0F);
        this.setRotation(rArm2, 1.1170107126235962F, -0.0F, 0.2094395160675048F);
        this.rShin2 = new ModelRenderer(this, 113, 53);
        this.rShin2.setRotationPoint(-4.5F, 2.0F, 16.0F);
        this.rShin2.addBox(0.5F, 8.5F, 12.0F, 2, 9, 2, 0.0F);
        this.setRotation(rShin2, -0.7017861123851776F, 0.22284652255435927F, 0.4301964095080599F);
        this.lArm1 = new ModelRenderer(this, 40, 29);
        this.lArm1.setRotationPoint(3.5F, 2.0F, 3.5F);
        this.lArm1.addBox(0.0F, 0.0F, -0.5F, 2, 13, 2, 0.0F);
        this.setRotation(lArm1, 0.12217304855585097F, -0.0F, -0.24434609711170194F);
        this.rClaw1 = new ModelRenderer(this, 72, 24);
        this.rClaw1.setRotationPoint(-3.5F, 2.0F, 3.5F);
        this.rClaw1.addBox(-7.0F, 21.0F, -5.0F, 2, 1, 3, 0.0F);
        this.lClaw2 = new ModelRenderer(this, 60, 30);
        this.lClaw2.setRotationPoint(3.5F, 2.0F, 3.5F);
        this.lClaw2.addBox(4.0F, 22.0F, -7.5F, 3, 0, 6, 0.0F);
        this.headTop = new ModelRenderer(this, 28, 10);
        this.headTop.setRotationPoint(0.0F, 1.5F, -2.0F);
        this.headTop.addBox(-2.5F, -15.300000190734863F, -5.699999809265137F, 5, 10, 5, 0.0F);
        this.setRotation(headTop, -0.9075711965560913F, -0.0F, 0.0F);
        this.headBase = new ModelRenderer(this, 0, 0);
        this.headBase.setRotationPoint(0.0F, 1.5F, -2.0F);
        this.headBase.addBox(-2.5F, -6.699999809265137F, -4.0F, 5, 10, 5, 0.0F);
        this.setRotation(headBase, -0.6283185482025146F, -0.0F, 0.0F);
        this.rArm1 = new ModelRenderer(this, 50, 29);
        this.rArm1.setRotationPoint(-3.5F, 2.0F, 3.5F);
        this.rArm1.addBox(-2.0F, 0.0F, -0.5F, 2, 13, 2, 0.0F);
        this.setRotation(rArm1, 0.12217304855585097F, -0.0F, 0.24434609711170194F);
        this.lClaw1 = new ModelRenderer(this, 83, 24);
        this.lClaw1.setRotationPoint(3.5F, 2.0F, 3.5F);
        this.lClaw1.addBox(5.0F, 21.0F, -5.0F, 2, 1, 3, 0.0F);
        this.spine9 = new ModelRenderer(this, 118, 94);
        this.spine9.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.spine9.addBox(0.0F, 0.0F, 22.0F, 0, 6, 10, 0.0F);
        this.setRotation(spine9, -0.2094395160675048F, -0.0F, 0.0F);
        this.tailStabber = new ModelRenderer(this, 205, 66);
        this.tailStabber.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.tailStabber.addBox(-1.5F, 9.0F, 52.0F, 3, 0, 11, 0.0F);
        this.setRotation(tailStabber, -0.05235987901687623F, -0.0F, 0.0F);
        this.abdomen = new ModelRenderer(this, 0, 27);
        this.abdomen.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.abdomen.addBox(-3.5F, 0.5F, 8.0F, 7, 6, 12, 0.0F);
        this.spine12 = new ModelRenderer(this, 58, 93);
        this.spine12.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.spine12.addBox(0.0F, -4.5F, 0.0F, 0, 8, 11, 0.0F);
        this.setRotation(spine12, -0.40142571926116943F, -0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 23, 86);
        this.neck.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.neck.addBox(-2.0F, 0.0F, -2.5F, 4, 6, 5, 0.0F);
        this.setRotation(neck, -0.19198621809482574F, -0.0F, 0.0F);
        this.tail1 = new ModelRenderer(this, 85, 66);
        this.tail1.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.tail1.addBox(-2.0F, -1.5F, 11.0F, 4, 4, 11, 0.0F);
        this.setRotation(tail1, -0.3141592741012573F, -0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float swingProgress, float swingProgressPrev, float idleProgress, float headYaw, float headPitch, float boxTranslation)
    {
        super.render(entity, swingProgress, swingProgressPrev, idleProgress, headYaw, headPitch, boxTranslation);
        this.spine2.render(boxTranslation);
        this.tail4.render(boxTranslation);
        this.lHead.render(boxTranslation);
        this.spine6.render(boxTranslation);
        this.lArm2.render(boxTranslation);
        this.tail5.render(boxTranslation);
        this.lFoot.render(boxTranslation);
        this.tail3.render(boxTranslation);
        this.rClaw2.render(boxTranslation);
        this.rShin1.render(boxTranslation);
        this.chest.render(boxTranslation);
        this.rThigh.render(boxTranslation);
        this.spine11.render(boxTranslation);
        this.rHead.render(boxTranslation);
        this.jaw.render(boxTranslation);
        this.lThigh.render(boxTranslation);
        this.jaw2.render(boxTranslation);
        this.spine5.render(boxTranslation);
        this.rFoot.render(boxTranslation);
        this.spine1.render(boxTranslation);
        this.lShin1.render(boxTranslation);
        this.tail2.render(boxTranslation);
        this.lShin2.render(boxTranslation);
        this.rArm2.render(boxTranslation);
        this.rShin2.render(boxTranslation);
        this.lArm1.render(boxTranslation);
        this.rClaw1.render(boxTranslation);
        this.lClaw2.render(boxTranslation);
        this.headTop.render(boxTranslation);
        this.headBase.render(boxTranslation);
        this.rArm1.render(boxTranslation);
        this.lClaw1.render(boxTranslation);
        this.spine9.render(boxTranslation);
        this.tailStabber.render(boxTranslation);
        this.abdomen.render(boxTranslation);
        this.spine12.render(boxTranslation);
        this.neck.render(boxTranslation);
        this.tail1.render(boxTranslation);
    }
}
