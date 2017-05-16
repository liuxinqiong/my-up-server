package cn.com.entity;

public class DayGram {
	private Integer dayGramId;
	private User user;
	private String dayGramContent;
	private String createTime;
	private String addredd;
	private String reminderTime;
	public Integer getDayGramId() {
		return dayGramId;
	}
	public void setDayGramId(Integer dayGramId) {
		this.dayGramId = dayGramId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getDayGramContent() {
		return dayGramContent;
	}
	public void setDayGramContent(String dayGramContent) {
		this.dayGramContent = dayGramContent;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getAddredd() {
		return addredd;
	}
	public void setAddredd(String addredd) {
		this.addredd = addredd;
	}
	public String getReminderTime() {
		return reminderTime;
	}
	public void setReminderTime(String reminderTime) {
		this.reminderTime = reminderTime;
	}
	
	
}
