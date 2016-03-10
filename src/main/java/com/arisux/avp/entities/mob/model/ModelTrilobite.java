package com.arisux.avp.entities.mob.model;

import com.arisux.airi.lib.client.ModelBaseExtension;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTrilobite extends ModelBaseExtension
{
	public ModelRenderer Body;
	public ModelRenderer LFrontTenticle2;
	public ModelRenderer LMiddleTenticle1;
	public ModelRenderer Shape3;
	public ModelRenderer LFrontTenticle1;
	public ModelRenderer LFrontTenticle3;
	public ModelRenderer LBackTneticle1;
	public ModelRenderer Tail;
	public ModelRenderer LFrontTenticle4;
	public ModelRenderer LFrontTenticle5;
	public ModelRenderer LFrontClaw;
	public ModelRenderer RFrontTenticle1;
	public ModelRenderer RMiddleTenticle1;
	public ModelRenderer RBackTenticle1;
	public ModelRenderer RFrontTenticle2;
	public ModelRenderer RFrontTenticle3;
	public ModelRenderer RFrontTenticle4;
	public ModelRenderer RFrontTenticle5;
	public ModelRenderer RFrontClaw;
	public ModelRenderer Tail2;
	public ModelRenderer LMiddleTenticle2;
	public ModelRenderer LBackTenticle2;
	public ModelRenderer RMiddleTenticle2;
	public ModelRenderer RBackTenticle2;
	public ModelRenderer LMiddleTenticle3;
	public ModelRenderer LMiddleTenticle4;
	public ModelRenderer LMiddleTenticle5;
	public ModelRenderer LMiddleClaw;
	public ModelRenderer RMiddleTenticle3;
	public ModelRenderer RMiddleTenticle4;
	public ModelRenderer RFrontTenticle5_1;
	public ModelRenderer RMiddleClaw;
	public ModelRenderer LBackTenticle3;
	public ModelRenderer LBackTenticle4;
	public ModelRenderer LBackTenticle5;
	public ModelRenderer LBackClaw;
	public ModelRenderer RBackTenticle3;
	public ModelRenderer RBackTenticle4;
	public ModelRenderer RBackTenticle5;
	public ModelRenderer RBackClaw;
	public ModelRenderer Tail3;
	public ModelRenderer Tail4;
	public ModelRenderer Tail5;
	public ModelRenderer TailClaw;
	public ModelRenderer LJaw;
	public ModelRenderer RJaw;
	public ModelRenderer RFrontPetal;
	public ModelRenderer RFrontPetal_1;
	public ModelRenderer LMiddlePetal;
	public ModelRenderer LBackPetal;
	public ModelRenderer TailPetal;
	public ModelRenderer RMiddlePetal;
	public ModelRenderer RBackPetal;
	public ModelRenderer Ovipositor;
	public ModelRenderer LFrontGrossTenticle;
	public ModelRenderer RFrontGrossTenticle;
	public ModelRenderer LMiddleGrossTenticle;
	public ModelRenderer LBackGrossTenticle;
	public ModelRenderer RMiddleGrossTenticle;
	public ModelRenderer LBackGrossTenticle_1;
	public ModelRenderer TailGrossTenticle;

	public ModelTrilobite()
	{
		this.textureWidth = 128;
		this.textureHeight = 64;
		this.TailGrossTenticle = new ModelRenderer(this, 110, 42);
		this.TailGrossTenticle.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.TailGrossTenticle.addBox(2.5F, 10.0F, 4.0F, 1, 7, 1, 0.0F);
		this.setRotation(TailGrossTenticle, 0.24434609711170194F, -0.0F, 0.0F);
		this.RMiddleTenticle2 = new ModelRenderer(this, 65, 5);
		this.RMiddleTenticle2.setRotationPoint(-6.0F, 0.0F, 3.0F);
		this.RMiddleTenticle2.addBox(-6.900000095367432F, 7.699999809265137F, 0.30000001192092896F, 5, 2, 4, 0.0F);
		this.setRotation(RMiddleTenticle2, -0.10904049805153734F, 0.1791722243522077F, -0.5508564126797908F);
		this.RFrontPetal_1 = new ModelRenderer(this, 81, 37);
		this.RFrontPetal_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RFrontPetal_1.addBox(-7.5F, 7.599999904632568F, -0.800000011920929F, 4, 1, 2, 0.0F);
		this.setRotation(RFrontPetal_1, 0.4819954735191472F, -0.5514842894614982F, -0.7846320082018741F);
		this.RMiddleTenticle3 = new ModelRenderer(this, 65, 12);
		this.RMiddleTenticle3.setRotationPoint(-6.0F, 0.0F, 3.0F);
		this.RMiddleTenticle3.addBox(-14.0F, 4.699999809265137F, 0.699999988079071F, 5, 2, 3, 0.0F);
		this.setRotation(RMiddleTenticle3, -0.16815224652849992F, 0.12545319690528006F, -0.9356108406558161F);
		this.LMiddlePetal = new ModelRenderer(this, 97, 41);
		this.LMiddlePetal.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LMiddlePetal.addBox(9.800000190734863F, 2.299999952316284F, 2.0F, 3, 1, 2, 0.0F);
		this.setRotation(LMiddlePetal, -0.04675606933692445F, -0.05186240715992169F, 0.7342512400500987F);
		this.RBackClaw = new ModelRenderer(this, 105, 28);
		this.RBackClaw.setRotationPoint(-6.0F, 0.0F, 6.0F);
		this.RBackClaw.addBox(-4.0F, 21.700000762939453F, 4.0F, 0, 3, 2, 0.0F);
		this.setRotation(RBackClaw, 0.03552774401600698F, 0.469998124646395F, 0.0783201619013155F);
		this.LMiddleTenticle3 = new ModelRenderer(this, 46, 12);
		this.LMiddleTenticle3.setRotationPoint(6.0F, 0.0F, 3.0F);
		this.LMiddleTenticle3.addBox(12.0F, 0.5F, -1.0F, 5, 2, 3, 0.0F);
		this.setRotation(LMiddleTenticle3, -0.16815224652849992F, -0.12545319690528006F, 0.9356108406558161F);
		this.LMiddleGrossTenticle = new ModelRenderer(this, 110, 42);
		this.LMiddleGrossTenticle.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LMiddleGrossTenticle.addBox(3.0F, 9.0F, 3.0F, 1, 7, 1, 0.0F);
		this.setRotation(LMiddleGrossTenticle, 0.0F, -0.0F, -0.17453292012214658F);
		this.Tail4 = new ModelRenderer(this, 45, 49);
		this.Tail4.setRotationPoint(0.0F, 0.0F, 9.0F);
		this.Tail4.addBox(1.5F, -2.0F, 15.0F, 3, 2, 5, 0.0F);
		this.setRotation(Tail4, -1.151917338371277F, -0.0F, 0.0F);
		this.LBackTenticle5 = new ModelRenderer(this, 86, 24);
		this.LBackTenticle5.setRotationPoint(6.0F, 0.0F, 6.0F);
		this.LBackTenticle5.addBox(19.0F, -8.0F, 0.0F, 5, 1, 2, 0.0F);
		this.setRotation(LBackTenticle5, -0.5541198985650182F, -0.07381752739602657F, 1.4521705265521907F);
		this.Shape3 = new ModelRenderer(this, 25, 0);
		this.Shape3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shape3.addBox(0.5F, 4.5F, 7.0F, 5, 2, 4, 0.0F);
		this.setRotation(Shape3, -0.33161255717277527F, -0.0F, 0.0F);
		this.RMiddleClaw = new ModelRenderer(this, 65, 28);
		this.RMiddleClaw.setRotationPoint(-6.0F, 0.0F, 3.0F);
		this.RMiddleClaw.addBox(-4.0F, 22.0F, 1.7000000476837158F, 0, 3, 2, 0.0F);
		this.setRotation(RMiddleClaw, 0.008564808564755865F, 0.12187395702642115F, 0.0703357332478492F);
		this.RFrontTenticle5 = new ModelRenderer(this, 19, 34);
		this.RFrontTenticle5.setRotationPoint(-6.0F, 0.0F, 0.0F);
		this.RFrontTenticle5.addBox(-22.0F, -1.5F, -4.5F, 5, 1, 2, 0.0F);
		this.setRotation(RFrontTenticle5, 0.7027538926620808F, -0.14812220335672605F, -1.3982897038244428F);
		this.RMiddleTenticle4 = new ModelRenderer(this, 65, 18);
		this.RMiddleTenticle4.setRotationPoint(-6.0F, 0.0F, 3.0F);
		this.RMiddleTenticle4.addBox(-19.700000762939453F, 0.5F, 0.699999988079071F, 5, 2, 3, 0.0F);
		this.setRotation(RMiddleTenticle4, -0.19714346811493966F, 0.07117005563522394F, -1.2287715796255982F);
		this.RBackTenticle1 = new ModelRenderer(this, 105, 0);
		this.RBackTenticle1.setRotationPoint(-6.0F, 0.0F, 6.0F);
		this.RBackTenticle1.addBox(0.0F, 8.5F, 3.5F, 4, 2, 2, 0.0F);
		this.setRotation(RBackTenticle1, -0.17056384035982664F, 0.5344770444007052F, -0.32605590638170334F);
		this.RBackPetal = new ModelRenderer(this, 81, 45);
		this.RBackPetal.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RBackPetal.addBox(-11.199999809265137F, 3.700000047683716F, 4.300000190734863F, 3, 1, 2, 0.0F);
		this.setRotation(RBackPetal, -0.5897064993326631F, 0.553282414912676F, -0.9050699374403737F);
		this.Ovipositor = new ModelRenderer(this, 55, 34);
		this.Ovipositor.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Ovipositor.addBox(2.5F, 9.0F, 2.0F, 1, 9, 1, 0.0F);
		this.Tail3 = new ModelRenderer(this, 28, 49);
		this.Tail3.setRotationPoint(0.0F, 0.0F, 9.0F);
		this.Tail3.addBox(1.5F, 4.0F, 10.0F, 3, 2, 5, 0.0F);
		this.setRotation(Tail3, -0.7504915595054628F, -0.0F, 0.0F);
		this.RFrontTenticle3 = new ModelRenderer(this, 19, 22);
		this.RFrontTenticle3.setRotationPoint(-6.0F, 0.0F, 0.0F);
		this.RFrontTenticle3.addBox(-11.0F, 6.400000095367432F, -5.0F, 5, 2, 3, 0.0F);
		this.setRotation(RFrontTenticle3, 0.5268298052810044F, -0.5092778459605918F, -0.8731987347266162F);
		this.RBackTenticle4 = new ModelRenderer(this, 105, 18);
		this.RBackTenticle4.setRotationPoint(-6.0F, 0.0F, 6.0F);
		this.RBackTenticle4.addBox(-19.700000762939453F, 0.800000011920929F, 3.0F, 5, 2, 3, 0.0F);
		this.setRotation(RBackTenticle4, -0.5309434968024471F, 0.1822503026203217F, -1.2714097367244983F);
		this.LFrontTenticle1 = new ModelRenderer(this, 0, 10);
		this.LFrontTenticle1.setRotationPoint(6.0F, 0.0F, 0.0F);
		this.LFrontTenticle1.addBox(1.0F, 6.5F, -0.8999999761581421F, 2, 2, 2, 0.0F);
		this.setRotation(LFrontTenticle1, 0.2889903578383988F, 0.6642818262320259F, 0.44935943526614924F);
		this.LFrontTenticle4 = new ModelRenderer(this, 0, 28);
		this.LFrontTenticle4.setRotationPoint(6.0F, 0.0F, 0.0F);
		this.LFrontTenticle4.addBox(14.5F, -2.5F, -1.100000023841858F, 5, 2, 3, 0.0F);
		this.setRotation(LFrontTenticle4, 0.6672830318033137F, 0.28094374797956534F, 1.2324059730332162F);
		this.TailPetal = new ModelRenderer(this, 89, 50);
		this.TailPetal.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.TailPetal.addBox(2.0F, -2.0F, 11.699999809265137F, 2, 1, 2, 0.0F);
		this.setRotation(TailPetal, -1.0122909545898438F, -0.0F, 0.0F);
		this.LMiddleTenticle2 = new ModelRenderer(this, 46, 5);
		this.LMiddleTenticle2.setRotationPoint(6.0F, 0.0F, 3.0F);
		this.LMiddleTenticle2.addBox(6.400000095367432F, 5.0F, -1.5F, 5, 2, 4, 0.0F);
		this.setRotation(LMiddleTenticle2, -0.10904049805153734F, -0.1791722243522077F, 0.5508564126797908F);
		this.RFrontTenticle2 = new ModelRenderer(this, 19, 15);
		this.RFrontTenticle2.setRotationPoint(-6.0F, 0.0F, 0.0F);
		this.RFrontTenticle2.addBox(-3.5F, 8.0F, -5.5F, 5, 2, 4, 0.0F);
		this.setRotation(RFrontTenticle2, 0.2889903578383988F, -0.6642818262320259F, -0.44935943526614924F);
		this.LMiddleTenticle5 = new ModelRenderer(this, 46, 24);
		this.LMiddleTenticle5.setRotationPoint(6.0F, 0.0F, 3.0F);
		this.LMiddleTenticle5.addBox(19.0F, -8.0F, -0.5F, 5, 1, 2, 0.0F);
		this.setRotation(LMiddleTenticle5, -0.20745951912451563F, -0.02893975489563487F, 1.4341829218152156F);
		this.LMiddleTenticle1 = new ModelRenderer(this, 46, 0);
		this.LMiddleTenticle1.setRotationPoint(6.0F, 0.0F, 3.0F);
		this.LMiddleTenticle1.addBox(1.0F, 6.5F, -0.5F, 4, 2, 2, 0.0F);
		this.setRotation(LMiddleTenticle1, -0.05852163028266893F, -0.20121253565205766F, 0.2851619352811145F);
		this.LFrontTenticle5 = new ModelRenderer(this, 0, 34);
		this.LFrontTenticle5.setRotationPoint(6.0F, 0.0F, 0.0F);
		this.LFrontTenticle5.addBox(18.0F, -6.0F, -0.5F, 5, 1, 2, 0.0F);
		this.setRotation(LFrontTenticle5, 0.7027538926620808F, 0.14812220335672605F, 1.3982897038244428F);
		this.Tail2 = new ModelRenderer(this, 9, 49);
		this.Tail2.setRotationPoint(0.0F, 0.0F, 9.0F);
		this.Tail2.addBox(1.0F, 7.5F, 3.5F, 4, 2, 5, 0.0F);
		this.setRotation(Tail2, -0.36651915311813354F, -0.0F, 0.0F);
		this.LFrontTenticle2 = new ModelRenderer(this, 0, 15);
		this.LFrontTenticle2.setRotationPoint(6.0F, 0.0F, 0.0F);
		this.LFrontTenticle2.addBox(3.0F, 6.5F, -1.7999999523162842F, 5, 2, 4, 0.0F);
		this.setRotation(LFrontTenticle2, 0.2889903578383988F, 0.6642818262320259F, 0.44935943526614924F);
		this.LFrontClaw = new ModelRenderer(this, 0, 38);
		this.LFrontClaw.setRotationPoint(6.0F, 0.0F, 0.0F);
		this.LFrontClaw.addBox(9.0F, 21.700000762939453F, -0.5F, 0, 3, 2, 0.0F);
		this.setRotation(LFrontClaw, -0.06056421788540517F, 0.7134693983647046F, -0.09239015405794412F);
		this.LBackTenticle2 = new ModelRenderer(this, 86, 5);
		this.LBackTenticle2.setRotationPoint(6.0F, 0.0F, 6.0F);
		this.LBackTenticle2.addBox(5.0F, 6.300000190734863F, -0.800000011920929F, 5, 2, 4, 0.0F);
		this.setRotation(LBackTenticle2, -0.24888754127088275F, -0.505340410530155F, 0.4834501884885855F);
		this.RBackTenticle2 = new ModelRenderer(this, 105, 5);
		this.RBackTenticle2.setRotationPoint(-6.0F, 0.0F, 6.0F);
		this.RBackTenticle2.addBox(-5.5F, 8.5F, 2.700000047683716F, 5, 2, 4, 0.0F);
		this.setRotation(RBackTenticle2, -0.24888754127088275F, 0.505340410530155F, -0.4834501884885855F);
		this.LFrontGrossTenticle = new ModelRenderer(this, 110, 42);
		this.LFrontGrossTenticle.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LFrontGrossTenticle.addBox(2.0F, 8.699999809265137F, 3.0F, 1, 7, 1, 0.0F);
		this.setRotation(LFrontGrossTenticle, -0.24434609711170194F, -0.0F, -0.17453292012214658F);
		this.RMiddleGrossTenticle = new ModelRenderer(this, 110, 42);
		this.RMiddleGrossTenticle.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RMiddleGrossTenticle.addBox(2.0F, 8.0F, 3.5F, 1, 7, 1, 0.0F);
		this.setRotation(RMiddleGrossTenticle, 0.0F, -0.0F, 0.17453292012214658F);
		this.RMiddlePetal = new ModelRenderer(this, 81, 41);
		this.RMiddlePetal.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RMiddlePetal.addBox(-8.5F, 6.099999904632568F, 3.0F, 3, 1, 2, 0.0F);
		this.setRotation(RMiddlePetal, -0.04675606933692445F, 0.05186240715992169F, -0.7342512400500987F);
		this.TailClaw = new ModelRenderer(this, 69, 49);
		this.TailClaw.setRotationPoint(0.0F, 0.0F, 9.0F);
		this.TailClaw.addBox(2.0F, 21.0F, 9.5F, 2, 3, 0, 0.0F);
		this.RFrontGrossTenticle = new ModelRenderer(this, 110, 42);
		this.RFrontGrossTenticle.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RFrontGrossTenticle.addBox(3.0F, 8.0F, 3.0F, 1, 7, 1, 0.0F);
		this.setRotation(RFrontGrossTenticle, -0.24434609711170194F, -0.0F, 0.17453292012214658F);
		this.LBackGrossTenticle_1 = new ModelRenderer(this, 110, 42);
		this.LBackGrossTenticle_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LBackGrossTenticle_1.addBox(2.200000047683716F, 9.0F, 3.0F, 1, 7, 1, 0.0F);
		this.setRotation(LBackGrossTenticle_1, 0.24434609711170194F, -0.0F, 0.17453292012214658F);
		this.LJaw = new ModelRenderer(this, 30, 43);
		this.LJaw.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LJaw.addBox(-0.20000000298023224F, 9.0F, 1.5F, 1, 1, 2, 0.0F);
		this.setRotation(LJaw, 0.03276210248099374F, -0.08089760428553075F, -0.3852984655959346F);
		this.LBackTenticle3 = new ModelRenderer(this, 86, 12);
		this.LBackTenticle3.setRotationPoint(6.0F, 0.0F, 6.0F);
		this.LBackTenticle3.addBox(11.399999618530273F, 0.800000011920929F, -0.5F, 5, 2, 3, 0.0F);
		this.setRotation(LBackTenticle3, -0.4628815966587863F, -0.32458276980645206F, 1.0021573257291503F);
		this.LBackGrossTenticle = new ModelRenderer(this, 110, 42);
		this.LBackGrossTenticle.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LBackGrossTenticle.addBox(1.5F, 10.0F, 2.5F, 1, 7, 1, 0.0F);
		this.setRotation(LBackGrossTenticle, 0.24434609711170194F, -0.0F, -0.17453292012214658F);
		this.LBackPetal = new ModelRenderer(this, 97, 45);
		this.LBackPetal.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LBackPetal.addBox(11.0F, 1.2999999523162842F, 0.0F, 3, 1, 2, 0.0F);
		this.setRotation(LBackPetal, -0.5897064993326631F, -0.553282414912676F, 0.9050699374403737F);
		this.LBackClaw = new ModelRenderer(this, 86, 28);
		this.LBackClaw.setRotationPoint(6.0F, 0.0F, 6.0F);
		this.LBackClaw.addBox(9.199999809265137F, 21.700000762939453F, 1.0F, 0, 3, 2, 0.0F);
		this.setRotation(LBackClaw, 0.03552774401600698F, -0.469998124646395F, -0.0783201619013155F);
		this.LMiddleTenticle4 = new ModelRenderer(this, 46, 18);
		this.LMiddleTenticle4.setRotationPoint(6.0F, 0.0F, 3.0F);
		this.LMiddleTenticle4.addBox(16.0F, -4.300000190734863F, -1.0F, 5, 2, 3, 0.0F);
		this.setRotation(LMiddleTenticle4, -0.19714346811493966F, -0.07117005563522394F, 1.2287715796255982F);
		this.RFrontTenticle5_1 = new ModelRenderer(this, 65, 24);
		this.RFrontTenticle5_1.setRotationPoint(-6.0F, 0.0F, 3.0F);
		this.RFrontTenticle5_1.addBox(-24.0F, -3.0F, 1.2000000476837158F, 5, 1, 2, 0.0F);
		this.setRotation(RFrontTenticle5_1, -0.20745951912451563F, 0.02893975489563487F, -1.4341829218152156F);
		this.RFrontTenticle4 = new ModelRenderer(this, 19, 28);
		this.RFrontTenticle4.setRotationPoint(-6.0F, 0.0F, 0.0F);
		this.RFrontTenticle4.addBox(-17.5F, 1.7000000476837158F, -5.0F, 5, 2, 3, 0.0F);
		this.setRotation(RFrontTenticle4, 0.6672830318033137F, -0.28094374797956534F, -1.2324059730332162F);
		this.RBackTenticle5 = new ModelRenderer(this, 105, 24);
		this.RBackTenticle5.setRotationPoint(-6.0F, 0.0F, 6.0F);
		this.RBackTenticle5.addBox(-24.0F, -2.9000000953674316F, 3.5F, 5, 1, 2, 0.0F);
		this.setRotation(RBackTenticle5, -0.5541198985650182F, 0.07381752739602657F, -1.4521705265521907F);
		this.RBackTenticle3 = new ModelRenderer(this, 105, 12);
		this.RBackTenticle3.setRotationPoint(-6.0F, 0.0F, 6.0F);
		this.RBackTenticle3.addBox(-14.0F, 5.0F, 3.0F, 5, 2, 3, 0.0F);
		this.setRotation(RBackTenticle3, -0.4628815966587863F, 0.32458276980645206F, -1.0021573257291503F);
		this.LFrontTenticle3 = new ModelRenderer(this, 0, 22);
		this.LFrontTenticle3.setRotationPoint(6.0F, 0.0F, 0.0F);
		this.LFrontTenticle3.addBox(9.5F, 3.299999952316284F, -1.2000000476837158F, 5, 2, 3, 0.0F);
		this.setRotation(LFrontTenticle3, 0.5268298052810044F, 0.5092778459605918F, 0.8731987347266162F);
		this.LBackTneticle1 = new ModelRenderer(this, 86, 0);
		this.LBackTneticle1.setRotationPoint(6.0F, 0.0F, 6.0F);
		this.LBackTneticle1.addBox(1.0F, 7.0F, 0.0F, 4, 2, 2, 0.0F);
		this.setRotation(LBackTneticle1, -0.17056384035982664F, -0.5344770444007052F, 0.32605590638170334F);
		this.RFrontPetal = new ModelRenderer(this, 97, 37);
		this.RFrontPetal.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RFrontPetal.addBox(7.199999809265137F, 4.900000095367432F, 3.0F, 4, 1, 2, 0.0F);
		this.setRotation(RFrontPetal, 0.4819954735191472F, 0.5514842894614982F, 0.7846320082018741F);
		this.RFrontClaw = new ModelRenderer(this, 19, 38);
		this.RFrontClaw.setRotationPoint(-6.0F, 0.0F, 0.0F);
		this.RFrontClaw.addBox(-4.5F, 21.0F, -4.5F, 0, 3, 2, 0.0F);
		this.setRotation(RFrontClaw, -0.06056421788540517F, -0.7134693983647046F, 0.09239015405794412F);
		this.Tail5 = new ModelRenderer(this, 62, 49);
		this.Tail5.setRotationPoint(0.0F, 0.0F, 9.0F);
		this.Tail5.addBox(2.0F, 18.0F, 7.0F, 2, 5, 1, 0.0F);
		this.setRotation(Tail5, 0.08726646006107329F, -0.0F, 0.0F);
		this.RFrontTenticle1 = new ModelRenderer(this, 19, 10);
		this.RFrontTenticle1.setRotationPoint(-6.0F, 0.0F, 0.0F);
		this.RFrontTenticle1.addBox(1.0F, 8.0F, -4.699999809265137F, 2, 2, 2, 0.0F);
		this.setRotation(RFrontTenticle1, 0.2889903578383988F, -0.6642818262320259F, -0.44935943526614924F);
		this.Tail = new ModelRenderer(this, 0, 49);
		this.Tail.setRotationPoint(0.0F, 0.0F, 9.0F);
		this.Tail.addBox(2.0F, 7.5F, 2.0F, 2, 2, 2, 0.0F);
		this.setRotation(Tail, -0.36651915311813354F, -0.0F, 0.0F);
		this.LMiddleClaw = new ModelRenderer(this, 46, 28);
		this.LMiddleClaw.setRotationPoint(6.0F, 0.0F, 3.0F);
		this.LMiddleClaw.addBox(9.100000381469727F, 21.700000762939453F, 0.5F, 0, 3, 2, 0.0F);
		this.setRotation(LMiddleClaw, 0.008564808564755865F, -0.12187395702642115F, -0.0703357332478492F);
		this.LBackTenticle4 = new ModelRenderer(this, 86, 18);
		this.LBackTenticle4.setRotationPoint(6.0F, 0.0F, 6.0F);
		this.LBackTenticle4.addBox(15.699999809265137F, -4.0F, -0.5F, 5, 2, 3, 0.0F);
		this.setRotation(LBackTenticle4, -0.5309434968024471F, -0.1822503026203217F, 1.2714097367244983F);
		this.RJaw = new ModelRenderer(this, 37, 43);
		this.RJaw.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RJaw.addBox(4.800000190734863F, 6.699999809265137F, 2.0F, 1, 1, 2, 0.0F);
		this.setRotation(RJaw, 0.03276210248099374F, 0.08089760428553075F, 0.3852984655959346F);
		this.RMiddleTenticle1 = new ModelRenderer(this, 65, 0);
		this.RMiddleTenticle1.setRotationPoint(-6.0F, 0.0F, 3.0F);
		this.RMiddleTenticle1.addBox(0.0F, 8.0F, 1.2000000476837158F, 5, 2, 2, 0.0F);
		this.setRotation(RMiddleTenticle1, -0.05852163028266893F, 0.20121253565205766F, -0.2851619352811145F);
		this.Body = new ModelRenderer(this, 0, 0);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(0.0F, 6.0F, 0.0F, 6, 3, 6, 0.0F);
	}

	public void render(Entity entity, float swingProgress, float swingProgressPrev, float idleProgress, float headYaw, float headPitch, float boxTranslation)
	{
		super.render(entity, swingProgress, swingProgressPrev, idleProgress, headYaw, headPitch, boxTranslation);
		this.setRotationAngles(swingProgress, swingProgressPrev, idleProgress, headYaw, headPitch, boxTranslation, entity);
		this.TailGrossTenticle.render(boxTranslation);
		this.RMiddleTenticle2.render(boxTranslation);
		this.RFrontPetal_1.render(boxTranslation);
		this.RMiddleTenticle3.render(boxTranslation);
		this.LMiddlePetal.render(boxTranslation);
		this.RBackClaw.render(boxTranslation);
		this.LMiddleTenticle3.render(boxTranslation);
		this.LMiddleGrossTenticle.render(boxTranslation);
		this.Tail4.render(boxTranslation);
		this.LBackTenticle5.render(boxTranslation);
		this.Shape3.render(boxTranslation);
		this.RMiddleClaw.render(boxTranslation);
		this.RFrontTenticle5.render(boxTranslation);
		this.RMiddleTenticle4.render(boxTranslation);
		this.RBackTenticle1.render(boxTranslation);
		this.RBackPetal.render(boxTranslation);
		this.Ovipositor.render(boxTranslation);
		this.Tail3.render(boxTranslation);
		this.RFrontTenticle3.render(boxTranslation);
		this.RBackTenticle4.render(boxTranslation);
		this.LFrontTenticle1.render(boxTranslation);
		this.LFrontTenticle4.render(boxTranslation);
		this.TailPetal.render(boxTranslation);
		this.LMiddleTenticle2.render(boxTranslation);
		this.RFrontTenticle2.render(boxTranslation);
		this.LMiddleTenticle5.render(boxTranslation);
		this.LMiddleTenticle1.render(boxTranslation);
		this.LFrontTenticle5.render(boxTranslation);
		this.Tail2.render(boxTranslation);
		this.LFrontTenticle2.render(boxTranslation);
		this.LFrontClaw.render(boxTranslation);
		this.LBackTenticle2.render(boxTranslation);
		this.RBackTenticle2.render(boxTranslation);
		this.LFrontGrossTenticle.render(boxTranslation);
		this.RMiddleGrossTenticle.render(boxTranslation);
		this.RMiddlePetal.render(boxTranslation);
		this.TailClaw.render(boxTranslation);
		this.RFrontGrossTenticle.render(boxTranslation);
		this.LBackGrossTenticle_1.render(boxTranslation);
		this.LJaw.render(boxTranslation);
		this.LBackTenticle3.render(boxTranslation);
		this.LBackGrossTenticle.render(boxTranslation);
		this.LBackPetal.render(boxTranslation);
		this.LBackClaw.render(boxTranslation);
		this.LMiddleTenticle4.render(boxTranslation);
		this.RFrontTenticle5_1.render(boxTranslation);
		this.RFrontTenticle4.render(boxTranslation);
		this.RBackTenticle5.render(boxTranslation);
		this.RBackTenticle3.render(boxTranslation);
		this.LFrontTenticle3.render(boxTranslation);
		this.LBackTneticle1.render(boxTranslation);
		this.RFrontPetal.render(boxTranslation);
		this.RFrontClaw.render(boxTranslation);
		this.Tail5.render(boxTranslation);
		this.RFrontTenticle1.render(boxTranslation);
		this.Tail.render(boxTranslation);
		this.LMiddleClaw.render(boxTranslation);
		this.LBackTenticle4.render(boxTranslation);
		this.RJaw.render(boxTranslation);
		this.RMiddleTenticle1.render(boxTranslation);
		this.Body.render(boxTranslation);
	}
}
