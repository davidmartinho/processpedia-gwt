package pt.ist.processpedia.client.service;

import java.util.Set;
import java.util.HashSet;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.dto.UserDto;

public abstract class GetUserSetService extends GetService<Set<UserDto>> {

	public GetUserSetService() {
    super(URL.encode(URLBase.REQUEST_BASE_URL));
  }

  public void onResponse(String responseBody) {
		Set<UserDto> userSet = new HashSet<UserDto>();
		userSet.add(new UserDto(responseBody));
	  onSuccess(userSet);
	}

}