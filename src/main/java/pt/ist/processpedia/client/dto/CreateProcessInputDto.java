package pt.ist.processpedia.client.dto;

public class CreateProcessInputDto implements Dto {
	
	private String title;
	private String description;
		
	public CreateProcessInputDto(String title, String description) {
		this.title = title;
		this.description = description;
	}
	
	public String getTitle() {
		return this.title;
	}                  
	
	public String getDescription() {
		return this.description;
	}

}