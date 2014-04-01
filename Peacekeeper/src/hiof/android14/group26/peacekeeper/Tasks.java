package hiof.android14.group26.peacekeeper;

import java.sql.Date;

import android.text.format.Time;

public class Tasks {
	private int taskId, taskCreatorId, taskResponsibleId;
	private String taskDescription, responsibleUserName;
	private Time creationDate, dueDate;
	private String taskPrice;
	
	public Tasks(int taskId, int taskCreatorId, int taskResponsibleId, String taskDescription,
			String responsibleUserName, Time creationDate, Time dueDate,
			String taskPrice) {

		this.taskId = taskId;
		this.taskCreatorId = taskCreatorId;
		this.taskResponsibleId = taskResponsibleId;
		this.taskDescription = taskDescription;
		this.responsibleUserName = responsibleUserName;
		this.creationDate = creationDate;
		this.dueDate = dueDate;
		this.taskPrice = taskPrice;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public int getTaskCreatorId() {
		return taskCreatorId;
	}

	public void setTaskCreatorId(int taskCreatorId) {
		this.taskCreatorId = taskCreatorId;
	}

	public int getTaskResponsibleId() {
		return taskResponsibleId;
	}

	public void setTaskResponsibleId(int taskResponsibleId) {
		this.taskResponsibleId = taskResponsibleId;
	}



	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getResponsibleUserName() {
		return responsibleUserName;
	}

	public void setResponsibleUserName(String responsibleUserName) {
		this.responsibleUserName = responsibleUserName;
	}

	public Time getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Time creationDate) {
		this.creationDate = creationDate;
	}

	public Time getDueDate() {
		return dueDate;
	}

	public void setDueDate(Time dueDate) {
		this.dueDate = dueDate;
	}

	public String getTaskPrice() {
		return taskPrice;
	}

	public void setTaskPrice(String taskPrice) {
		this.taskPrice = taskPrice;
	}
	
	
}
