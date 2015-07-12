package com.qc.adlib;

import com.ensoftcorp.atlas.core.query.Attr.Node;
import com.ensoftcorp.atlas.core.query.Q;
import com.ensoftcorp.atlas.core.script.Common;
import com.ensoftcorp.atlas.core.script.CommonQueries;
import com.ensoftcorp.atlas.core.script.CommonQueries.TraversalDirection;

public class PackageUtils {

	private PackageUtils() {}
	
	/**
	 * Returns a Q containing package nodes including the given package 
	 * and its subpackages
	 * @param packageName
	 * @return
	 */
	public static Q getPackageWithSubpackages(String packageName){
		Q allPackages = Common.universe().nodesTaggedWithAny(Node.PACKAGE);
		return CommonQueries.nodesStartingWith(allPackages, packageName);
	}
	
	/**
	 * Returns a Q containing the types in the given collection of packages
	 * @param packages
	 * @return
	 */
	public static Q getPackageTypes(Q packages){
		packages = packages.nodesTaggedWithAny(Node.PACKAGE);
		return CommonQueries.declarations(Common.universe(), packages).nodesTaggedWithAny(Node.TYPE);
	}
	
	/**
	 * Returns everything declared under the given package and subpackages
	 * @param basePackageName
	 * @return
	 */
	public static Q getPackageDeclarations(String basePackageName){
		return CommonQueries.declarations(Common.universe(), getPackageWithSubpackages(basePackageName), TraversalDirection.FORWARD);
	}
	
}
