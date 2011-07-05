package pt.ist.processpedia.client.service;

import java.util.Set;
import java.util.HashSet;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.dto.ProcessDto;

public abstract class GetProcessSetService extends GetService<Set<ProcessDto>> {

	public GetProcessSetService() {
    super(URL.encode(URLBase.PROCESS_BASE_URL));
  }

  public void onResponse(String responseBody) {
		Set<ProcessDto> processSet = new HashSet<ProcessDto>();
		processSet.add(new ProcessDto(responseBody));
	  onSuccess(processSet);
	}

}