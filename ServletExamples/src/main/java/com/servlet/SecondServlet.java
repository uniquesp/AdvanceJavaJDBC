package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

@WebServlet("/second")
public class SecondServlet extends HttpServlet{
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("I am in do get method");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>From Do get Method </h1");
		String  name = "sp";
		writer.println(name);
	}
}
