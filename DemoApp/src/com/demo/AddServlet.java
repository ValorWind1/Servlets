package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException , ServletException {
		
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j ;
		
		
		//session management 
//		req.setAttribute("k", k);
		
//		
//		PrintWriter out = res.getWriter();
//		out.println("Result is: "+ k);
		
		
		
//		res.sendRedirect("sq?k="+k);  // URL rewritting 
		
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);           // using Sessions 
		
		
		// Using cookies 
		Cookie cookie = new Cookie("k", k + "");
		res.addCookie(cookie);
				
		res.sendRedirect("sq");
		
		
		
		
		// Request dispatcher and/or redirect
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		
		
	}
	
}
