package com.qc.adlib;

import com.ensoftcorp.atlas.core.db.graph.GraphElement;
import com.ensoftcorp.atlas.core.db.set.AtlasHashSet;
import com.ensoftcorp.atlas.core.db.set.AtlasSet;
import com.ensoftcorp.atlas.java.core.query.Q;
import com.ensoftcorp.atlas.java.core.script.Common;
import com.ensoftcorp.atlas.java.core.script.CommonQueries;
import com.ensoftcorp.atlas.java.core.script.CommonQueries.TraversalDirection;
import com.qc.adlib.android.AdLibrary;
import com.qc.adlib.android.Library;
import com.qc.adlib.android.SupportLibrary;

public class Libraries {

	/**
	 * Returns a Q containing all known library declarations
	 * @return
	 */
	public static Q getLibraryDeclarations(){
		AtlasSet<GraphElement> packages = new AtlasHashSet<GraphElement>();
		
		// add package and subpackages from advertisement libraries
		for(Library library : AdLibrary.getAllAdvertisementLibraries()){
			packages.addAll(library.getPackages().eval().nodes());
		}
		
		// add package and subpackages from support libraries
		for(Library library : SupportLibrary.getAllSupportLibraries()){
			packages.addAll(library.getPackages().eval().nodes());
		}
		
		return CommonQueries.declarations(Common.universe(), Common.toQ(Common.toGraph(packages)), TraversalDirection.FORWARD);
	}
	
}
