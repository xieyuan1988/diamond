/**
 * Copyright 2013 Qiangqiang RAO
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
package com.openteach.diamond.rpc.protocol;

import com.openteach.diamond.common.lifecycle.AbstractLifeCycle;


/**
 * 
 * @author sihai
 *
 */
public abstract class AbstractRPCProtocol extends AbstractLifeCycle implements RPCProtocol {

	/**
	 * 
	 */
	protected RPCProtocolConfiguration configuration;
	
	/**
	 * 
	 * @param configuration
	 */
	public AbstractRPCProtocol(RPCProtocolConfiguration configuration) {
		this.configuration = configuration;
	}
}
