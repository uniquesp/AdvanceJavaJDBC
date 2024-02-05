package com.servlet2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.catalina.connector.Response;

public class LifeCycle implements Servlet {
ServletConfig config;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config=config;
		System.out.println("Creating Object");
		
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Servicing.......");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>This is Http Servlet</h1><br><br>");
		out.println("<h1>Today's Date: "+new Date().toString()+"</h1> ");		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Going to destroy servlet object");
		
	}
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.config;
	}
	
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This servlet is created by sakshi";
	
}
	
}
