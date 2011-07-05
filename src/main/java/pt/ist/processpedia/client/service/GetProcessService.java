package pt.ist.processpedia.client.service;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.dto.ProcessDto;

public abstract class GetProcessService extends GetService<ProcessDto> {

  private final String processId;

	public GetProcessService(String processId) {
    super(URL.encode(URLBase.PROCESS_BASE_URL+processId));
		this.processId = processId;
  }

  public String getProcessId() {
		return this.processId;
  }

  public void onResponse(String responseBody) {
	  onSuccess(new ProcessDto(responseBody));
	}
	 
}