/*
 * extjs
 * Created on 2011-12-3-上午10:13:11
 */

package org.webframe.extjs;

import org.webframe.support.driver.AbstractModulePluginDriver;
import org.webframe.support.driver.ModulePluginManager;

/**
 * @author <a href="mailto:guoqing.huang@foxmail.com">黄国庆 </a>
 * @version $Id: codetemplates.xml,v 1.1 2009/09/07 08:48:12 Exp $ Create: 2011-12-3 上午10:13:11
 */
public class ExtjsModulePluginDriver extends AbstractModulePluginDriver {

	static {
		ModulePluginManager.registerDriver(new ExtjsModulePluginDriver());
	}

	/* (non-Javadoc)
	 * @see org.webframe.support.driver.ModulePluginDriver#getModuleName()
	 */
	public String getModuleName() {
		return "ExtjsModule";
	}

	@Override
	public String getEntityLocation() {
		return null;
	}
}
