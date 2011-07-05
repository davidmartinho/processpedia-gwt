package pt.ist.processpedia.client.dto;

public class AtomicDataObjectDto extends DataObjectDto {

	private String value;

	public AtomicDataObjectDto(String dataObjectId, TYPE type, String label, String value) {
		super(dataObjectId, type, label);
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

}