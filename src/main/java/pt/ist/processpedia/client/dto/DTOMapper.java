package pt.ist.processpedia.client.dto;

import com.google.gwt.json.client.*;
import pt.ist.processpedia.client.json.Urn;

public class DTOMapper {

  private static final String ID_KEY = "id";

  public enum Type { USER, PROCESS , GOAL, UNKNOWN }

  private enum UserJsonMap { id, name }
  private enum GoalJsonMap { id, title, description }
  private enum ProcessJsonMap { id, title, description }

	public static String toJSON(CreateUserInputDto createUserInputDto) {
		return "{\"name\": \""+createUserInputDto.getName()+
				"\", \"email\": \""+createUserInputDto.getEmail()+
				"\", \"passwordHash\": \""+createUserInputDto.getPasswordHash()+"\" }";
	}
	
	public static String toJSON(CreateGoalInputDto createGoalInputDto) {
		return "{\"title\": \""+createGoalInputDto.getTitle()+
				"\", \"description\": \""+createGoalInputDto.getDescription()+"\" }";
	}
	
	public static String toJSON(CreateRequestInputDto createRequestInputDto) {
		return "{\"title\": \""+createRequestInputDto.getTitle()+
				"\", \"description\": \""+createRequestInputDto.getDescription()+"\" }";
	}
	
	public static String toJSON(CreateComposedDataObjectInputDto createRequestInputDto) {
		return "{\"label\": \""+createRequestInputDto.getLabel()+"\" }";
	}

  /**
   * Creates a DTO from its correspondent JSON formatted string.
   * @param jsonString the JSON string representation of the DTO
   * @return the DTO corresponding to the JSON formatted string
   */
  public static Dto fromJSON(String jsonString) {
    JSONValue jsonValue = parse(jsonString);
    JSONObject jsonObject = jsonValue.isObject();
    if (jsonObject != null) {
      String id = jsonObject.get(ID_KEY).isString().stringValue();
      Urn urn = new Urn(id);
      switch(urn.getType()) {
        case USER: return userFromJson(urn, jsonObject);
        case PROCESS: return processFromJson(urn, jsonObject);
        case GOAL: return goalFromJson(urn, jsonObject);
        default: throw new JSONException();
      }
    } else {
      throw new JSONException();
    }
  }

  private static UserDto userFromJson(Urn urn, JSONObject jsonObject) {
    String name = jsonObject.get(UserJsonMap.name.toString()).isString().stringValue();
    return new UserDto(urn.getId(), name);
  }

  private static ProcessDto processFromJson(Urn urn, JSONObject jsonObject) {
    String title = jsonObject.get(ProcessJsonMap.title.toString()).isString().stringValue();
    String description = jsonObject.get(ProcessJsonMap.description.toString()).isString().stringValue();
    return new ProcessDto(urn.getId(), title, description);
  }

  private static GoalDto goalFromJson(Urn urn, JSONObject jsonObject) {
    String title = jsonObject.get(GoalJsonMap.title.toString()).isString().stringValue();
    String description = jsonObject.get(GoalJsonMap.description.toString()).isString().stringValue();
    return new GoalDto(urn.getId(), title, description);
  }

  /**
   * Parses the received DTO mapped in a JSON string, hiding the parsing strategy.
   * @param jsonString the DTO mapped in a JSON format
   * @return the JSONValue associated to the JSON string
   */
  private static JSONValue parse(String jsonString) {
    return JSONParser.parseStrict(jsonString);
  }

}