package com.vignesh.servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sqservlet extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		int k=(int) req.getAttribute("k");
		k=k*k;
		
		PrintWriter pr= res.getWriter();
		pr.println("Square value = "+k);
	}
	
}
