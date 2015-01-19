package com.qc.adlib;

import com.ensoftcorp.atlas.java.core.query.Attr.Node;
import com.ensoftcorp.atlas.java.core.query.Q;
import com.ensoftcorp.atlas.java.core.script.Common;
import com.ensoftcorp.atlas.java.core.script.CommonQueries;

public class PackageUtils {

	private PackageUtils() {}
	
	/**
	 * Returns a Q containing package nodes including the given package 
	 * and its subpackages within the given context
	 * @param context
	 * @param packageName
	 * @return
	 */
	public static Q getPackageWithSubpackages(Q context, String packageName){
		Q allPackages = Common.universe().nodesTaggedWithAny(Node.PACKAGE);
		return CommonQueries.nodesStartingWith(allPackages, packageName);
	}
	
	/**
	 * Returns a Q containing the types in the given collection of packages 
	 * and the given context
	 * @param context
	 * @param packages
	 * @return
	 */
	public static Q getPackageTypes(Q context, Q packages){
		packages = packages.nodesTaggedWithAny(Node.PACKAGE);
		return CommonQueries.declarations(context, packages).nodesTaggedWithAny(Node.TYPE);
	}
	
}
