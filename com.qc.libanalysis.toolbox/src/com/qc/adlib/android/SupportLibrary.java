package com.qc.adlib.android;

import java.util.Collection;
import java.util.LinkedList;

/**
 * A collection of known Android support libraries and their properties
 * 
 * @author Ben Holland
 */
public class SupportLibrary extends Library {
	
	public SupportLibrary(String name, String basePackage, String reference) {
		super(name, basePackage, reference);
	}

	public static final SupportLibrary APP_COMPAT_V4 = new SupportLibrary("Android Support Library v4", "android.support.v4", "https://developer.android.com/tools/support-library/index.html");
	public static final SupportLibrary APP_COMPAT_V7 = new SupportLibrary("Android Support Library v7", "android.support.v7", "https://developer.android.com/tools/support-library/index.html");

	/**
	 * Returns a collection of all known Android support libraries
	 * @return
	 */
	public static Collection<SupportLibrary> getAllAdvertisementLibraries(){
		Collection<SupportLibrary> allSupportLibraries = new LinkedList<SupportLibrary>();
		allSupportLibraries.add(APP_COMPAT_V4);
		allSupportLibraries.add(APP_COMPAT_V7);
		return allSupportLibraries;
	}
}
