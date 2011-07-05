package pt.ist.processpedia.client.service;

import com.google.gwt.http.client.RequestBuilder;

import pt.ist.processpedia.client.dto.Dto;

public abstract class DeleteService<T> extends Service<T> {

	public DeleteService(String url) {
    super(RequestBuilder.DELETE, url);
  }
	 
}