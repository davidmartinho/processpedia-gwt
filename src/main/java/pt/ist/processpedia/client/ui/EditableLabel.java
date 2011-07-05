package pt.ist.processpedia.client.ui;
  
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;

import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyCodes;

import com.google.gwt.user.client.Window;

import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiField;  

import com.google.gwt.user.client.ui.HasWidgets;

public class EditableLabel extends SimplePanel {
		
	private final Label label;
	private final TextBox textBox;
	
	public EditableLabel() {
		this("");
	}
	
	public EditableLabel(String label) {
		this.label = new Label(label);
		this.textBox = new TextBox();
		this.add(this.label);
		this.label.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent e) {
				edit();
			}
		});
		this.textBox.addKeyDownHandler(new KeyDownHandler() {
			public void onKeyDown(KeyDownEvent e) {
				if(e.getNativeKeyCode()==KeyCodes.KEY_ENTER) {
		 			change();
				} else if(e.getNativeKeyCode()==KeyCodes.KEY_ESCAPE) {
					cancel();
				}
		  }
		});
		this.textBox.addBlurHandler(new BlurHandler() {
		  public void onBlur(BlurEvent e) {
			  cancel();
		  }
		});  
	}
	
	public void change() {
		this.label.setText(this.textBox.getText());
		this.clear();
		this.add(this.label);
	}
	
	public void cancel() {
		this.clear();
		this.add(this.label);
		this.textBox.setText(this.label.getText());
	} 
	
	public void edit() {
		this.clear();
		this.textBox.setVisibleLength(this.label.getText().length());
		this.add(this.textBox);
		this.textBox.setFocus(true);
	}
	
	public void setText(String text) {
		this.label.setText(text);
		this.textBox.setText(text);
	}
	
}