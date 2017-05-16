package cn.com.entity;

public class Category {
	private Integer categoryId;
	private User user;
	private String categoryName;
	private Integer iconId;
	private Integer type;
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Integer getIconId() {
		return iconId;
	}
	public void setIconId(Integer iconId) {
		this.iconId = iconId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
	
}
