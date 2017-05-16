package cn.com.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.entity.DayTask;
import cn.com.service.DayTaskService;
import cn.com.util.JsonUtil;
import cn.com.util.Result;

@Controller
@RequestMapping("/dayTaskAction")
public class DayTaskAction {
	
	@Resource
	private DayTaskService dayTaskService;
	
	@RequestMapping(value="/dayTask",method=RequestMethod.POST)
	@ResponseBody
	public void addTask(HttpServletRequest request,HttpServletResponse resp,@RequestBody DayTask dayTask){
		Result rs=new Result();
//		int result=dayTaskService.addDayTask(dayTask);
//		if(result>0){
//			rs.setMessage("新增成功");
//		}else{
//			rs.setCode(1);
//			rs.setMessage("新增失败");
//		}
		JsonUtil.output(resp, rs);
	}
	
	@RequestMapping(value="/dayTask",method=RequestMethod.PUT)
	@ResponseBody
	public void updateTask(HttpServletRequest request,HttpServletResponse resp,@RequestBody DayTask dayTask){
		Result rs=new Result();
		int result=dayTaskService.updateDayTask(dayTask);
		if(result>0){
			rs.setMessage("更新成功");
		}else{
			rs.setCode(1);
			rs.setMessage("更新失败");
		}
		JsonUtil.output(resp, rs);
	}
	
	@RequestMapping(value="/dayTask/{createTime}",method=RequestMethod.GET)
	@ResponseBody
	public void getTask(HttpServletRequest request,HttpServletResponse resp,@PathVariable String createTime){
		Result rs=new Result();
		DayTask dayTask=new DayTask();
		dayTask.setCreateTime(createTime);
		List<DayTask> dayTasks=dayTaskService.getDayTask(dayTask);
		rs.getData().put("dayTasks", dayTasks);
		JsonUtil.output(resp, rs);
	}
	
	@RequestMapping(value="/dayTask",method=RequestMethod.DELETE)
	@ResponseBody
	public void deleteTask(HttpServletRequest request,HttpServletResponse resp,@RequestBody DayTask dayTask){
		Result rs=new Result();
		int result=dayTaskService.deleteDayTask(dayTask);
		if(result>0){
			rs.setMessage("删除成功");
		}else{
			rs.setCode(1);
			rs.setMessage("删除失败");
		}
		JsonUtil.output(resp, rs);
	}
}
