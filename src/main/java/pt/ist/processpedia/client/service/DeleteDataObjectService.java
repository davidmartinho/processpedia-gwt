package pt.ist.processpedia.client.service;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.dto.DataObjectDto;

public abstract class DeleteDataObjectService extends DeleteService<Boolean> {
  
  private DataObjectDto dataObjectDto;

	public DeleteDataObjectService(DataObjectDto dataObjectDto) {
    super(URL.encode(URLBase.DATAOBJECT_BASE_URL+dataObjectDto.getId()));
		this.dataObjectDto = dataObjectDto;
  }

  public void onResponse(String responseBody) {
	  onSuccess(true);
	}
	 
}