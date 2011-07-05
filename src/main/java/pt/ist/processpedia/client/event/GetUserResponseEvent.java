package pt.ist.processpedia.client.event;

import pt.ist.processpedia.client.dto.UserDto;

import com.google.gwt.event.shared.GwtEvent;

public class GetUserResponseEvent extends GwtEvent<GetUserResponseEventHandler> {

	private UserDto userDto;

  private final static Type<GetUserResponseEventHandler> TYPE = new Type<GetUserResponseEventHandler>();
	
	public GetUserResponseEvent(UserDto userDto) {
		this.userDto = userDto;
	}                        
	
	public UserDto getUserDto() {
		return this.userDto;
	}
	
	@Override
	protected void dispatch(GetUserResponseEventHandler getUserResponseEventHandler) {
	  getUserResponseEventHandler.onGetUserResponse(this);
	}
	
	@Override
  public Type<GetUserResponseEventHandler> getAssociatedType() {
    return TYPE;
  }
	
}