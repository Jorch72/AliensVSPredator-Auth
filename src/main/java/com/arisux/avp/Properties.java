package com.arisux.avp;

import com.arisux.airi.lib.ModLib;
import com.arisux.airi.lib.interfaces.IProperties;

public class Properties implements IProperties
{
	public static final String NAME = "AliensVsPredator";
	public static final String VERSION = "4.0.0";
	public static final String ID = "avp";
	public static final String DOMAIN = ID + ":";
	public final String CHANNEL = "CHANNEL_" + ID.toUpperCase();
	public final String PUBLIC_SERVER_ADDRESS = "http://arisux.com";
	public final String LOCAL_SERVER_ADDRESS = "http://localhost:8080";
	public final String SERVER_ADDRESS = ModLib.isDevelopmentEnvironment() ? LOCAL_SERVER_ADDRESS : PUBLIC_SERVER_ADDRESS;
	public final String URL_SUBMIT_FEEDBACK = SERVER_ADDRESS + "/page/beta/submit.php?user=%s&uuid=%s&info=%s";
	public final String URL_MODPAGE = SERVER_ADDRESS + "/page/mods/aliensvspredator";
	public final String URL_LATEST = URL_MODPAGE + "/latest.txt";
	public final String URL_CHANGELOG = URL_MODPAGE + "/changelog.txt";
	public final String URL_SKIN_BASE = URL_MODPAGE + "/skins/";
	public final String URL_SKIN_AK47 = URL_SKIN_BASE + "ak47/%s.png";
	public final String URL_SKIN_M4 = URL_SKIN_BASE + "m4/%s.png";
	public final String URL_SKIN_M41A = URL_SKIN_BASE + "m4a1/%s.png";
	public final String URL_SKIN_M56SG = URL_SKIN_BASE + "m56sg/%s.png";
	public final String URL_SKIN_SNIPER = URL_SKIN_BASE + "sniper/%s.png";
	public final String URL_SKIN_SNIPER_SCOPE = URL_SKIN_BASE + "sniper-zoom/%s.png";

	public final int GUI_ASSEMBLER = 0;
	public final int GUI_TURRET = 1;
	public final int GUI_WRISTBRACER = 2;
	public final int DIMENSION_ID_LV223 = -7;

	public final String DIMENSION_NAME_LV223 = "LV-223 (Varda)";
	public final String DIMENSION_GLOBAL_LV223 = "DIM_LV223";

