/**
 * Copyright 2011 ESW Software Engineering Group
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 **/

package pt.ist.processpedia.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.Widget;

import com.google.gwt.uibinder.client.UiField;
import pt.ist.processpedia.client.event.LoginActionEvent;

public class LoginViewImpl extends Composite implements LoginView {

  public interface LoginViewImplUiBinder extends UiBinder<Widget, LoginViewImpl> {}
  private static LoginViewImplUiBinder uiBinder = GWT.create(LoginViewImplUiBinder.class);

  private EventBus eventBus;

  @UiField
  HasValue<String> usernameContainer;

  @UiField
  HasValue<String> passwordContainer;

  public LoginViewImpl() {
    initWidget(uiBinder.createAndBindUi(this));
  }

  @UiHandler("loginAction")
  void handleLoginAction(ClickEvent e) {
    eventBus.fireEvent(new LoginActionEvent(usernameContainer.getValue(), passwordContainer.getValue()));
  }

  public void setEventBus(EventBus eventBus) {
    this.eventBus = eventBus;
  }

}