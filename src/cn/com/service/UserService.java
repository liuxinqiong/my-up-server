package cn.com.service;

import cn.com.dao.UserDaoInf;
import cn.com.entity.User;

public class UserService {
	
	private UserDaoInf userDao;

	public UserDaoInf getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDaoInf userDao) {
		this.userDao = userDao;
	}
	
	public User validateUser(User user){
		return userDao.selectUserByUserNameAndPwd(user);
	}
	
}
