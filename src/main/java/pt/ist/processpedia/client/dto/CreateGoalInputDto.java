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
 * A data container with the necessary input data to create a new goal.
 */
public class CreateGoalInputDto implements Dto {

  private String title;
  private String description;

  /**
   * Creates a new data container with the necessary input data.
   * @param title the goal's title
   * @param description the goal's description
   */
  public CreateGoalInputDto(String title, String description) {
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
   * Obtain the description associated to the goal.
   * @return the goal's description
   */
  public String getDescription() {
    return description;
  }

}