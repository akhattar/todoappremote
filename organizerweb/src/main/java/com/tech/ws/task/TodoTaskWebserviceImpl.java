package com.tech.ws.task;

import javax.jws.WebService;

import com.tech.organizer.task.domain.TaskPriority;

@WebService(endpointInterface = "com.tech.ws.task.TodoTaskWebservice")
public class TodoTaskWebserviceImpl implements TodoTaskWebservice{

	@Override
	public String testInfra() {
		// TODO Auto-generated method stub
		return "Hello";
	}

	@Override
	public String createNewTask(String task, String priority) {
		// TODO Auto-generated method stub
		return null;
	}

}
