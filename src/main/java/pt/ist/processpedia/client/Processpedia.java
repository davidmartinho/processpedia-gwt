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

package pt.ist.processpedia.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;

import com.google.gwt.user.client.ui.RootPanel;
import pt.ist.processpedia.client.dto.UserDto;
import pt.ist.processpedia.client.event.LoginActionEvent;
import pt.ist.processpedia.client.event.LoginActionEventHandler;
import pt.ist.processpedia.client.view.ApplicationView;
import pt.ist.processpedia.client.view.ApplicationViewImpl;
import pt.ist.processpedia.client.view.LoginViewImpl;
import pt.ist.processpedia.client.view.ProcesspediaView;

/**
 * The module entry-point class for the Processpedia GWT client.
 */
public class Processpedia implements EntryPoint, LoginActionEventHandler {

  private UserDto userDto = null;

  public void onModuleLoad() {
    EventBus eventBus = new SimpleEventBus();
    eventBus.addHandler(LoginActionEvent.TYPE, this);
    ApplicationView view;
    if(userDto==null) {
      view = new ApplicationViewImpl();
    } else {
      view = new ApplicationViewImpl();
    }
    view.setEventBus(eventBus);
    loadView(view);
  }

  public void onLoginAction(LoginActionEvent loginActionEvent) {
    userDto = new UserDto("1", loginActionEvent.getUsername());
    ApplicationView applicationView = new ApplicationViewImpl();
    loadView(applicationView);
  }

  private void loadView(ApplicationView view) {
    RootPanel.get().add(view);
  }

}