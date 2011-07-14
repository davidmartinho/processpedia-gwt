package pt.ist.processpedia.client.service;

import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.dto.RequestDto;
import pt.ist.processpedia.client.service.http.GetService;

public abstract class GetRequestService extends GetService<RequestDto> {

  private final String requestId;

	public GetRequestService(String requestId) {
    super(URL.encode(URLBase.REQUEST_BASE_URL+requestId));
		this.requestId = requestId;
  }

  public String getRequestId() {
		return this.requestId;
  }

}