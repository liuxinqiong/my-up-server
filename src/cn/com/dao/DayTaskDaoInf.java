package cn.com.dao;

import java.util.List;

import cn.com.entity.DayTask;

public interface DayTaskDaoInf {
	public int insertDayTask(DayTask dayTask);
	
	public int updateDayTask(DayTask dayTask);
	
	public List<DayTask> selDayTaskByCreateTime(DayTask dayTask);
	
	public int deleteTask(DayTask dayTask);
}
