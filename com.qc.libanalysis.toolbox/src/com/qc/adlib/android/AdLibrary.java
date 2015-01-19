package com.qc.adlib.android;

import java.util.Collection;
import java.util.LinkedList;

import com.ensoftcorp.atlas.java.core.query.Q;
import com.ensoftcorp.atlas.java.core.script.Common;
import com.qc.adlib.PackageUtils;

/**
 * A collection of known Android advertisement libraries and their properties
 * Note: Primary reference http://arxiv.org/pdf/1303.0857.pdf
 * @author Ben Holland
 */
public class AdLibrary {

	private String name;
	private String basePackage;
	private String reference;
	
	public AdLibrary(String name, String basePackage, String reference) {
		this.name = name;
		this.basePackage = basePackage;
		this.reference = reference;
	}
	
	/**
	 * Returns the advertisement library name
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns the base package of the advertisement library
	 * @return
	 */
	public String getBasePackage() {
		return basePackage;
	}
	
	/**
	 * Returns a Q containing the packages contained in this advertisement library
	 * @return
	 */
	public Q getPackages(){
		return PackageUtils.getPackageWithSubpackages(Common.universe(), basePackage);
	}
	
	/**
	 * Returns a Q containing the types contained in the packages contained in this advertisement library
	 * @return
	 */
	public Q getTypes(){
		return PackageUtils.getPackageTypes(Common.universe(), getPackages());
	}
	
	/**
	 * Returns a reference to the advertisement library or null if none exists
	 * @return
	 */
	public String getReference() {
		return reference;
	}
	
