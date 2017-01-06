package com.dtc.test.client;

import com.dtc.fhir.gwt.DiagnosticReport;
import com.dtc.fhir.gwt.Patient;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;

public class Material extends Composite {
	private static MaterialUiBinder uiBinder = GWT.create(MaterialUiBinder.class);
	interface MaterialUiBinder extends UiBinder<Widget, Material> {}

	@UiField MaterialButton button;

	public Material() {
		GWT.log("version: " + GWT.getVersion());
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("button")
	public void onBtnClick(ClickEvent event) {
		GWT.log("New Patient: " + (new Patient().hashCode()));
		GWT.log("New Patient: " + (new DiagnosticReport().hashCode()));
	}
}
