package pt.ist.processpedia.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;

import com.google.gwt.user.client.ui.RootLayoutPanel;


import pt.ist.processpedia.client.service.GetUserService;
import pt.ist.processpedia.client.dto.UserDto;   
import pt.ist.processpedia.client.view.ProcesspediaViewImpl;
import pt.ist.processpedia.client.view.ProcesspediaView;

                 
public class Processpedia implements EntryPoint {

  public void onModuleLoad() {
    ProcesspediaView processpediaView = new ProcesspediaViewImpl();
		RootLayoutPanel.get().add(processpediaView);
  }

}
