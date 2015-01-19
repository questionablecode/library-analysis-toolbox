package com.qc.adlib.android;

import java.util.Collection;
import java.util.LinkedList;

import com.ensoftcorp.atlas.java.core.query.Q;
import com.qc.adlib.PackageUtils;

/**
 * A collection of known Android support libraries and their properties
 * 
 * @author Ben Holland
 */
public class SupportLibrary {

	private String name;
	private String basePackage;
	private String reference;

	public SupportLibrary(String name, String basePackage, String reference) {
		this.name = name;
		this.basePackage = basePackage;
		this.reference = reference;
	}

	/**
	 * Returns the support library name
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the base package of the support library
	 * 
	 * @return
	 */
	public String getBasePackage() {
		return basePackage;
	}

	/**
	 * Returns a Q containing the packages contained in this support library
	 * @return
	 */
	public Q getPackages(){
		return PackageUtils.getPackageWithSubpackages(basePackage);
	}
	
	/**
	 * Returns a Q containing the types contained in the packages contained in this support library
	 * @return
	 */
	public Q getTypes(){
		return PackageUtils.getPackageTypes(getPackages());
	}
	
	/**
	 * Returns a Q containing all the declarations made in the packages contained in this support library
	 * @return
	 */
	public Q getDeclarations(){
		return PackageUtils.getPackageDeclarations(basePackage);
	}

	/**
	 * Returns a reference to the advertisement library or null if none exists
	 * 
	 * @return
	 */
	public String getReference() {
		return reference;
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
