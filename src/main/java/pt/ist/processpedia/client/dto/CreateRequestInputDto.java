package pt.ist.processpedia.client.dto;

public class CreateRequestInputDto implements Dto {

	private String title;
	private String description;

	public CreateRequestInputDto(String title, String description) {
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