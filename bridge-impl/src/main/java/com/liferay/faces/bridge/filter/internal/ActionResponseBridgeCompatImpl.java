/**
 * Copyright (c) 2000-2015 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.bridge.filter.internal;

import javax.faces.context.FacesContext;
import javax.faces.context.PartialViewContext;
import javax.portlet.ActionResponse;
import javax.portlet.filter.ActionResponseWrapper;


/**
 * This class provides a compatibility layer that isolates differences between JSF1 and JSF2.
 *
 * @author  Neil Griffin
 */
public abstract class ActionResponseBridgeCompatImpl extends ActionResponseWrapper {

	public ActionResponseBridgeCompatImpl(ActionResponse response) {
		super(response);
	}

	protected void partialViewContextRenderAll(FacesContext facesContext) {

		PartialViewContext partialViewContext = facesContext.getPartialViewContext();

		if (!partialViewContext.isRenderAll()) {
			partialViewContext.setRenderAll(true);
		}
	}
}
