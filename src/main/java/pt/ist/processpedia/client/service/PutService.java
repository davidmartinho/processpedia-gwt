package pt.ist.processpedia.client.service;

import com.google.gwt.http.client.RequestBuilder;

import pt.ist.processpedia.client.dto.Dto;

public abstract class PutService<T> extends Service<T> {

	public PutService(String url) {
    super(RequestBuilder.PUT, url);
  }
	 
}