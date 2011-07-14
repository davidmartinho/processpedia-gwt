package pt.ist.processpedia.client.service;

import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.dto.GoalDto;
import pt.ist.processpedia.client.service.http.DeleteService;

public abstract class DeleteGoalService extends DeleteService<Boolean> {
  
  private GoalDto goalDto;

	public DeleteGoalService(GoalDto goalDto) {
    super(URL.encode(URLBase.GOAL_BASE_URL+goalDto.getId()));
		this.goalDto = goalDto;
  }
	 
}