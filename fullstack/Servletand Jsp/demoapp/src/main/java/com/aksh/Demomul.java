package com.aksh;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Demomul extends HttpServlet {

	 public void service(HttpServletRequest req , HttpServletResponse res) throws IOException
	  {
		 int  i = Integer.parseInt(req.getParameter("num3"));
		 int  j = Integer.parseInt(req.getParameter("num4"));
		 
		 int sum = i* j;
		 PrintWriter out = res.getWriter();
		 out.println(" "+sum);
		 
	     
	  }
}
