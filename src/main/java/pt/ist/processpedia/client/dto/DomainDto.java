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
 * A domain dto containing an identifier.
 */
public abstract class DomainDto implements Dto {

	private final String id;

  /**
   * Creates a new DTO representing a domain object.
   * @param id the identifier of the domain object
   */
  public DomainDto(String id) {
    this.id = id;
  }

  /**
   * Obtain the identified associated to the domain object.
   * @return the domain object's identifier
   */
  public String getId() {
    return this.id;
  }

}