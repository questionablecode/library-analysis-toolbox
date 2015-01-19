package com.qc.adlib.android;

import java.util.Collection;
import java.util.LinkedList;

/**
 * A collection of known Android advertisement libraries and their properties
 * Note: Primary reference http://arxiv.org/pdf/1303.0857.pdf
 * @author Ben Holland
 */
public class AdLibrary extends Library {
	
	public AdLibrary(String name, String basePackage, String reference) {
		super(name, basePackage, reference);
	}

	public static final AdLibrary ADMOB_GOOGLE = new AdLibrary("AdMob (com.google)", "com.google.ads", null);
	public static final AdLibrary FLURRY = new AdLibrary("Flurry", "com.flurry", null);
	public static final AdLibrary IN_MOBI = new AdLibrary("InMobi", "com.inmobi", null);
	public static final AdLibrary TAP_JOY = new AdLibrary("TapJoy", "com.tapjoy", null);
	public static final AdLibrary MOB_CLIX = new AdLibrary("MobClix", "com.mobclix", null);
	public static final AdLibrary CHART_BOOST = new AdLibrary("ChartBoost", "com.chartboost", null);
	public static final AdLibrary AD_WHIRL = new AdLibrary("AdWhirl", "com.adwhirl", null);
	public static final AdLibrary MO_PUB = new AdLibrary("MoPub", "com.mopub", null);
	public static final AdLibrary GREY_STRIPE = new AdLibrary("GreyStripe", "com.greystripe", null);
	public static final AdLibrary JUMP_TAP = new AdLibrary("JumpTap", "com.jumptap", null);
	public static final AdLibrary GOOGLE_ANALYTICS = new AdLibrary("Google Analytics", "com.google.analytics", null);
	public static final AdLibrary ADMOB = new AdLibrary("AdMob (com.admob)", "com.admob", null);
	public static final AdLibrary BURSTLY = new AdLibrary("Burstly", "com.burstly", null);
	public static final AdLibrary SPONSOR_PAY = new AdLibrary("SponsorPay", "com.sponsorpay", null);
	public static final AdLibrary CAULY = new AdLibrary("Cauly", "com.cauly", null);
	public static final AdLibrary MOB_FOX = new AdLibrary("MobFox", "com.mobfox", null);
	public static final AdLibrary VPON = new AdLibrary("Vpon.com", "com.vpon", null);
	public static final AdLibrary APP_BRAIN = new AdLibrary("AppBrain", "com.appbrain", null);
	public static final AdLibrary DAUM = new AdLibrary("Daum.net", "net.daum", null);
	public static final AdLibrary AD_MARVEL = new AdLibrary("AdMarvel", "com.admarvel", null);
	public static final AdLibrary APP_LOVIN = new AdLibrary("AppLovin", "com.applovin", null);
	public static final AdLibrary ADFONIC = new AdLibrary("Adfonic", "com.adfonic", null);
	public static final AdLibrary MDOT_M = new AdLibrary("MdotM", "com.mdotm", null);
	public static final AdLibrary GET_JAR = new AdLibrary("GetJar", "com.getjar", null);
	public static final AdLibrary NEX_AGE = new AdLibrary("NexAge", "com.nexage", null);
	public static final AdLibrary INNER_ACTIVE = new AdLibrary("InnerActive", "com.inneractive", null);
	public static final AdLibrary PONTIFLEX = new AdLibrary("Pontiflex", "com.pontiflex", null);
	public static final AdLibrary ZEST_ADZ = new AdLibrary("ZestAdz", "com.zestadz", null);
	public static final AdLibrary MAD_HOUSE = new AdLibrary("MadHouse", "com.madhouse", null);
	public static final AdLibrary SMAATO = new AdLibrary("Smaato", "com.smaato", null);
	public static final AdLibrary YOU_MI = new AdLibrary("YouMi", "net.youmi", null);
	public static final AdLibrary M_ADVERTISE_DE = new AdLibrary("mAdvertise.de", "de.madvertise", null);
	public static final AdLibrary DO_MOB_CN = new AdLibrary("DoMob.cn", "cn.domob", null);
	public static final AdLibrary JIRBO_AD_COLONY = new AdLibrary("Jirbo/AdColony", "com.jirbo.adcolony", null);
	public static final AdLibrary REV_MOB = new AdLibrary("RevMob", "com.revmob", null);
	public static final AdLibrary SEND_DROID = new AdLibrary("SendDroid", "com.senddroid", null);
	public static final AdLibrary AIR_PUSH = new AdLibrary("AirPush", "com.airpush", null);
	public static final AdLibrary TAPIT = new AdLibrary("Tapit", "com.tapit", null);
	public static final AdLibrary MEDIALETS = new AdLibrary("Medialets", "com.medialets", null);
	public static final AdLibrary MEDIBA = new AdLibrary("Mediba", "mediba.ad", null);
	public static final AdLibrary PAPAYA = new AdLibrary("Papaya", "com.papaya", null);
	public static final AdLibrary HUNT_MOBILE_ADS = new AdLibrary("Hunt Mobile Ads", "com.huntmads", null);
	public static final AdLibrary RHYTHM_NEW_MEDIA = new AdLibrary("RhythmNewMedia", "com.rhythmnewmedia", null);
	public static final AdLibrary TAP_FOR_TAP = new AdLibrary("TapForTap", "com.tapfortap", null);
	public static final AdLibrary AD_KNOWLEDGE = new AdLibrary("AdKnowledge", "com.adknowledge", null);
	public static final AdLibrary METAPS = new AdLibrary("Metaps", "net.metaps", null);
	public static final AdLibrary WI_YUN = new AdLibrary("WiYun", "com.wiyun", null);
	public static final AdLibrary VDOPIA = new AdLibrary("Vdopia.com", "com.vdopia", null);
	public static final AdLibrary WAPS = new AdLibrary("Waps", "com.waps", null);
	public static final AdLibrary AD_WO = new AdLibrary("AdWo", "com.adwo", null);
	public static final AdLibrary MOBO_SQUARE = new AdLibrary("MoboSquare", "com.mobosquare", null);
	public static final AdLibrary VSERV = new AdLibrary("Vserv", "mobi.vserv", null);
	public static final AdLibrary WOO_BOO = new AdLibrary("WooBoo", "com.wooboo", null);
	public static final AdLibrary EVER_BADGE = new AdLibrary("EverBadge", "com.everbadge", null);
	public static final AdLibrary AIR_AD = new AdLibrary("AirAd", "com.mt.airad", null);
	public static final AdLibrary NOQOUSH_AD_FALCON = new AdLibrary("Noqoush/AdFalcon", "com.noqoush.adfalcon", null);
	public static final AdLibrary MOOLAH = new AdLibrary("Moolah", "com.moolah", null);
	public static final AdLibrary KUGUO = new AdLibrary("Kuguo", "com.kuguo", null);
	public static final AdLibrary BUZZ_CITY = new AdLibrary("BuzzCity", "buzzcity", null);
	public static final AdLibrary ADS_MOGO = new AdLibrary("AdsMogo", "com.adsmogo", null);
	public static final AdLibrary SELLA_RING = new AdLibrary("SellaRing", "com.sellaring", null);
	public static final AdLibrary START_APP = new AdLibrary("StartApp", "com.startapp", null);
	public static final AdLibrary ADMODA = new AdLibrary("AdModa", "com.admoda", null);
	public static final AdLibrary MOB_PARTNER = new AdLibrary("MobPartner", "com.mobpartner", null);
	public static final AdLibrary QU_CLIX = new AdLibrary("QuClix", "com.quclix", null);
	public static final AdLibrary L_DEVELOP = new AdLibrary("lDevelop", "com.ldevelop", null);
	
