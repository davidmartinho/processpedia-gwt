package pt.ist.processpedia.client.ui;
  
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.HasWidgets;

import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyCodes;

import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.uibinder.client.UiField;  

public class EditableLabel extends Composite {
	
	@UiField
	private final SimplePanel panel;
	
	@UiField
	private final Label label;
	
	@UiField
	private final TextBox textBox;
	
	public @UiConstructor EditableLabel(String text) {
		this.panel = new SimplePanel();
		this.label = new Label(text);
		this.textBox = new TextBox();
		this.panel.add(this.label);
		bindHandlers();
		initWidget(this.panel);
	}
	
	private void bindHandlers() {
		this.label.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent e) {
				edit();
			}
		});
		this.textBox.addKeyDownHandler(new KeyDownHandler() {
			public void onKeyDown(KeyDownEvent e) {
				int pressedKeyCode = e.getNativeKeyCode();
				if(pressedKeyCode==KeyCodes.KEY_ENTER) {
		 			change();
				} else if(pressedKeyCode==KeyCodes.KEY_ESCAPE) {
					cancel();
				}
		  }
		});
		this.textBox.addBlurHandler(new BlurHandler() {
		  public void onBlur(BlurEvent e) {
			  change();
		  }
		});
	}
	
	public void change() {
		this.label.setText(this.textBox.getText());
		this.panel.clear();
		this.panel.add(this.label);
	}
	
	public void cancel() {
		this.panel.clear();
		this.panel.add(this.label);
		this.textBox.setText(this.label.getText());
	} 
	
	public void edit() {
		this.panel.clear();
		this.textBox.setVisibleLength(this.label.getText().length());
		this.textBox.setText(this.label.getText());
		this.panel.add(this.textBox);
		this.textBox.setFocus(true);
	}
	
	public void setText(String text) {
		this.label.setText(text);
		this.textBox.setText(text);
	}
	
}