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

import pt.ist.processpedia.client.dto.ComposedDataObjectDto;
import pt.ist.processpedia.client.dto.CreateComposedDataObjectInputDto;
import pt.ist.processpedia.client.service.http.PostService;
import pt.ist.processpedia.client.translator.Translator;
import pt.ist.processpedia.client.translator.exception.CannotExternalizeObjectException;

public abstract class CreateComposedDataObjectService extends PostService<ComposedDataObjectDto> {

  private CreateComposedDataObjectInputDto createComposedDataObjectInputDto;

  public CreateComposedDataObjectService(CreateComposedDataObjectInputDto createComposedDataObjectInputDto) throws CannotExternalizeObjectException {
    super(URL.encode(URLBase.DATAOBJECT_BASE_URL));
		this.createComposedDataObjectInputDto = createComposedDataObjectInputDto;
    setRequestData(getTranslator().externalize(createComposedDataObjectInputDto));
  }

  public CreateComposedDataObjectService(CreateComposedDataObjectInputDto createComposedDataObjectInputDto, Translator translator) throws CannotExternalizeObjectException {
    super(URL.encode(URLBase.DATAOBJECT_BASE_URL), translator);
		this.createComposedDataObjectInputDto = createComposedDataObjectInputDto;
		setRequestData(getTranslator().externalize(createComposedDataObjectInputDto));
  }

	public CreateComposedDataObjectInputDto getComposedDataObjectInputDto() {
		return this.createComposedDataObjectInputDto;
	}

}