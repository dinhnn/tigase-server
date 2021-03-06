/*
 * Component1Registrar.java
 *
 * Tigase Jabber/XMPP Server
 * Copyright (C) 2004-2016 "Tigase, Inc." <office@tigase.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. Look for COPYING file in the top folder.
 * If not, see http://www.gnu.org/licenses/.
 */

package tigase.kernel.modular.c1;

import tigase.kernel.beans.Bean;
import tigase.kernel.beans.RegistrarBean;
import tigase.kernel.core.Kernel;

@Bean(name = "component1Registrar")
public class Component1Registrar extends Component1 implements RegistrarBean {


	@Override
	public void register(Kernel kernel) {
		kernel.registerBean(Helper.class).exec();
	}

	@Override
	public void unregister(Kernel kernel) {
		kernel.unregister("Helper");
	}
}
