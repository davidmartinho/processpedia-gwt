package pt.ist.processpedia.client.service;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.dto.DTOMapper;
import pt.ist.processpedia.client.dto.GoalDto;
import pt.ist.processpedia.client.dto.CreateGoalInputDto;

public abstract class CreateGoalService extends PostService<GoalDto> {
  
  private CreateGoalInputDto createGoalInputDto;

	public CreateGoalService(CreateGoalInputDto createGoalInputDto) {
    super(URL.encode(URLBase.GOAL_BASE_URL));
		this.createGoalInputDto = createGoalInputDto;
		setRequestData(DTOMapper.toJSON(createGoalInputDto));
  }

	public CreateGoalInputDto getCreateGoalInputDto() {
		return this.createGoalInputDto;
	}

  public void onResponse(String responseBody) {
	  onSuccess(new GoalDto(responseBody));
	}
	 
}