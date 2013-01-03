package com.fangwei.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fangwei.utils.StreamTool;


public class XMLServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			byte[] data = StreamTool.read(request.getInputStream());
			String xml = new String(data, "gbk");
			System.out.println(xml);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
