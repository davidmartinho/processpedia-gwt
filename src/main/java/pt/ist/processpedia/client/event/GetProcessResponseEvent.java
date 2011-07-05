package pt.ist.processpedia.client.event;

import pt.ist.processpedia.client.dto.ProcessDto;

import com.google.gwt.event.shared.GwtEvent;

public class GetProcessResponseEvent extends GwtEvent<GetProcessResponseEventHandler> {

	private ProcessDto processDto;

  private final static Type<GetProcessResponseEventHandler> TYPE = new Type<GetProcessResponseEventHandler>();
	
	public GetProcessResponseEvent(ProcessDto processDto) {
		this.processDto = processDto;
	}                        
	
	public ProcessDto getProcessDto() {
		return this.processDto;
	}
	
	@Override
	protected void dispatch(GetProcessResponseEventHandler getProcessResponseEventHandler) {
	  getProcessResponseEventHandler.onGetProcessResponse(this);
	}
	
	@Override
  public Type<GetProcessResponseEventHandler> getAssociatedType() {
    return TYPE;
  }
	
}