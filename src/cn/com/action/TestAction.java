package cn.com.action;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.entity.Test;
import cn.com.service.TestService;
import cn.com.util.JsonUtil;
import cn.com.util.Result;

@Controller
@RequestMapping("/testAction")
public class TestAction {

	@Resource
	private TestService testService;
	
	@RequestMapping(value="/data",method=RequestMethod.GET)
	public void getAllTestData(HttpServletRequest request,HttpServletResponse resp) throws IOException{
		Result rs=new Result();
		List<Test> data=testService.getAllTestData();
		rs.getData().put("testData", data);
		JsonUtil.output(resp, rs);
	}
	
	@RequestMapping(value="/data",method=RequestMethod.POST)
	@ResponseBody
	public void insertTestData(HttpServletRequest request,HttpServletResponse resp,@RequestBody Test test) throws IOException{
		Result rs=new Result();
		rs.getData().put("testData", test);
		JsonUtil.output(resp, rs);
	}
}
