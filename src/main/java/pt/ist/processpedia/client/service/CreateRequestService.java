package pt.ist.processpedia.client.service;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.dto.DTOMapper;
import pt.ist.processpedia.client.dto.RequestDto;
import pt.ist.processpedia.client.dto.CreateRequestInputDto;

public abstract class CreateRequestService extends PostService<RequestDto> {
  
  private CreateRequestInputDto createRequestInputDto;

	public CreateRequestService(CreateRequestInputDto createRequestInputDto) {
    super(URL.encode(URLBase.REQUEST_BASE_URL));
		this.createRequestInputDto = createRequestInputDto;
		setRequestData(DTOMapper.toJSON(createRequestInputDto));
  }

	public CreateRequestInputDto getCreateRequestInputDto() {
		return this.createRequestInputDto;
	}

  public void onResponse(String responseBody) {
	  onSuccess(new RequestDto(responseBody));
	}
	 
}