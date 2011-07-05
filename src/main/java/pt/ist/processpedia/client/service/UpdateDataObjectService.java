package pt.ist.processpedia.client.service;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.dto.DataObjectDto;

public abstract class UpdateDataObjectService extends PutService<DataObjectDto> {
  
  private DataObjectDto dataObjectDto;

	public UpdateDataObjectService(DataObjectDto dataObjectDto) {
    super(URL.encode(URLBase.DATAOBJECT_BASE_URL+dataObjectDto.getId()));
		this.dataObjectDto = dataObjectDto;
  }

  public void onResponse(String responseBody) {
	  onSuccess(new DataObjectDto(responseBody));
	}
	 
}



