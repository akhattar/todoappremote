package com.tech.organizer.task.domain;

public class Task {

	private String taskName;
	private TaskPriority priority;
	private String status;
	private Long userid;
	
	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public TaskPriority getPriority() {
		return priority;
	}

	public void setPriority(TaskPriority priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Task [taskName=" + taskName + ", priority=" + priority + "]";
	}
}
