package pt.ist.processpedia.client.service;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.dto.DTOMapper;
import pt.ist.processpedia.client.dto.UserDto;
import pt.ist.processpedia.client.dto.CreateUserInputDto;

public abstract class CreateUserService extends PostService<UserDto> {
  
  private CreateUserInputDto createUserInputDto;

	public CreateUserService(CreateUserInputDto createUserInputDto) {
    super(URL.encode(URLBase.USER_BASE_URL));
		this.createUserInputDto = createUserInputDto;
		setRequestData(DTOMapper.toJSON(createUserInputDto));
  }

	public CreateUserInputDto getCreateUserInputDto() {
		return this.createUserInputDto;
	}

  public void onResponse(String responseBody) {
	  onSuccess(new UserDto(responseBody));
	}
	 
}