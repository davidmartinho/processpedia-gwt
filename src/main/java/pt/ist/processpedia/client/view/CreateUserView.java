package pt.ist.processpedia.client.view;

import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.IsWidget;

public interface CreateUserView extends IsWidget {

  public HasText getNameContainer();
  public HasText getEmailContainer();
  public HasText getPasswordContainer();
                                        
}