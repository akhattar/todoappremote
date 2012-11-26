package com.tech.ws.task;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface TodoTaskWebservice {

	@WebMethod
	public String testInfra();
	
	@WebMethod
	public String createNewTask(String task, String priority);
}
