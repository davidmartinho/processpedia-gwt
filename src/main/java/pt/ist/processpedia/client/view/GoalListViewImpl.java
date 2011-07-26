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
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiField;

import pt.ist.processpedia.client.ui.TextBox;
import com.google.gwt.user.client.ui.CheckBox;

public class GoalListViewImpl extends Composite implements GoalListView {

  public interface GoalListViewImplUiBinder extends UiBinder<Widget, GoalListViewImpl> {}
  private static GoalListViewImplUiBinder uiBinder = GWT.create(GoalListViewImplUiBinder.class);
       
  @UiField
  HasWidgets goalsContainer;
  

  @UiField
  TextBox newGoalAction;  

  public GoalListViewImpl() {
    initWidget(uiBinder.createAndBindUi(this));
  }

  @UiHandler("newGoalAction")
  public void handleNewGoalAction(KeyDownEvent e) {
    if(e.getNativeKeyCode()==KeyCodes.KEY_ENTER) {
      if(!newGoalAction.getText().equals("")) {
        CheckBox newGoal = new CheckBox(newGoalAction.getText());
        newGoalAction.setText("");
        goalsContainer.add(newGoal);
      }
    }
  }

}