package pt.ist.processpedia.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyCodes;

import com.google.gwt.user.client.Window;

import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiField;  

import com.google.gwt.user.client.ui.HasWidgets;

public class ProcessViewImpl extends Composite implements ProcessView {

  public interface ProcessViewImplUiBinder extends UiBinder<Widget, ProcessViewImpl> {}
  private static ProcessViewImplUiBinder uiBinder = GWT.create(ProcessViewImplUiBinder.class);

  public ProcessViewImpl() {
    initWidget(uiBinder.createAndBindUi(this));
  }

}