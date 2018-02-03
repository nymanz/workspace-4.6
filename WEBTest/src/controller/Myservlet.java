package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ServiceImpl.UserServiceImpl;
import entity.User;

/**
 * servlet的生命周期
 * @author Administrator
 *
 */
public class Myservlet extends HttpServlet{
	User u=new User();
	@Override
	public void init() throws ServletException {
		System.out.println("执行无参数的init方法....");
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("执行service方法....");
		//执行service方法
		//获取页面传输过来的数据
		req.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		System.out.println(name);
		u.setName(name);
		
		//获取请求的名:
		String registURL = req.getRequestURI();
		///0622/regist.action
		System.out.println(registURL);
		int begin = registURL.lastIndexOf("/");
		int end = registURL.lastIndexOf(".");
		//进行字符串截取
		String reg = registURL.substring(begin+1, end);
		System.out.println(reg);
		if(reg.equals("regist")){
			System.out.println("进行调用方法");
			UserServiceImpl serviceImpl = new UserServiceImpl();
			serviceImpl.regist(u);
		}	
		
	}
	@Override
	public void destroy() {
		System.out.println("执行销毁方法.....");
	}
}
