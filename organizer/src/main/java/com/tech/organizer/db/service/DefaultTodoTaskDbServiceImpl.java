package com.tech.organizer.db.service;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.tech.organizer.task.domain.Task;

public class DefaultTodoTaskDbServiceImpl implements TodoTaskDbService{

	private NamedParameterJdbcTemplate namedJdbcTemplate;
	
	public Task createTask(Task task) {
		//namedJdbcTemplate
		return null;
	}

}
