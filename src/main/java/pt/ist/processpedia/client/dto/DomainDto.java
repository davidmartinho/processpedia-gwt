package pt.ist.processpedia.client.dto;

public abstract class DomainDto implements Dto {
	
	private final String id;
	
	public DomainDto(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
}