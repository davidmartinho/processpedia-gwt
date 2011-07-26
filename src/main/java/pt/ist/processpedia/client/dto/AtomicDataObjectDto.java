/**
 * Copyright 2011 ESW Software Engineering Group
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 **/

package pt.ist.processpedia.client.dto;

/**
 * A single-value container for an atomic data object.
 */
public class AtomicDataObjectDto extends DataObjectDto {

  public enum Type { STRING, INTEGER, DATE }

  private Type type;
  private String externalizedValue;

  /**
   * Creates an atomic data object.
   * @param dataObjectId the data object identifier
   * @param type the data object's type
   * @param label the data object's label
   * @param externalizedValue the data object's externalized value
   */
  public AtomicDataObjectDto(String dataObjectId, Type type, String label, String externalizedValue) {
    super(dataObjectId, label);
    this.type = type;
    this.externalizedValue = externalizedValue;
  }

  /**
   * Obtain the type associated to the atomic data object.
   * @return the data object's type
   */
  public Type getType() {
    return this.type;
  }

  /**
   * Obtain the externalized value of the atomic data object.
   * @return the data object's externalized value
   */
  public String getExternalizedValue() {
    return this.externalizedValue;
  }

  /**
   * Changes the type associated to the data object.
   * @param newType the data object's new type
   */
  public void setType(Type newType) {
    this.type = newType;
  }

  /**
   * Update the value associated to the atomic data object.
   * @param newExternalizedValue the data object's new externalized value
   */
  public void setExternalizedValue(String newExternalizedValue) {
    this.externalizedValue = newExternalizedValue;
  }

}