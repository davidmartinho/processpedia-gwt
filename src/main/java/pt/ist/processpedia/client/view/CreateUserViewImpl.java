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

import com.google.gwt.event.shared.EventBus;
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

  private EventBus eventBus;

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

  public HasText getNameContainer() {
    return nameContainer;
  }

  public HasText getEmailContainer() {
    return emailContainer;
  }

  public HasText getPasswordContainer() {
    return passwordContainer;
  }

  public void setEventBus(EventBus eventBus) {
    this.eventBus = eventBus;
  }

}