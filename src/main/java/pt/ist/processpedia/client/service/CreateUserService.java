package pt.ist.processpedia.client.service;

import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.dto.UserDto;
import pt.ist.processpedia.client.dto.CreateUserInputDto;
import pt.ist.processpedia.client.service.http.PostService;
import pt.ist.processpedia.client.translator.exception.CannotExternalizeObjectException;

public abstract class CreateUserService extends PostService<UserDto> {
  
  private CreateUserInputDto createUserInputDto;

	public CreateUserService(CreateUserInputDto createUserInputDto) throws CannotExternalizeObjectException {
    super(URL.encode(URLBase.USER_BASE_URL));
		this.createUserInputDto = createUserInputDto;
		setRequestData(getTranslator().externalize(createUserInputDto));
  }

	public CreateUserInputDto getCreateUserInputDto() {
		return createUserInputDto;
	}
	 
}