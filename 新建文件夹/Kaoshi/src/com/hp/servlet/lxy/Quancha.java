package com.hp.servlet.lxy;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hp.dao.lxy.BookDao;
import com.hp.dao.lxy.BookDaoImpl;
import com.hp.entity.lxy.Book;

public class Quancha extends HttpServlet{
@Override
protected void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	//设置响应类型和编码格式
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			request.setCharacterEncoding("UTF-8");
			
		BookDao	dao= new BookDaoImpl();
		ArrayList<Book> books=dao.selectAll();
		for (Book book : books) {
			System.out.println(book.getBook_name());
		}
		//获取session对象
		HttpSession session=request.getSession();
		session.setAttribute("books", books);
		//请求转发
		request.getRequestDispatcher("/front/main/main.jsp").forward(request, response);;
	
	
}
}
