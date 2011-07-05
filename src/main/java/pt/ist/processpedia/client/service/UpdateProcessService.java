package pt.ist.processpedia.client.service;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.dto.ProcessDto;

public abstract class UpdateProcessService extends PutService<ProcessDto> {
  
  private ProcessDto processDto;

	public UpdateProcessService(ProcessDto processDto) {
    super(URL.encode(URLBase.PROCESS_BASE_URL+processDto.getId()));
		this.processDto = processDto;
  }

  public void onResponse(String responseBody) {
	  onSuccess(new ProcessDto(responseBody));
	}
	 
}