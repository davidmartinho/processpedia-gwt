package pt.ist.processpedia.client.service;

import java.util.Set;
import java.util.HashSet;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.dto.GoalDto;

public abstract class GetGoalSetService extends GetService<Set<GoalDto>> {

	public GetGoalSetService() {
    super(URL.encode(URLBase.GOAL_BASE_URL));
  }

  public void onResponse(String responseBody) {
		Set<GoalDto> goalSet = new HashSet<GoalDto>();
		goalSet.add(new GoalDto(responseBody));
	  onSuccess(goalSet);
	}

}