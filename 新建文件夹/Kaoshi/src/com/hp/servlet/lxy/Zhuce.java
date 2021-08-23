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

public class Zhuce extends HttpServlet{
@Override
protected void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	 response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String email=request.getParameter("email");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		User user=new User(email,username,password);
		
		UserDao dao=new UserDaoImpl();
		User u=dao.selectE(email);
		HttpSession session=request.getSession();
		session.setAttribute("user", user);
		
		if(u==null){
			//不存在 注册
			int a=dao.zhuce(email, username, password);
			if(a>0){
				System.out.println("注册成功！");
				int  random=(int)Math.round((Math.random()+1)*1000);
				session.setAttribute("random", random);
			 response.sendRedirect("/Kaoshi/front/user/verify_form.jsp");
			}else{
				System.out.println("注册失败！");
				
			}
		}else{
			System.out.println("用户已经存在");
			response.sendRedirect("/Kaoshi/register_form.jsp");
		}
		
	
}
}
