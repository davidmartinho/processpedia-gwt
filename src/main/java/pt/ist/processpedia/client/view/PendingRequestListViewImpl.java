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
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;

public class PendingRequestListViewImpl extends Composite implements PendingRequestListView {

  public interface PendingRequestListViewImplUiBinder extends UiBinder<Widget, PendingRequestListViewImpl> {}
  private static PendingRequestListViewImplUiBinder uiBinder = GWT.create(PendingRequestListViewImplUiBinder.class);

  @UiField
  HasWidgets pendingRequestsContainer;

  public PendingRequestListViewImpl() {
    initWidget(uiBinder.createAndBindUi(this));
    pendingRequestsContainer.add(new Label("OLA"));
  }

}