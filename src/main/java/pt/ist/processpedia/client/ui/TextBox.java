package pt.ist.processpedia.client.ui;

import com.google.gwt.dom.client.Element;

public class TextBox extends com.google.gwt.user.client.ui.TextBox {
	
	public void setPlaceholder(String placeholder) {
		this.getElement().setAttribute("placeholder", placeholder);		
	}
	
}
