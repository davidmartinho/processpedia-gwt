package pt.ist.processpedia.client.service;

import com.google.gwt.http.client.RequestBuilder;

import pt.ist.processpedia.client.dto.Dto;

public abstract class PostService<T> extends Service<T> {

	public PostService(String url) {
    super(RequestBuilder.POST, url);
  }
	 
}