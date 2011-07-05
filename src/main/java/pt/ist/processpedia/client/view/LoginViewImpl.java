package pt.ist.processpedia.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class LoginViewImpl extends Composite implements LoginView {

  public interface LoginViewImplUiBinder extends UiBinder<Widget, LoginViewImpl> {}
  private static LoginViewImplUiBinder uiBinder = GWT.create(LoginViewImplUiBinder.class);

  public LoginViewImpl() {
    initWidget(uiBinder.createAndBindUi(this));
  }

}