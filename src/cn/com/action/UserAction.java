package cn.com.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.entity.User;
import cn.com.service.UserService;
import cn.com.util.CodeState;
import cn.com.util.JsonUtil;
import cn.com.util.Result;

@Controller
@RequestMapping("/userAction")
public class UserAction {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/login")
	@ResponseBody
	public void login(HttpServletRequest request,HttpServletResponse resp,@RequestBody User user){
		Result rs=new Result();
		User data=userService.validateUser(user);
		if(data!=null){
			HttpSession session = request.getSession();
			// 放入session，登录成功
			session.setAttribute("loginUser", data);
		}
		rs.getData().put("userData", data);
		JsonUtil.output(resp, rs);
	}
	
	@RequestMapping("/noLogin")
	public void noLogin(HttpServletRequest request,HttpServletResponse resp){
		Result rs=new Result();
		rs.setCode(CodeState.noLoginCode);
		rs.setMessage(CodeState.noLoginMessage);
		JsonUtil.output(resp, rs);
	}
}
