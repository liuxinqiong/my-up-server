package cn.com.service;

import java.util.List;

import cn.com.dao.DayTaskDaoInf;
import cn.com.entity.DayTask;

public class DayTaskService {
	private DayTaskDaoInf dayTaskDao;

	public DayTaskDaoInf getDayTaskDao() {
		return dayTaskDao;
	}

	public void setDayTaskDao(DayTaskDaoInf dayTaskDao) {
		this.dayTaskDao = dayTaskDao;
	}

	public int addDayTask(DayTask dayTask){
		return dayTaskDao.insertDayTask(dayTask);
	}
	
	public int updateDayTask(DayTask dayTask){
		return dayTaskDao.updateDayTask(dayTask);
	}
	
	public List<DayTask> getDayTask(DayTask dayTask){
		return dayTaskDao.selDayTaskByCreateTime(dayTask);
	}
	
	public int deleteDayTask(DayTask dayTask){
		return dayTaskDao.deleteTask(dayTask);
	}
}
