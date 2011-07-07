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

package pt.ist.processpedia.client.json;

import pt.ist.processpedia.client.dto.DTOMapper.Type;

public class Urn {

  private static final Integer DOMAIN_INDEX = 1;
  private static final Integer CLASS_INDEX = 2;
  private static final Integer ID_INDEX = 3;

  private String domainName;
  private String className;
  private String id;

  public Urn(String urnString) {
    String[] tokens = urnString.split(":");
    this.domainName = tokens[DOMAIN_INDEX];
    this.className = tokens[CLASS_INDEX];
    this.id = tokens[ID_INDEX];
  }

  public Boolean isUser() {
    return className.equals("user");
  }

  public Boolean isGoal() {
    return className.equals("goal");
  }

  public Boolean isProcess() {
    return className.equals("process");
  }

  public Boolean isAtomicDataObject() {
    return className.equals("atomicdataobject");
  }

  public Boolean isComposedDataObject() {
    return className.equals("composeddataobject");
  }

  public String getId() {
    return id;
  }

  public String getDomainName() {
    return domainName;
  }

  public String getClassName() {
    return className;
  }

  public Type getType() {
    if(isUser()) {
      return Type.USER;
    } else if(isProcess()) {
      return Type.PROCESS;
    } else {
      return Type.UNKNOWN;
    }
  }

}
