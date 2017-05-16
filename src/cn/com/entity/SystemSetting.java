package cn.com.entity;

public class SystemSetting {
	private Integer systemSettingId;
	private User user;
	private Integer cloudSync;
	private Integer reminderStatus;
	public Integer getSystemSettingId() {
		return systemSettingId;
	}
	public void setSystemSettingId(Integer systemSettingId) {
		this.systemSettingId = systemSettingId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getCloudSync() {
		return cloudSync;
	}
	public void setCloudSync(Integer cloudSync) {
		this.cloudSync = cloudSync;
	}
	public Integer getReminderStatus() {
		return reminderStatus;
	}
	public void setReminderStatus(Integer reminderStatus) {
		this.reminderStatus = reminderStatus;
	}
	
	
}	
