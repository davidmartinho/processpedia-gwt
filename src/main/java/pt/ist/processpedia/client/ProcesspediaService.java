package pt.ist.processpedia.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("processpedia")
public interface ProcesspediaService extends RemoteService {
  public String greetServer(String name) throws IllegalArgumentException;
}
