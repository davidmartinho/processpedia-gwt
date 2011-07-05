package pt.ist.processpedia.client.service;
         
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.URL;

public abstract class Service<T> extends RequestBuilder {
		
	public Service(Method httpMethod, String url) {
		super(httpMethod, url);
		setHeader("Content-Type", "application/json");
	}
	
	public abstract void onSuccess(T result);
	
	protected abstract void onResponse(String responseBody);
	
	public abstract void onFailure(Throwable caught);
	
	public void execute() {
		try {
      sendRequest(this.getRequestData(), new RequestCallback() {
		    public void onError(Request request, Throwable exception) {
		      onFailure(exception);
		    }
        public void onResponseReceived(Request request, Response response) {
		      onResponse(response.getText());
        }
		  });
		} catch(RequestException e) {
		  onFailure(e);
		}
	}
	
}