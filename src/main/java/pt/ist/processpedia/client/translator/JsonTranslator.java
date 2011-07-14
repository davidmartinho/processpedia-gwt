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

package pt.ist.processpedia.client.translator;

import com.google.gwt.json.client.*;

import pt.ist.processpedia.client.dto.RequestDto;
import pt.ist.processpedia.client.dto.UserDto;
import pt.ist.processpedia.client.exception.RequestAlreadyClaimedException;
import pt.ist.processpedia.client.exception.UserInactiveException;
import pt.ist.processpedia.client.translator.exception.CannotTranslateObjectException;
import pt.ist.processpedia.client.util.ErrorCode;

public class JsonTranslator implements Translator {

  private static final String ID_KEY = "id";
  private static final String ERROR_CODE_KEY = "errorCode";

  public String externalize(Object object) {
    return "";
  }

  public Object parse(String externalizedObject) throws CannotTranslateObjectException {
    JSONValue jsonValue = parseJson(externalizedObject);
    JSONObject jsonObject = jsonValue.isObject();
    if(jsonObject != null) {
      if(jsonObject.containsKey(ID_KEY)) {
        return parseObject(jsonObject);
      } else if(jsonObject.containsKey(ERROR_CODE_KEY)) {
        return parseException(jsonObject);
      } else {
        throw new CannotTranslateObjectException(externalizedObject);
      }
    } else {
      throw new CannotTranslateObjectException(externalizedObject);
    }
  }

  public String getExternalizationContentType() {
    return "application/json";
  }


  private Object parseObject(JSONObject jsonObject) {
    return null;
  }


  public Throwable parseException(JSONObject jsonObject) throws CannotTranslateObjectException {
    String errorCodeString = jsonObject.get(ERROR_CODE_KEY).isString().stringValue();
    ErrorCode errorCode = new ErrorCode(errorCodeString);
    switch(errorCode.getExceptionType()) {
      case REQUEST_ALREADY_CLAIMED: return parseRequestAlreadyClaimedExceptionFromJsonObject(jsonObject);
      default: throw new CannotTranslateObjectException(jsonObject.toString());
    }
  }

  /**
   * Parses the received exception mapped in a JSON string, hiding the parsing strategy.
   * @param jsonString the exception mapped in a JSON format
   * @return the JSONValue associated to the JSON string
   */
  private static JSONValue parseJson(String jsonString) {
    return JSONParser.parseStrict(jsonString);
  }

  private RequestAlreadyClaimedException parseRequestAlreadyClaimedExceptionFromJsonObject(JSONObject jsonObject) {
    RequestDto requestDto = parseRequestDtoFromJsonObject(jsonObject.get("request").isObject());
    return new RequestAlreadyClaimedException(requestDto);
  }

  private UserInactiveException parseUserInactiveExceptionFromJsonObject(JSONObject jsonObject) {
    UserDto userDto = parseUserDtoFromJsonObject(jsonObject.get("user").isObject());
    return new UserInactiveException(userDto);
  }

  private UserDto parseUserDtoFromJsonObject(JSONObject jsonObject) {
    String userId = jsonObject.get("id").isString().stringValue();
    String name = jsonObject.get("name").isString().stringValue();
    return new UserDto(userId, name);
  }


  private RequestDto parseRequestDtoFromJsonObject(JSONObject jsonObject) {
    String requestId = jsonObject.get("id").isString().stringValue();
    String title = jsonObject.get("title").isString().stringValue();
    String description = jsonObject.get("description").isString().stringValue();
    return new RequestDto(requestId, title, description);
  }

}