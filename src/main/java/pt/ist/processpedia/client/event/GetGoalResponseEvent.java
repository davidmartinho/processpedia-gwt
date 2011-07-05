package pt.ist.processpedia.client.event;

import pt.ist.processpedia.client.dto.GoalDto;

import com.google.gwt.event.shared.GwtEvent;

public class GetGoalResponseEvent extends GwtEvent<GetGoalResponseEventHandler> {

	private GoalDto goalDto;

  private final static Type<GetGoalResponseEventHandler> TYPE = new Type<GetGoalResponseEventHandler>();
	
	public GetGoalResponseEvent(GoalDto goalDto) {
		this.goalDto = goalDto;
	}                        
	
	public GoalDto getGoalDto() {
		return this.goalDto;
	}
	
	@Override
	protected void dispatch(GetGoalResponseEventHandler getGoalResponseEventHandler) {
	  getGoalResponseEventHandler.onGetGoalResponse(this);
	}
	
	@Override
  public Type<GetGoalResponseEventHandler> getAssociatedType() {
    return TYPE;
  }
	
}