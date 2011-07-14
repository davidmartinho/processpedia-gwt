package pt.ist.processpedia.client.service;

import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.dto.DataObjectDto;
import pt.ist.processpedia.client.service.http.DeleteService;

public abstract class DeleteDataObjectService extends DeleteService<Boolean> {
  
  private final DataObjectDto dataObjectDto;

	public DeleteDataObjectService(DataObjectDto dataObjectDto) {
    super(URL.encode(URLBase.DATAOBJECT_BASE_URL+dataObjectDto.getId()));
		this.dataObjectDto = dataObjectDto;
  }

  public DataObjectDto getDataObjectDto() {
    return dataObjectDto;
  }
}