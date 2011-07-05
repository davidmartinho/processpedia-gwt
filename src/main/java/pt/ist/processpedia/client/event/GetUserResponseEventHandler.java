package pt.ist.processpedia.client.event;

import com.google.gwt.event.shared.EventHandler;

public interface GetUserResponseEventHandler extends EventHandler {
	
	public void onGetUserResponse(GetUserResponseEvent event);

}