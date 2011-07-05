package pt.ist.processpedia.client.service;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.dto.RequestDto;

public abstract class UpdateRequestService extends PutService<RequestDto> {
  
  private RequestDto requestDto;

	public UpdateRequestService(RequestDto requestDto) {
    super(URL.encode(URLBase.REQUEST_BASE_URL+requestDto.getId()));
		this.requestDto = requestDto;
  }

	public RequestDto getRequestDto() {
		return this.requestDto;
	}

  public void onResponse(String responseBody) {
	  onSuccess(new RequestDto(responseBody));
	}
	 
}