	/**
	 * Returns a collection of all known Android advertisement libraries
	 * @return
	 */
	public static Collection<AdLibrary> getAllAdvertisementLibraries(){
		Collection<AdLibrary> allAdvertisementLibraries = new LinkedList<AdLibrary>();
		allAdvertisementLibraries.add(ADMOB_GOOGLE);
		allAdvertisementLibraries.add(FLURRY);
		allAdvertisementLibraries.add(IN_MOBI);
		allAdvertisementLibraries.add(TAP_JOY);
		allAdvertisementLibraries.add(MOB_CLIX);
		allAdvertisementLibraries.add(CHART_BOOST);
		allAdvertisementLibraries.add(AD_WHIRL);
		allAdvertisementLibraries.add(MO_PUB);
		allAdvertisementLibraries.add(GREY_STRIPE);
		allAdvertisementLibraries.add(JUMP_TAP);
		allAdvertisementLibraries.add(GOOGLE_ANALYTICS);
		allAdvertisementLibraries.add(ADMOB);
		allAdvertisementLibraries.add(BURSTLY);
		allAdvertisementLibraries.add(SPONSOR_PAY);
		allAdvertisementLibraries.add(CAULY);
		allAdvertisementLibraries.add(MOB_FOX);
		allAdvertisementLibraries.add(VPON);
		allAdvertisementLibraries.add(APP_BRAIN);
		allAdvertisementLibraries.add(DAUM);
		allAdvertisementLibraries.add(AD_MARVEL);
		allAdvertisementLibraries.add(APP_LOVIN);
		allAdvertisementLibraries.add(ADFONIC);
		allAdvertisementLibraries.add(MDOT_M);
		allAdvertisementLibraries.add(GET_JAR);
		allAdvertisementLibraries.add(NEX_AGE);
		allAdvertisementLibraries.add(INNER_ACTIVE);
		allAdvertisementLibraries.add(PONTIFLEX);
		allAdvertisementLibraries.add(ZEST_ADZ);
		allAdvertisementLibraries.add(MAD_HOUSE);
		allAdvertisementLibraries.add(SMAATO);
		allAdvertisementLibraries.add(YOU_MI);
		allAdvertisementLibraries.add(M_ADVERTISE_DE);
		allAdvertisementLibraries.add(DO_MOB_CN);
		allAdvertisementLibraries.add(JIRBO_AD_COLONY);
		allAdvertisementLibraries.add(REV_MOB);
		allAdvertisementLibraries.add(SEND_DROID);
		allAdvertisementLibraries.add(AIR_PUSH);
		allAdvertisementLibraries.add(TAPIT);
		allAdvertisementLibraries.add(MEDIALETS);
		allAdvertisementLibraries.add(MEDIBA);
		allAdvertisementLibraries.add(PAPAYA);
		allAdvertisementLibraries.add(HUNT_MOBILE_ADS);
		allAdvertisementLibraries.add(RHYTHM_NEW_MEDIA);
		allAdvertisementLibraries.add(TAP_FOR_TAP);
		allAdvertisementLibraries.add(AD_KNOWLEDGE);
		allAdvertisementLibraries.add(METAPS);
		allAdvertisementLibraries.add(WI_YUN);
		allAdvertisementLibraries.add(VDOPIA);
		allAdvertisementLibraries.add(WAPS);
		allAdvertisementLibraries.add(AD_WO);
		allAdvertisementLibraries.add(MOBO_SQUARE);
		allAdvertisementLibraries.add(VSERV);
		allAdvertisementLibraries.add(WOO_BOO);
		allAdvertisementLibraries.add(EVER_BADGE);
		allAdvertisementLibraries.add(AIR_AD);
		allAdvertisementLibraries.add(NOQOUSH_AD_FALCON);
		allAdvertisementLibraries.add(MOOLAH);
		allAdvertisementLibraries.add(KUGUO);
		allAdvertisementLibraries.add(BUZZ_CITY);
		allAdvertisementLibraries.add(ADS_MOGO);
		allAdvertisementLibraries.add(SELLA_RING);
		allAdvertisementLibraries.add(START_APP);
		allAdvertisementLibraries.add(ADMODA);
		allAdvertisementLibraries.add(MOB_PARTNER);
		allAdvertisementLibraries.add(QU_CLIX);
		allAdvertisementLibraries.add(L_DEVELOP);
		return allAdvertisementLibraries;
	}
	
}
