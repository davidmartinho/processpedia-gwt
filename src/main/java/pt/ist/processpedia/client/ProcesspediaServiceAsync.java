package pt.ist.processpedia.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ProcesspediaServiceAsync {
  void greetServer(String input, AsyncCallback<String> callback) throws IllegalArgumentException;
}
