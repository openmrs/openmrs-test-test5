/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.test5;


import org.apache.commons.logging.Log; 
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.ModuleActivator;
import org.openmrs.module.ModuleTestData;

/**
 * This class contains the logic that is run every time this module is either started or stopped.
 */
public class Test5ModuleActivator implements ModuleActivator {
	
	public static final String MODULE_ID = "test5";
	
	protected Log log = LogFactory.getLog(getClass());
		
	/**
	 * @see ModuleActivator#willRefreshContext()
	 */
	public void willRefreshContext() {
		ModuleTestData.getInstance().willRefreshContext(MODULE_ID);
	}
	
	/**
	 * @see ModuleActivator#contextRefreshed()
	 */
	public void contextRefreshed() {
		ModuleTestData.getInstance().contextRefreshed(MODULE_ID);
	}
	
	/**
	 * @see ModuleActivator#willStart()
	 */
	public void willStart() {
		ModuleTestData.getInstance().willStart(MODULE_ID);
	}
	
	/**
	 * @see ModuleActivator#started()
	 */
	public void started() {
		ModuleTestData.getInstance().started(MODULE_ID);
	}
	
	/**
	 * @see ModuleActivator#willStop()
	 */
	public void willStop() {
		ModuleTestData.getInstance().willStop(MODULE_ID);
	}
	
	/**
	 * @see ModuleActivator#stopped()
	 */
	public void stopped() {
		ModuleTestData.getInstance().stopped(MODULE_ID);
	}
}
