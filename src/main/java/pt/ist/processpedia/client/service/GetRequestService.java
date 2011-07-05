package pt.ist.processpedia.client.service;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.dto.RequestDto;

public abstract class GetRequestService extends GetService<RequestDto> {

  private final String requestId;

	public GetRequestService(String requestId) {
    super(URL.encode(URLBase.REQUEST_BASE_URL+requestId));
		this.requestId = requestId;
  }

  public String getRequestId() {
		return this.requestId;
  }

  public void onResponse(String responseBody) {
	  onSuccess(new RequestDto(responseBody));
	}
	 
}