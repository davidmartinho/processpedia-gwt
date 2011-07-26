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
 * A generic data object specifying a label and a type.
 */
public abstract class DataObjectDto extends DomainDto {

	private String label;

  /**
   * Creates a data object identified by a dataObjectId and by a label.
   * @param dataObjectId the data object identifier
   * @param label the label associated to the data object
   */
  public DataObjectDto(String dataObjectId, String label) {
    super(dataObjectId);
    this.label = label;
  }

  /**
   * Obtain the label associated to the data object.
   * @return the data object's identifying label
   */
  public String getLabel() {
    return label;
  }

  /**
   * Update the label of the data object.
   * @param newLabel the data object's new label
   */
  public void setLabel(String newLabel) {
    this.label = newLabel;
  }

}