	public final String TEXTURE_PATH_LV223_GAS_PLANET = DOMAIN + "textures/misc/gas-planet-zeta-2-reticuli.png";
	public final String TEXTURE_PATH_TITANIUM1 = DOMAIN + "textures/armor/titanium_1.png";
	public final String TEXTURE_PATH_TITANIUM2 = DOMAIN + "textures/armor/titanium_2.png";
	public final String TEXTURE_PATH_PRESSURESUIT1 = DOMAIN + "textures/armor/suit_1.png";
	public final String TEXTURE_PATH_PRESSURESUIT2 = DOMAIN + "textures/armor/suit_2.png";
	public final String TEXTURE_PATH_XENO1 = DOMAIN + "textures/armor/xeno_1.png";
	public final String TEXTURE_PATH_XENO2 = DOMAIN + "textures/armor/xeno_2.png";
	public final String TEXTURE_PATH_MARINE1 = DOMAIN + "textures/armor/marine_1.png";
	public final String TEXTURE_PATH_MARINE2 = DOMAIN + "textures/armor/marine_2.png";
	public final String TEXTURE_PATH_BULLET = DOMAIN + "textures/misc/renderbullet.png";
	public final String TEXTURE_PATH_SPEAR = DOMAIN + "textures/misc/renderspear.png";
	public final String TEXTURE_PATH_FX_ACID = DOMAIN + "textures/misc/renderacid.png";
	public final String TEXTURE_PATH_DISC = DOMAIN + "textures/misc/disc.png";
	public final String TEXTURE_PATH_SHURIKEN = DOMAIN + "textures/misc/shuriken.png";
	public final String TEXTURE_PATH_BLUR_CELTIC_HUD = DOMAIN + "textures/misc/celtic-helm-overlay.png";
	public final String TEXTURE_PATH_BLUR_MARINE_HUD = DOMAIN + "textures/misc/marine-helm-overlay.png";
	public final String TEXTURE_PATH_BLUR_FACEHUGGER = DOMAIN + "textures/misc/facehugger.png";
	public final String TEXTURE_PATH_BLUR_CHESTBURSTER_EMERGE = DOMAIN + "textures/misc/chestburster-emerge-overlay.png";
	public final String TEXTURE_PATH_BLUR_GUNSCOPE = DOMAIN + "textures/misc/scope.png";
	public final String TEXTURE_PATH_GRENADE = DOMAIN + "textures/items/itemGrenade.png";
	public final String TEXTURE_PATH_WALL_MINE = DOMAIN + "textures/items/itemWallMine.png";
	public final String TEXTURE_PATH_WRISTBLADES = DOMAIN + "textures/items/models/wristblade.png";
	public final String TEXTURE_PATH_PULSERIFLE = DOMAIN + "textures/items/models/pulserifle.png";
	public final String TEXTURE_PATH_M56SG = DOMAIN + "textures/items/models/m56sg.png";
	public final String TEXTURE_PATH_AK47 = DOMAIN + "textures/items/models/ak-47.png";
	public final String TEXTURE_PATH_M4 = DOMAIN + "textures/items/models/m4.png";
	public final String TEXTURE_PATH_SNIPER = DOMAIN + "textures/items/models/sniper.png";
	public final String TEXTURE_PATH_SNIPER_SCOPED = DOMAIN + "textures/items/models/sniper-scoped.png";
	public final String TEXTURE_PATH_MOTIONTRACKER = DOMAIN + "textures/items/models/motiontracker.png";
	public final String TEXTURE_PATH_TURRET = DOMAIN + "textures/tile/turret.png";
	public final String TEXTURE_PATH_WORKSTATION = DOMAIN + "textures/tile/workstation.png";
	public final String TEXTURE_PATH_WORKSTATION_ON = DOMAIN + "textures/tile/workstation-on.png";
	public final String TEXTURE_PATH_GENERATOR = DOMAIN + "textures/tile/generator.png";
	public final String TEXTURE_PATH_CABLE = DOMAIN + "textures/tile/cable.png";
	public final String TEXTURE_PATH_BLASTDOOR = DOMAIN + "textures/tile/blastdoor.png";
	public final String TEXTURE_PATH_WORKLIGHT = DOMAIN + "textures/tile/worklight.png";
	public final String TEXTURE_PATH_CHESTBUSTER = DOMAIN + "textures/mob/chestbuster.png";
	public final String TEXTURE_PATH_FACEHUGGER = DOMAIN + "textures/mob/facehugger.png";
	public final String TEXTURE_PATH_ROYALFACEHUGGER = DOMAIN + "textures/mob/royalfacehugger.png";
	public final String TEXTURE_PATH_STEVE = "/mob/char.png";
	public final String TEXTURE_PATH_MARINE = DOMAIN + "textures/mob/marine.png";
	public final String TEXTURE_PATH_OVAMORPH = DOMAIN + "textures/mob/alienegg.png";
	public final String TEXTURE_PATH_PREDALIEN = DOMAIN + "textures/mob/predalien.png";
	public final String TEXTURE_PATH_PRAETORIAN = DOMAIN + "textures/mob/praetorian.png";
	public final String TEXTURE_PATH_WARRIOR = DOMAIN + "textures/mob/warrior.png";
	public final String TEXTURE_PATH_WARRIOR_BLOOD = DOMAIN + "textures/mob/warrior_blood.png";
	public final String TEXTURE_PATH_DRONE_BASIC = DOMAIN + "textures/mob/drone_basic.png";
	public final String TEXTURE_PATH_DRONE_BASIC_BLOOD = DOMAIN + "textures/mob/drone_basic_blood.png";
	public final String TEXTURE_PATH_DRONE_ADVANCED = DOMAIN + "textures/mob/drone_advanced.png";
	public final String TEXTURE_PATH_DRONE_ADVANCED_BLOOD = DOMAIN + "textures/mob/drone_advanced_blood.png";
	public final String TEXTURE_PATH_AQUA_XENOMORPH = DOMAIN + "textures/mob/aqua.png";
	public final String TEXTURE_PATH_AQUA_XENOMORPH_GLOW = DOMAIN + "textures/mob/aqua_glow.png";
	public final String TEXTURE_PATH_XENOQUEEN = DOMAIN + "textures/mob/queen.png";
	public final String TEXTURE_PATH_YAUTJA = DOMAIN + "textures/mob/yautja.png";
	public final String TEXTURE_PATH_SPITTER = DOMAIN + "textures/mob/spitter.png";
	public final String TEXTURE_PATH_SPITTER_GLOW = DOMAIN + "textures/mob/spitter_glow.png";
	public final String TEXTURE_PATH_HIVE_NODE = DOMAIN + "textures/tile/node.png";
	public final String TEXTURE_PATH_CRUSHER = DOMAIN + "textures/mob/crusher.png";
	public final String TEXTURE_PATH_GUI_BASIC = DOMAIN + "textures/gui/background.png";
	public final String TEXTURE_PATH_GUI_TURRET = DOMAIN + "textures/gui/turret.png";
	public final String TEXTURE_PATH_GUI_WRISTBRACER = DOMAIN + "textures/gui/wristbracer.png";
	public final String TEXTURE_PATH_ICON_AMMO = DOMAIN + "textures/misc/icon-ammo.png";
	public final String TEXTURE_PATH_MOTIONTRACKER_BG = DOMAIN + "textures/misc/motiontracker/background.png";
	public final String TEXTURE_PATH_MOTIONTRACKER_FG = DOMAIN + "textures/misc/motiontracker/foreground.png";
	public final String TEXTURE_PATH_MOTIONTRACKER_PING = DOMAIN + "textures/misc/motiontracker/ping.png";
	public final String TEXTURE_PATH_MOTIONTRACKER_S1 = DOMAIN + "textures/misc/motiontracker/sweep1.png";
	public final String TEXTURE_PATH_MOTIONTRACKER_S2 = DOMAIN + "textures/misc/motiontracker/sweep2.png";
	public final String TEXTURE_PATH_MOTIONTRACKER_S3 = DOMAIN + "textures/misc/motiontracker/sweep3.png";
	public final String TEXTURE_PATH_MOTIONTRACKER_S4 = DOMAIN + "textures/misc/motiontracker/sweep4.png";
	public final String TEXTURE_PATH_MOTIONTRACKER_S5 = DOMAIN + "textures/misc/motiontracker/sweep5.png";
	public final String TEXTURE_PATH_MOTIONTRACKER_S6 = DOMAIN + "textures/misc/motiontracker/sweep6.png";
	
