package pt.ist.processpedia.client.service;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.dto.RequestDto;

public abstract class DeleteRequestService extends DeleteService<Boolean> {
  
  private RequestDto requestDto;

	public DeleteRequestService(RequestDto requestDto) {
    super(URL.encode(URLBase.REQUEST_BASE_URL+requestDto.getId()));
		this.requestDto = requestDto;
  }

  public void onResponse(String responseBody) {
	  onSuccess(true);
	}
	 
}