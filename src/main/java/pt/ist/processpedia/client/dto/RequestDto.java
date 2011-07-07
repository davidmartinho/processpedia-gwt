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
 * A DTO representing a Request domain object.
 */
public class RequestDto extends DomainDto {

  private String title;
  private String description;

  /**
   * Creates a DTO representing a Process domain object.
   * @param requestId the identifier of the request
   * @param title the request's title
   * @param description the request's description
   */
	public RequestDto(String requestId, String title, String description) {
		super(requestId);
    this.title = title;
    this.description = description;
  }

  /**
   * Obtain the title associated to the request.
   * @return the request's title
   */
  public String getTitle() {
    return title;
  }

  /**
   * Obtain the description of the request.
   * @return the request's description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Update the title of the request.
   * @param newTitle the request's new title
   */
  public void setTitle(String newTitle) {
    this.title = newTitle;
  }

  /**
   * Update the description of the request.
   * @param newDescription the request's new description
   */
  public void setDescription(String newDescription) {
    this.description = newDescription;
  }

}