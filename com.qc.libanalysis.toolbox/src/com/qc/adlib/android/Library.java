package com.qc.adlib.android;

import com.ensoftcorp.atlas.core.query.Q;
import com.qc.adlib.PackageUtils;

/**
 * Basic class for analyzing libraries
 * @author Ben Holland
 */
public class Library {

	private String name;
	private String basePackage;
	private String reference;

	public Library(String name, String basePackage, String reference) {
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
	
}
