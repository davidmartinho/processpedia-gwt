package pt.ist.processpedia.client.dto;

import pt.ist.processpedia.client.dto.AtomicDataObjectDto.Type;

/**
 * A data container with the necessary input data to create a new atomic data object.
 */
public class CreateAtomicDataObjectInputDto extends CreateComposedDataObjectInputDto implements Dto {

  private Type type;
  private String externalizedValue;

  /**
   * Creates a DTO representing the creation of a new data object.
   * @param type the type of the data object to be created
   * @param label the label of the data object to be created
   * @param externalizedValue the externalizedValue of the data object to be created
   */
	public CreateAtomicDataObjectInputDto(Type type, String label, String externalizedValue) {
    super(label);
    this.type = type;
    this.externalizedValue = externalizedValue;
	}

  /**
   * Obtain the type of the data object to be created.
   * @return the data object's type
   */
  public Type getType() {
    return type;
  }

  /**
   * Obtain the externalizedValue to initialize the data object.
   * @return the data object's externalized value
   */
  public String getExternalizedValue() {
    return externalizedValue;
  }

}