	public static final AdLibrary AdMobGoogle = new AdLibrary("AdMob (com.google)", "com.google.ads", null);
	public static final AdLibrary Flurry = new AdLibrary("Flurry", "com.flurry", null);
	public static final AdLibrary InMobi = new AdLibrary("InMobi", "com.inmobi", null);
	public static final AdLibrary TapJoy = new AdLibrary("TapJoy", "com.tapjoy", null);
	public static final AdLibrary MobClix = new AdLibrary("MobClix", "com.mobclix", null);
	public static final AdLibrary ChartBoost = new AdLibrary("ChartBoost", "com.chartboost", null);
	public static final AdLibrary AdWhirl = new AdLibrary("AdWhirl", "com.adwhirl", null);
	public static final AdLibrary MoPub = new AdLibrary("MoPub", "com.mopub", null);
	public static final AdLibrary GreyStripe = new AdLibrary("GreyStripe", "com.greystripe", null);
	public static final AdLibrary JumpTap = new AdLibrary("JumpTap", "com.jumptap", null);
	public static final AdLibrary GoogleAnalytics = new AdLibrary("Google Analytics", "com.google.analytics", null);
	public static final AdLibrary AdMob = new AdLibrary("AdMob (com.admob)", "com.admob", null);
	public static final AdLibrary Burstly = new AdLibrary("Burstly", "com.burstly", null);
	public static final AdLibrary SponsorPay = new AdLibrary("SponsorPay", "com.sponsorpay", null);
	public static final AdLibrary Cauly = new AdLibrary("Cauly", "com.cauly", null);
	public static final AdLibrary MobFox = new AdLibrary("MobFox", "com.mobfox", null);
	public static final AdLibrary Vpon = new AdLibrary("Vpon.com", "com.vpon", null);
	public static final AdLibrary AppBrain = new AdLibrary("AppBrain", "com.appbrain", null);
	public static final AdLibrary Daum = new AdLibrary("Daum.net", "net.daum", null);
	public static final AdLibrary AdMarvel = new AdLibrary("AdMarvel", "com.admarvel", null);
	public static final AdLibrary AppLovin = new AdLibrary("AppLovin", "com.applovin", null);
	public static final AdLibrary Adfonic = new AdLibrary("Adfonic", "com.adfonic", null);
	public static final AdLibrary MdotM = new AdLibrary("MdotM", "com.mdotm", null);
	public static final AdLibrary GetJar = new AdLibrary("GetJar", "com.getjar", null);
	public static final AdLibrary NexAge = new AdLibrary("NexAge", "com.nexage", null);
	public static final AdLibrary InnerActive = new AdLibrary("InnerActive", "com.inneractive", null);
	public static final AdLibrary Pontiflex = new AdLibrary("Pontiflex", "com.pontiflex", null);
	public static final AdLibrary ZestAdz = new AdLibrary("ZestAdz", "com.zestadz", null);
	public static final AdLibrary MadHouse = new AdLibrary("MadHouse", "com.madhouse", null);
	public static final AdLibrary Smaato = new AdLibrary("Smaato", "com.smaato", null);
	public static final AdLibrary YouMi = new AdLibrary("YouMi", "net.youmi", null);
	public static final AdLibrary mAdvertiseDE = new AdLibrary("mAdvertise.de", "de.madvertise", null);
	public static final AdLibrary DoMobCN = new AdLibrary("DoMob.cn", "cn.domob", null);
	public static final AdLibrary Jirbo_AdColony = new AdLibrary("Jirbo/AdColony", "com.jirbo.adcolony", null);
	public static final AdLibrary RevMob = new AdLibrary("RevMob", "com.revmob", null);
	public static final AdLibrary SendDroid = new AdLibrary("SendDroid", "com.senddroid", null);
	public static final AdLibrary AirPush = new AdLibrary("AirPush", "com.airpush", null);
	public static final AdLibrary Tapit = new AdLibrary("Tapit", "com.tapit", null);
	public static final AdLibrary Medialets = new AdLibrary("Medialets", "com.medialets", null);
	public static final AdLibrary Mediba = new AdLibrary("Mediba", "mediba.ad", null);
	public static final AdLibrary Papaya = new AdLibrary("Papaya", "com.papaya", null);
	public static final AdLibrary HuntMobileAds = new AdLibrary("Hunt Mobile Ads", "com.huntmads", null);
	public static final AdLibrary RhythmNewMedia = new AdLibrary("RhythmNewMedia", "com.rhythmnewmedia", null);
	public static final AdLibrary TapForTap = new AdLibrary("TapForTap", "com.tapfortap", null);
	public static final AdLibrary AdKnowledge = new AdLibrary("AdKnowledge", "com.adknowledge", null);
	public static final AdLibrary Metaps = new AdLibrary("Metaps", "net.metaps", null);
	public static final AdLibrary WiYun = new AdLibrary("WiYun", "com.wiyun", null);
	public static final AdLibrary Vdopia = new AdLibrary("Vdopia.com", "com.vdopia", null);
	public static final AdLibrary Waps = new AdLibrary("Waps", "com.waps", null);
	public static final AdLibrary AdWo = new AdLibrary("AdWo", "com.adwo", null);
	public static final AdLibrary MoboSquare = new AdLibrary("MoboSquare", "com.mobosquare", null);
	public static final AdLibrary Vserv = new AdLibrary("Vserv", "mobi.vserv", null);
	public static final AdLibrary WooBoo = new AdLibrary("WooBoo", "com.wooboo", null);
	public static final AdLibrary EverBadge = new AdLibrary("EverBadge", "com.everbadge", null);
	public static final AdLibrary AirAd = new AdLibrary("AirAd", "com.mt.airad", null);
	public static final AdLibrary Noqoush_AdFalcon = new AdLibrary("Noqoush/AdFalcon", "com.noqoush.adfalcon", null);
	public static final AdLibrary Moolah = new AdLibrary("Moolah", "com.moolah", null);
	public static final AdLibrary Kuguo = new AdLibrary("Kuguo", "com.kuguo", null);
	public static final AdLibrary BuzzCity = new AdLibrary("BuzzCity", "buzzcity", null);
	public static final AdLibrary AdsMogo = new AdLibrary("AdsMogo", "com.adsmogo", null);
	public static final AdLibrary SellaRing = new AdLibrary("SellaRing", "com.sellaring", null);
	public static final AdLibrary StartApp = new AdLibrary("StartApp", "com.startapp", null);
	public static final AdLibrary AdModa = new AdLibrary("AdModa", "com.admoda", null);
	public static final AdLibrary MobPartner = new AdLibrary("MobPartner", "com.mobpartner", null);
	public static final AdLibrary QuClix = new AdLibrary("QuClix", "com.quclix", null);
	public static final AdLibrary lDevelop = new AdLibrary("lDevelop", "com.ldevelop", null);
	
