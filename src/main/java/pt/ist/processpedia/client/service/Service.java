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

package pt.ist.processpedia.client.service;

public interface Service<T> {

  /**
   * This method is called whenever the service executes successfully.
   * @param result the service execution's result
   */
  public void onSuccess(T result);

  /**
   * This method is called whenever an exception occurs during the service
   * execution.
   * @param caught the exception caught during the service's execution
   */
  public void onFailure(Throwable caught);

  /**
   * Executes the service, calling the onSuccess method when the execution runs
   * successfully, or the onFailure method if an exception occurs.
   */
  public void execute();
	
}