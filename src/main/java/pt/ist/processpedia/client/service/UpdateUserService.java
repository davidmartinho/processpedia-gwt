package pt.ist.processpedia.client.service;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.dto.UserDto;

public abstract class UpdateUserService extends PutService<UserDto> {
  
  private String userId;

	public UpdateUserService(String userId) {
    super(URL.encode(URLBase.USER_BASE_URL+userId));
		this.userId = userId;
  }

	public String getUserId() {
		return this.userId;
	}

  public void onResponse(String responseBody) {
	  onSuccess(new UserDto(responseBody));
	}
	 
}