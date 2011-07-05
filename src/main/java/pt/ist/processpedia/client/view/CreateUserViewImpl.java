package pt.ist.processpedia.client.view;
             
import pt.ist.processpedia.client.util.Crypto;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

import com.google.gwt.user.client.ui.HasText;

import com.google.gwt.user.client.Window;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiField;

public class CreateUserViewImpl extends Composite implements CreateUserView {

  public interface CreateUserViewImplUiBinder extends UiBinder<Widget, CreateUserViewImpl> {}
  private static CreateUserViewImplUiBinder uiBinder = GWT.create(CreateUserViewImplUiBinder.class);

  @UiField
  HasText nameContainer;

  @UiField
  HasText emailContainer;

  @UiField
  HasText passwordContainer;

  public CreateUserViewImpl() {
    initWidget(uiBinder.createAndBindUi(this));
  }

  @UiHandler("createUserAction")
	void handleCreateUseAction(ClickEvent e) {
    Window.alert(nameContainer.getText());
	}
	
	@UiHandler("cancelAction")
	void handleCancelAction(ClickEvent e) {
    Window.alert(Crypto.md5(passwordContainer.getText()));
	}
	
	@Override
	public HasText getNameContainer() {
		return this.nameContainer;
	}
	
	@Override
	public HasText getEmailContainer() {
		return this.emailContainer;
	}
	
	@Override
	public HasText getPasswordContainer() {
		return this.passwordContainer;
	}

}