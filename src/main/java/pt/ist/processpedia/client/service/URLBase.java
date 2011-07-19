package pt.ist.processpedia.client.service;

import pt.ist.processpedia.client.dto.DataObjectDto;

public class URLBase {
	
  public static String BASE_URL = "http://127.0.0.1:8888";

  public static String USER_BASE_URL = BASE_URL+"/user/";
	public static String GOAL_BASE_URL = BASE_URL+"/goal/";
	public static String PROCESS_BASE_URL = BASE_URL+"/process/";
	public static String REQUEST_BASE_URL = BASE_URL+"/request/";
	public static String DATAOBJECT_BASE_URL = BASE_URL+"/dataobject/";

  public static String getDataObjectReadUrl(DataObjectDto dataObjectDto) {
    return DATAOBJECT_BASE_URL+dataObjectDto.getId()+"/read";
  }

}