package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class try2 extends Composite  {

	private static try2UiBinder uiBinder = GWT.create(try2UiBinder.class);

	interface try2UiBinder extends UiBinder<Widget, try2> {
	}

	public try2() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
