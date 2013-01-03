package com.fangwei.fiflter;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class EncodingHttpServletRequest extends HttpServletRequestWrapper {
	private HttpServletRequest request;
	public EncodingHttpServletRequest(HttpServletRequest request) {
		super(request);
		this.request = request;
	}
	
	@Override
	public String getParameter(String name) {
		String value = request.getParameter(name);
		if(value!=null){
			try {
				value = new String(value.getBytes("ISO8859-1"),"GBK");
			} catch (UnsupportedEncodingException e) {
			}
		}
		return value;
	}

}
