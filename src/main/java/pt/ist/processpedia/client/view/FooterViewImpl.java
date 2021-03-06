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
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class FooterViewImpl extends Composite implements FooterView {

  public interface FooterViewImplUiBinder extends UiBinder<Widget, FooterViewImpl> {}
  private static FooterViewImplUiBinder uiBinder = GWT.create(FooterViewImplUiBinder.class);

  private EventBus eventBus;

  public FooterViewImpl() {
    initWidget(uiBinder.createAndBindUi(this));
  }

  public void setEventBus(EventBus eventBus) {
    this.eventBus = eventBus;
  }

}