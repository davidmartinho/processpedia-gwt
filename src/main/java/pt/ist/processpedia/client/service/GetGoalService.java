package pt.ist.processpedia.client.service;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.dto.GoalDto;

public abstract class GetGoalService extends GetService<GoalDto> {
  
	private final String goalId;

	public GetGoalService(String goalId) {
    super(URL.encode(URLBase.GOAL_BASE_URL+goalId));
		this.goalId = goalId;
  }

	public String getGoalId() {
		return this.goalId;
	}

  public void onResponse(String responseBody) {
	  onSuccess(new GoalDto(responseBody));
	}
	 
}