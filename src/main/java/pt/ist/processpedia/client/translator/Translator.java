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

package pt.ist.processpedia.client.translator;

import pt.ist.processpedia.client.translator.exception.CannotTranslateObjectException;
import pt.ist.processpedia.client.translator.exception.CannotExternalizeObjectException;

public interface Translator {

  public interface Type { }

  public enum DtoType implements Type { USER, GOAL, PROCESS, REQUEST, UNKNOWN }

  public enum ExceptionType implements Type { USER_NOT_FOUND, USER_INACTIVE, REQUEST_ALREADY_CLAIMED, UNKNOWN }

  public String externalize(Object object) throws CannotExternalizeObjectException;

  public Object parse(String externalizedObject) throws CannotTranslateObjectException;

  public String getExternalizationContentType();

}
