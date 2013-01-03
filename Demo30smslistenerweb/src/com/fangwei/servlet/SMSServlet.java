package com.fangwei.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SMSServlet extends HttpServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String sender = request.getParameter("sender");
		String content = request.getParameter("content");
		String time = request.getParameter("time");
		System.out.println("发送者："+sender);
		System.out.println("发送内容："+content);
		System.out.println("发送者："+ time);
		
	}

}
