package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;

import gwt.material.design.client.data.component.*;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.*;
import gwt.material.design.addins.client.*;
import gwt.material.design.addins.client.window.MaterialWindow;
public class Layout2 extends Composite  {

	private static Layout2UiBinder uiBinder = GWT.create(Layout2UiBinder.class);

	interface Layout2UiBinder extends UiBinder<Widget, Layout2> {
	}

	public Layout2() {
		initWidget(uiBinder.createAndBindUi(this));
		GWT.runAsync(new RunAsyncCallback() {
			
			@Override
			public void onSuccess() {
				// TODO Auto-generated method stub
				/*userl.addClickHandler(new ClickHandler() {
					
					@Override
					public void onClick(ClickEvent event) {

				    RootPanel.get("b").clear();
					RootPanel.get("b").add(new Layout1());	
						myspace.getInstance().koiFunction();
						History.newItem("cc");
						
					}
				});*/
			
				plannerl.addClickHandler(new ClickHandler() {

					@Override
					public void onClick(ClickEvent event) {
						myspace.getInstance().koiFunction();
						History.newItem("dd");
					   /* RootPanel.get("b").clear();
						RootPanel.get("b").add(new Plannerlogin());*/

					}
				});
				planner.addClickHandler(new ClickHandler() {
					
					@Override
					public void onClick(ClickEvent event) {
						/*myspace.getInstance().koiFunction();
						History.newItem("bb");*/
						RootPanel.get("b").clear();
						//RootPanel.get("a").clear();
						RootPanel.get("b").add(new PlannerReg());
						
					};
				});
		         
			}
			
			@Override
			public void onFailure(Throwable reason) {
				// TODO Auto-generated method stub
				
			}
		});
		GWT.runAsync(new RunAsyncCallback() {
			
			@Override
			public void onSuccess() {
				// TODO Auto-generated method stub
                  user.addClickHandler(new ClickHandler() {
					
					@Override
					public void onClick(ClickEvent event) {
						/*myspace.getInstance().koiFunction();
						History.newItem("aa");*/
						RootPanel.get("b").clear();
						//RootPanel.get("a").clear();
						RootPanel.get("b").add(new UserReg());
						
					};
				});
				
			}
			
			@Override
			public void onFailure(Throwable reason) {
				// TODO Auto-generated method stub
				
			}
		});
        
       // RootPanel.get("c").add(footer);
		RootPanel.get("b").add(slider);
	}
	/*@UiField
	MaterialLink Aboutus;*/
	@UiField
	MaterialLink l;
	@UiField
	MaterialLink home;
	@UiField
	MaterialLink r;
	@UiField
	MaterialLink user;
	@UiField
	MaterialLink planner;
	@UiField
	MaterialLink userl;
	@UiField
	MaterialLink plannerl;
	@UiField
	MaterialSlider slider;
	@UiField
	MaterialButton btnCloseDialog;
	 @UiField
	    MaterialDialog dialog;
	@UiField
	MaterialLink btnDialog;
	/*@UiField
	MaterialButton btnCloseDialog1;
	 @UiField
	    MaterialDialog dialog1;
	@UiField
	MaterialLink btnDialog1;*/
	@UiHandler("btnDialog")
    void onDialog(ClickEvent e) {
		RootPanel.get("b").clear();
        dialog.open();
    }
	@UiHandler("btnCloseDialog")
    void onCloseDialog(ClickEvent e){
		RootPanel.get("b").add(slider);
        dialog.close();
    }
	@UiHandler("userl")
    void onClickEvent(ClickEvent e){
		myspace.getInstance().koiFunction();
		History.newItem("cc");
    }
	/*@UiHandler("btnDialog1")
    void onDialog1(ClickEvent e) {
		RootPanel.get("b").clear();
        dialog1.open();
    }
	@UiHandler("btnCloseDialog1")
    void onCloseDialog1(ClickEvent e){
		RootPanel.get("b").add(slider);
        dialog1.close();
    }*/
	
	/*@UiField
	MaterialFooter footer;*/
	/*@UiHandler("Aboutus")
  	void onClick1(ClickEvent e) {
		RootPanel.get("b").clear();	
		RootPanel.get("b").add(new About());
  		//RootPanel.get("a").add(new Layout2());	
  		}*/
	@UiHandler("home")
  	void onClick(ClickEvent e) {
		RootPanel.get("b").clear();	
		RootPanel.get("b").add(slider);
  		//RootPanel.get("a").add(new Layout2());	
  		}
	
	
	

	
}
