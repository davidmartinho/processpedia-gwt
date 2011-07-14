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

import com.google.gwt.http.client.Response;
import pt.ist.processpedia.client.translator.Translator;
import pt.ist.processpedia.client.translator.exception.CannotTranslateObjectException;

public abstract class PutService<T> extends HttpService<T> {

	public PutService(String url) {
    super(PUT, url);
  }

  public PutService(String url, Translator translator) {
    super(PUT, url, translator);
  }

  @Override
  public void onResponse(Response response) {
    try {
      Object responseObject = getTranslator().parse(response.getText());
      if(response.getStatusCode()==Response.SC_OK) {
        onSuccess((T)responseObject);
      } else {
        onFailure((Throwable) responseObject);
      }
    } catch(CannotTranslateObjectException e) {
      onFailure(e);
    }
  }
	 
}