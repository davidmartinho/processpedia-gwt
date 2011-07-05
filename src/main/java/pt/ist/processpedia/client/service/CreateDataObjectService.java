package pt.ist.processpedia.client.service;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.dto.DTOMapper;
import pt.ist.processpedia.client.dto.DataObjectDto;
import pt.ist.processpedia.client.dto.CreateDataObjectInputDto;

public abstract class CreateDataObjectService extends PostService<DataObjectDto> {
  
  private CreateDataObjectInputDto createDataObjectInputDto;

	public CreateDataObjectService(CreateDataObjectInputDto createDataObjectInputDto) {
    super(URL.encode(URLBase.DATAOBJECT_BASE_URL));
		this.createDataObjectInputDto = createDataObjectInputDto;
		setRequestData(DTOMapper.toJSON(createDataObjectInputDto));
  }

	public CreateDataObjectInputDto getDataObjectInputDto() {
		return this.createDataObjectInputDto;
	}

  public void onResponse(String responseBody) {
	  onSuccess(new DataObjectDto(responseBody));
	}
	 
}