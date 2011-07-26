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

import java.util.Set;

/**
 * A data object composed by other data objects.
 */
public class ComposedDataObjectDto extends DataObjectDto {

	private Set<DataObjectDto> childrenDataObjectDtoSet;

  /**
   * Creates a data object containing other data objects.
   * @param dataObjectId the data object identifier
   * @param label the data object's label
   * @param childrenDataObjectDtoSet the set of composing data objects
   */
  public ComposedDataObjectDto(String dataObjectId, String label, Set<DataObjectDto> childrenDataObjectDtoSet) {
    super(dataObjectId, label);
    this.childrenDataObjectDtoSet = childrenDataObjectDtoSet;
  }

  /**
   * Obtain the set of data objects composing the data object.
   * @return the set of composing data objects
   */
  public Set<DataObjectDto> getChildrenDataObjectDtoSet() {
    return this.childrenDataObjectDtoSet;
  }

}