	/**
	 * Returns a collection of all known Android advertisement libraries
	 * @return
	 */
	public static Collection<AdLibrary> getAllAdvertisementLibraries(){
		Collection<AdLibrary> allAdvertisementLibraries = new LinkedList<AdLibrary>();
		allAdvertisementLibraries.add(AdMobGoogle);
		allAdvertisementLibraries.add(Flurry);
		allAdvertisementLibraries.add(InMobi);
		allAdvertisementLibraries.add(TapJoy);
		allAdvertisementLibraries.add(MobClix);
		allAdvertisementLibraries.add(ChartBoost);
		allAdvertisementLibraries.add(AdWhirl);
		allAdvertisementLibraries.add(MoPub);
		allAdvertisementLibraries.add(GreyStripe);
		allAdvertisementLibraries.add(JumpTap);
		allAdvertisementLibraries.add(GoogleAnalytics);
		allAdvertisementLibraries.add(AdMob);
		allAdvertisementLibraries.add(Burstly);
		allAdvertisementLibraries.add(SponsorPay);
		allAdvertisementLibraries.add(Cauly);
		allAdvertisementLibraries.add(MobFox);
		allAdvertisementLibraries.add(Vpon);
		allAdvertisementLibraries.add(AppBrain);
		allAdvertisementLibraries.add(Daum);
		allAdvertisementLibraries.add(AdMarvel);
		allAdvertisementLibraries.add(AppLovin);
		allAdvertisementLibraries.add(Adfonic);
		allAdvertisementLibraries.add(MdotM);
		allAdvertisementLibraries.add(GetJar);
		allAdvertisementLibraries.add(NexAge);
		allAdvertisementLibraries.add(InnerActive);
		allAdvertisementLibraries.add(Pontiflex);
		allAdvertisementLibraries.add(ZestAdz);
		allAdvertisementLibraries.add(MadHouse);
		allAdvertisementLibraries.add(Smaato);
		allAdvertisementLibraries.add(YouMi);
		allAdvertisementLibraries.add(mAdvertiseDE);
		allAdvertisementLibraries.add(DoMobCN);
		allAdvertisementLibraries.add(Jirbo_AdColony);
		allAdvertisementLibraries.add(RevMob);
		allAdvertisementLibraries.add(SendDroid);
		allAdvertisementLibraries.add(AirPush);
		allAdvertisementLibraries.add(Tapit);
		allAdvertisementLibraries.add(Medialets);
		allAdvertisementLibraries.add(Mediba);
		allAdvertisementLibraries.add(Papaya);
		allAdvertisementLibraries.add(HuntMobileAds);
		allAdvertisementLibraries.add(RhythmNewMedia);
		allAdvertisementLibraries.add(TapForTap);
		allAdvertisementLibraries.add(AdKnowledge);
		allAdvertisementLibraries.add(Metaps);
		allAdvertisementLibraries.add(WiYun);
		allAdvertisementLibraries.add(Vdopia);
		allAdvertisementLibraries.add(Waps);
		allAdvertisementLibraries.add(AdWo);
		allAdvertisementLibraries.add(MoboSquare);
		allAdvertisementLibraries.add(Vserv);
		allAdvertisementLibraries.add(WooBoo);
		allAdvertisementLibraries.add(EverBadge);
		allAdvertisementLibraries.add(AirAd);
		allAdvertisementLibraries.add(Noqoush_AdFalcon);
		allAdvertisementLibraries.add(Moolah);
		allAdvertisementLibraries.add(Kuguo);
		allAdvertisementLibraries.add(BuzzCity);
		allAdvertisementLibraries.add(AdsMogo);
		allAdvertisementLibraries.add(SellaRing);
		allAdvertisementLibraries.add(StartApp);
		allAdvertisementLibraries.add(AdModa);
		allAdvertisementLibraries.add(MobPartner);
		allAdvertisementLibraries.add(QuClix);
		allAdvertisementLibraries.add(lDevelop);
		return allAdvertisementLibraries;
	}
	
}
