package com.hp.servlet.lxy;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hp.dao.lxy.UserDao;
import com.hp.dao.lxy.UserDaoImpl;
import com.hp.entity.lxy.User;

public class Denglu extends HttpServlet{
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		 //设置响应类型和编码格式
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		 //获取对象
		String email=request.getParameter("email");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println(username + "-----" + password);
		//调用dao
		UserDao user=new UserDaoImpl();
		 User a=user.selectE(email);
		
		if(a!=null){
			//用户存在
			if(a.getPassword().equals(password)){
				System.out.println("登录成功");
				request.getRequestDispatcher("/Quancha").forward(request, response);
			}else{
				System.out.println("登录失败");
			}
		}else{
			System.out.println("用户不存在");
		}
	}
}
