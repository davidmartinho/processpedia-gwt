package pt.ist.processpedia.client.service;

import com.google.gwt.http.client.RequestBuilder;

import pt.ist.processpedia.client.dto.Dto;

public abstract class GetService<T> extends Service<T> {

	public GetService(String url) {
    super(RequestBuilder.GET, url);
  }
	 
}