	public final String SOUND_ALIEN_LIVING = DOMAIN + "xeno.living";
	public final String SOUND_ALIEN_HURT = DOMAIN + "xeno.hurt";
	public final String SOUND_ALIEN_DEATH = DOMAIN + "xeno.death";
	public final String SOUND_PRAETORIAN_HURT = DOMAIN + "praetorian.hurt";
	public final String SOUND_PRAETORIAN_LIVING = DOMAIN + "praetorian.living";
	public final String SOUND_PRAETORIAN_DEATH = DOMAIN + "xeno.death";
	public final String SOUND_QUEEN_HURT = DOMAIN + "queen.hurt";
	public final String SOUND_QUEEN_LIVING = DOMAIN + "queen.living";
	public final String SOUND_QUEEN_DEATH = DOMAIN + "queen.death";
	public final String SOUND_SPITTER_HURT = DOMAIN + "praetorian.hurt";
	public final String SOUND_SPITTER_LIVING = DOMAIN + "praetorian.living";
	public final String SOUND_SPITTER_DEATH = DOMAIN + "xeno.death";
	public final String SOUND_WARRIOR_HURT = DOMAIN + "xeno.hurt";
	public final String SOUND_WARRIOR_LIVING = DOMAIN + "xeno.living";
	public final String SOUND_WARRIOR_DEATH = DOMAIN + "xeno.death";
	public final String SOUND_CRUSHER_HURT = DOMAIN + "praetorian.hurt";
	public final String SOUND_CRUSHER_LIVING = DOMAIN + "praetorian.living";
	public final String SOUND_CRUSHER_DEATH = DOMAIN + "xeno.death";
	public final String SOUND_CHESTBURSTER_DEATH = DOMAIN + "chestburster.death";
	public final String SOUND_FACEHUGGER_DEATH = DOMAIN + "facehugger.death";
	public final String SOUND_MARINE_HURT = DOMAIN + "marine.hurt";
	public final String SOUND_MARINE_DEATH = DOMAIN + "marine.death";
	public final String SOUND_YAUTJA_LIVING = DOMAIN + "predator.living";
	public final String SOUND_YAUTJA_HURT = DOMAIN + "predator.hurt";
	public final String SOUND_YAUTJA_DEATH = DOMAIN + "predator.death";
	public final String SOUND_WEAPON_FLAMETHROWER = DOMAIN + "weapon.flamethrower";
	public final String SOUND_WEAPON_GUNSHOT = DOMAIN + "weapon.gunshot";
	public final String SOUND_WEAPON_PLASMACASTER = DOMAIN + "weapon.plasmacaster";
	public final String SOUND_WEAPON_WRISTBLADES = DOMAIN + "weapon.blades";
	public final String SOUND_WEAPON_SNIPER = DOMAIN + "weapon.sniper";
	public final String SOUND_WEAPON_PULSERIFLE = DOMAIN + "weapon.pulserifle";
	public final String SOUND_WEAPON_M56SG = DOMAIN + "weapon.m56sg";
	public final String SOUND_MOTIONTRACKER_PING = DOMAIN + "motiontracker.ping";
	public final String SOUND_MOTIONTRACKER_PONG = DOMAIN + "motiontracker.pong";
	
