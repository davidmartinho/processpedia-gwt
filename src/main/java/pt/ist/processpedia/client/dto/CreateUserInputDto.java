package pt.ist.processpedia.client.dto;

public class CreateUserInputDto implements Dto {
	
	private String name;
	private String email;
	private String passwordHash;
		
	public CreateUserInputDto(String name, String email, String passwordHash) {
		this.name = name;
		this.email = email;
		this.passwordHash = passwordHash;
	}
	
	public String getName() {
		return this.name;
	}                  
	
	public String getEmail() {
		return this.email;
	}                   
	
	public String getPasswordHash() {
		return this.passwordHash;
	}

}