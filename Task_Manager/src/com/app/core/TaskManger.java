package com.app.core;

import java.time.LocalDate;

public class TaskManger {

	private static int taskId = 0;
	private int taskID;
	private String taskName;
	private String desc;
	private LocalDate taskDate;
	private Status status;
	private boolean active;

	public TaskManger(String taskName, String desc, LocalDate taskDate, Status status, boolean active) {
		super();
		this.taskID = ++taskId;
		this.taskName = taskName;
		this.desc = desc;
		this.taskDate = taskDate;
		this.status = status;
		this.active = active;
	}

	public int getTaskID() {
		return taskID;
	}

	public String getTaskName() {
		return taskName;
	}

	public String getDesc() {
		return desc;
	}

	public LocalDate getTaskDate() {
		return taskDate;
	}

	public Status getStatus() {
		return status;
	}

	public boolean isActive() {
		return active;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "TaskManger [taskId=" + taskID + ", taskName=" + taskName + ", desc=" + desc + ", taskDate=" + taskDate
				+ ", status=" + status + ", active=" + active + "]";
	}

}
