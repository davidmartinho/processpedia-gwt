package pt.ist.processpedia.client.service;

import java.util.Set;
import java.util.HashSet;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.dto.RequestDto;

public abstract class GetRequestSetService extends GetService<Set<RequestDto>> {

	public GetRequestSetService() {
    super(URL.encode(URLBase.REQUEST_BASE_URL));
  }

  public void onResponse(String responseBody) {
		Set<RequestDto> requestSet = new HashSet<RequestDto>();
		requestSet.add(new RequestDto(responseBody));
	  onSuccess(requestSet);
	}

}