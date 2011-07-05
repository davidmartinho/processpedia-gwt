package pt.ist.processpedia.client.dto;

public class DataObjectDto extends DomainDto {
	
	public enum TYPE { COMPOSED, STRING }
	
	private TYPE type;
	private String label;
	
	public DataObjectDto(String dataObjectId) {
		super(dataObjectId);
	}
	
	public DataObjectDto(String dataObjectId, TYPE type, String label) {
		super(dataObjectId);
		this.type = type;
		this.label = label;
	}
	
	public TYPE getType() {
		return this.type;
	}
	
	public String getLabel() {
		return this.label;
	}

}