	public final String LANG_WRISTBRACER_DETMODENOTIFY = "gui.wristbracer.notify.detmode";
	public final String LANG_WRISTBRACER_ITEMSLOSTWARNING = "gui.wristbracer.warning.itemslost";
	public final String LANG_BETA_FEEDBACK_SUBMIT_TITLE = "gui.beta.feedback.submit.title";
	public final String LANG_BETA_FEEDBACK_CHARSLEFT_TITLE = "gui.beta.feedback.charsleft.title";
	public final String LANG_BETA_FEEDBACK_INFO = "gui.beta.feedback.info";
	public final String LANG_BETA_FEEDBACK_SUBMIT_ERROR = "gui.beta.feedback.info.submit.error";
	public final String LANG_BETA_FEEDBACK_NOTIFY_SPAM_PREVENTION = "gui.beta.feedback.info.spamprevention";
	public final String LANG_BETA_FEEDBACK_SUBMIT_THANKS = "gui.beta.feedback.info.submit.thanks";
	public final String LANG_BETA_FEEDBACK_SUBMIT_ERROR_TITLE = "gui.beta.feedback.info.submit.error.title";
	public final String LANG_BETA_FEEDBACK_NOTIFY_SPAM_PREVENTION_TITLE = "gui.beta.feedback.info.spamprevention.title";
	public final String LANG_BETA_FEEDBACK_SUBMIT_THANKS_TITLE = "gui.beta.feedback.info.submit.thanks";
	public final String LANG_BETA_FEEDBACK_SUBMIT_BUTTON = "gui.beta.feedback.info.submit.button";
}