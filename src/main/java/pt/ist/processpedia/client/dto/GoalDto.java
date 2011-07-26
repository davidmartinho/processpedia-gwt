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
 * A DTO representing a Goal domain object.
 */
public class GoalDto extends DomainDto {

  private String title;
  private String description;

  /**
   * Creates a DTO representing a Goal domain object.
   * @param goalId the identifier of the goal
   */
  public GoalDto(String goalId, String title, String description) {
    super(goalId);
    this.title = title;
    this.description = description;
  }

  /**
   * Obtain the title associated to the goal.
   * @return the goal's title
   */
  public String getTitle() {
    return title;
  }

  /**
   * Obtain the description of the goal.
   * @return the goal's description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Update the title of the goal.
   * @param newTitle the goal's new title
   */
  public void setTitle(String newTitle) {
    this.title = newTitle;
  }

  /**
   * Update the description of the goal.
   * @param newDescription the goal's new description
   */
  public void setDescription(String newDescription) {
    this.description = newDescription;
  }

}