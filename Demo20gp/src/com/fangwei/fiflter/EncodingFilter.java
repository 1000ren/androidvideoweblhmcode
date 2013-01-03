package com.fangwei.fiflter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;


public class EncodingFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
	throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		if("GET".equals(req.getMethod())){
			EncodingHttpServletRequest wrapper = new EncodingHttpServletRequest(req);
			chain.doFilter(wrapper, response);
		}else{
			req.setCharacterEncoding("GBK");
			chain.doFilter(request, response);
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
