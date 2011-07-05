package pt.ist.processpedia.client.dto;

public class CreateDataObjectInputDto implements Dto {
	
	private String label;
		
	public CreateDataObjectInputDto(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return this.label;
	}                  

}