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
	 * 	Get��������
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String title = request.getParameter("title");
		//ת��
		title = new  String(title.getBytes("ISO8859-1"),"GBK");
		String timelength = request.getParameter("timelength");
	
		
		System.out.println("��Ƶ���ƣ�"+title);
		System.out.println("ʱ����"+timelength);
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//
	}

}
