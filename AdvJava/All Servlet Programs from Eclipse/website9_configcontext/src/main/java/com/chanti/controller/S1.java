package com.chanti.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/S1")
public class S1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletConfig    config=getServletConfig();
		ServletContext   context=getServletContext();
		String personName = config.getInitParameter("pname");
		String driverName = context.getInitParameter("driverClassName");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Your name is:"+personName+"</h1>");
		out.println("<h1>Driver name is:"+driverName+"</h1>");
	}

}
