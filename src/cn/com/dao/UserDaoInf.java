package cn.com.dao;

import cn.com.entity.User;

public interface UserDaoInf {
	
	public User selectUserByUserNameAndPwd(User user);
}
