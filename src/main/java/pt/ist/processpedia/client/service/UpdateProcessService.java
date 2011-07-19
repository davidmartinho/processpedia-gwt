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

import com.google.gwt.http.client.URL;

import pt.ist.processpedia.client.service.http.PutService;

import pt.ist.processpedia.client.dto.ProcessDto;
import pt.ist.processpedia.client.translator.exception.CannotExternalizeObjectException;

public abstract class UpdateProcessService extends PutService<ProcessDto> {
  
  private final ProcessDto updatedProcessDto;

	public UpdateProcessService(ProcessDto updatedProcessDto) throws CannotExternalizeObjectException {
    super(URL.encode(URLBase.PROCESS_BASE_URL+updatedProcessDto.getId()));
		this.updatedProcessDto = updatedProcessDto;
    setRequestData(getTranslator().externalize(updatedProcessDto));
  }

  public ProcessDto getUpdatedProcessDto() {
    return updatedProcessDto;
  }

}