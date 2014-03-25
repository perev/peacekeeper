package hiof.android14.group26.peacekeeper;

import java.sql.Date;

public class Tasks {
	private int taskId, taskCreatorId, taskResponsibleId;
	private String taskName, taskDescription, responsibleUserName;
	private Date creationDate, dueDate;
	private double taskPrice;
	
	public Tasks(int taskId, int taskCreatorId, int taskResponsibleId,
			String taskName, String taskDescription,
			String responsibleUserName, Date creationDate, Date dueDate,
			double taskPrice) {

		this.taskId = taskId;
		this.taskCreatorId = taskCreatorId;
		this.taskResponsibleId = taskResponsibleId;
		this.taskName = taskName;
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

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
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

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public double getTaskPrice() {
		return taskPrice;
	}

	public void setTaskPrice(double taskPrice) {
		this.taskPrice = taskPrice;
	}
	
	
}
