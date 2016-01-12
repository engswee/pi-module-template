package com.abc.xpi.af.modules;

import javax.ejb.Stateless;

import com.sap.aii.af.lib.mp.module.Module;
import com.sap.aii.af.lib.mp.module.ModuleContext;
import com.sap.aii.af.lib.mp.module.ModuleData;
import com.sap.aii.af.lib.mp.module.ModuleException;

@Stateless
public class TemplateBean implements Module{


	@Override
	public ModuleData process(ModuleContext moduleContext,
			ModuleData inputModuleData) throws ModuleException {

		
		return inputModuleData;
	}

}
