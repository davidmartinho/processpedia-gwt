/**
 * Copyright 2011 ESW Software Engineering Group
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 **/

package pt.ist.processpedia.client.service.http;

import com.google.gwt.http.client.*;
import pt.ist.processpedia.client.service.Service;

import pt.ist.processpedia.client.translator.JsonTranslator;
import pt.ist.processpedia.client.translator.Translator;


public abstract class HttpService<T> extends RequestBuilder implements Service<T> {

  private Translator translator;

  /**
   * Creates a object representing a HTTP service that uses the translator to externalize and parse data.
   * @param httpMethod the HTTP method used
   * @param url the URL where the HTTP is called
   * @param translator the translator that will handle data parsing and externalization
   */
  public HttpService(Method httpMethod, String url, Translator translator) {
    super(httpMethod, url);
    this.translator = translator;
    setHeader("Content-Type", translator.getExternalizationContentType());
  }

  /**
   * Creates a object representing a HTTP service that uses the JSON to externalize data.
   * @param httpMethod the HTTP method used
   * @param url the URL where the HTTP method is called
   */
  public HttpService(Method httpMethod, String url) {
    this(httpMethod, url, new JsonTranslator());
  }

  /**
   * Executes the HTTP service, dispatching any HTTP exception directly to the
   * onError method, or delegating the response to a more concrete service
   * implementation.
   */
	public void execute() {
		try {
      sendRequest(this.getRequestData(), new RequestCallback() {
		    public void onError(Request request, Throwable exception) {
		      onFailure(exception);
		    }
        public void onResponseReceived(Request request, Response response) {
          onResponse(response);
        }
		  });
		} catch(RequestException e) {
		  onFailure(e);
		}
	}

  /**
   * Obtain the translator that maps the content of the requests made using a
   * HTTP service.
   * @return the translator associated to the HTTP service
   */
  public Translator getTranslator() {
    return translator;
  }

  public abstract void onResponse(Response response);
  
}
