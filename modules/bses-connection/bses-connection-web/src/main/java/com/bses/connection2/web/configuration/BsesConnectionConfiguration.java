package com.bses.connection2.web.configuration;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;
import aQute.bnd.annotation.metatype.Meta;


@ExtendedObjectClassDefinition(category= "BSES Connection Configuration",scope = ExtendedObjectClassDefinition.Scope.GROUP)
@Meta.OCD
(
	id = "com.bses.connection2.web.configuration.BsesConnectionConfiguration"
)
public interface BsesConnectionConfiguration {

	@Meta.AD
	(
		deflt = "U01" ,
		required = true
	)
	public String viewMode(); 

	
}
