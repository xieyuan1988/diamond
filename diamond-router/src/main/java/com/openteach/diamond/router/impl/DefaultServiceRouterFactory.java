/**
 * Copyright 2013 openteach
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.openteach.diamond.router.impl;

import com.openteach.diamond.address.AddressingService;
import com.openteach.diamond.router.ServiceRouter;
import com.openteach.diamond.router.ServiceRouterFactory;
import com.openteach.diamond.router.plugin.RouterPlugin;

/**
 * 
 * @author sihai
 *
 */
public class DefaultServiceRouterFactory implements ServiceRouterFactory {

	@Override
	public ServiceRouter newServiceRouter(AddressingService addressingService, RouterPlugin plugin) {
		DefaultServiceRouter router = new DefaultServiceRouter(addressingService, plugin);
		router.initialize();
		router.start();
		return router;
	}

}
