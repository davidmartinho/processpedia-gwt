package pt.ist.processpedia.client.dto;

import java.util.Set;

public class ComposedDataObjectDto extends DataObjectDto {

	private Set<DataObjectDto> childrenDataObjectDtoSet;

	public ComposedDataObjectDto(String dataObjectId, String label, Set<DataObjectDto> childrenDataObjectDtoSet) {
		super(dataObjectId, TYPE.COMPOSED, label);
		this.childrenDataObjectDtoSet = childrenDataObjectDtoSet;
	}

	public Set<DataObjectDto> getChildrenDataObjectDtoSet() {
		return this.childrenDataObjectDtoSet;
	}

}