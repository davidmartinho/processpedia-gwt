package pt.ist.processpedia.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyCodes;

import com.google.gwt.user.client.Window;

import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiField;  

import com.google.gwt.user.client.ui.HasWidgets;


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