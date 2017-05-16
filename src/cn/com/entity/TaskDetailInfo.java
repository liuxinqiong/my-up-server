package cn.com.entity;

public class TaskDetailInfo {
	private Integer taskDetailId;
	private TaskProjectInfo taskProjectInfo;
	private User user;
	private String taskDetailContent;
	private String createTime;
	private String remindTime;
	private String address;
	private Integer isFinished;
	public Integer getTaskDetailId() {
		return taskDetailId;
	}
	public void setTaskDetailId(Integer taskDetailId) {
		this.taskDetailId = taskDetailId;
	}
	public TaskProjectInfo getTaskProjectInfo() {
		return taskProjectInfo;
	}
	public void setTaskProjectInfo(TaskProjectInfo taskProjectInfo) {
		this.taskProjectInfo = taskProjectInfo;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getTaskDetailContent() {
		return taskDetailContent;
	}
	public void setTaskDetailContent(String taskDetailContent) {
		this.taskDetailContent = taskDetailContent;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getRemindTime() {
		return remindTime;
	}
	public void setRemindTime(String remindTime) {
		this.remindTime = remindTime;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getIsFinished() {
		return isFinished;
	}
	public void setIsFinished(Integer isFinished) {
		this.isFinished = isFinished;
	}
	
	
}
