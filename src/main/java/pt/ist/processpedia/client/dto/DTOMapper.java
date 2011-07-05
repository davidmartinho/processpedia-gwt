package pt.ist.processpedia.client.dto;

public class DTOMapper {
	
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
	
	public static String toJSON(CreateDataObjectInputDto createRequestInputDto) {
		return "{\"label\": \""+createRequestInputDto.getLabel()+"\" }";
	}

}