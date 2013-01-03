package com.fangwei.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fangwei.domain.News;
import com.fangwei.service.VideoNewService;
import com.fangwei.service.impl.VideoNewsServiceBean;

public class ListServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private VideoNewService service = new VideoNewsServiceBean();
		
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<News> videos =service.getLastNews();
		request.setAttribute("videos", videos);
		request.getRequestDispatcher("/WEB-INF/page/videonews.jsp").forward(request, response);
		
	}

}
