package com.fangwei.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ManageServlet extends HttpServlet {

	/**
	 * 	
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 	Get（）方法
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String title = request.getParameter("title");
		//转码
		title = new  String(title.getBytes("ISO8859-1"),"GBK");
		String timelength = request.getParameter("timelength");
	
		
		System.out.println("视频名称："+title);
		System.out.println("时长："+timelength);
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//
	}

}
