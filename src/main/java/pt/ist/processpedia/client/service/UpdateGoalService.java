package pt.ist.processpedia.client.service;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.dto.GoalDto;

public abstract class UpdateGoalService extends PutService<GoalDto> {
  
  private GoalDto goalDto;

	public UpdateGoalService(GoalDto goalDto) {
    super(URL.encode(URLBase.GOAL_BASE_URL+goalDto.getId()));
		this.goalDto = goalDto;
  }

  public void onResponse(String responseBody) {
	  onSuccess(new GoalDto(responseBody));
	}
	 
}