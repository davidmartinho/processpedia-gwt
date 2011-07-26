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
 * A data container with the necessary input data to create a new composed data object.
 */
public class CreateComposedDataObjectInputDto implements Dto {

  private String label;

  /**
   * Creates a DTO representing the creation of a new composed data object.
   * @param label the label of the data object to be created
   */
  public CreateComposedDataObjectInputDto(String label) {
    this.label = label;
  }

  /**
   * Obtain the label of the data object to be created.
   * @return the data object's label
   */
  public String getLabel() {
    return label;
  }

}
