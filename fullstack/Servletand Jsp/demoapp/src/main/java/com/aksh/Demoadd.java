package com.aksh;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
//import java.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse ;
import jakarta.servlet.http.HttpSession;
@WebServlet("/add")
public class Demoadd extends HttpServlet {
  public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException
  {
//	  int i = Integer.parseInt(req.getParameter("num1"));
//      int j = Integer.parseInt(req.getParameter("num2"));
//
//      int k = i + j;
//      
//      PrintWriter out= res.getWriter();
//      out.println(" the sum :"+k);

      // Store result in a cookie
//      Cookie cookie = new Cookie("k", String.valueOf(k));
//      res.addCookie(cookie);
// to print the number 
//      PrintWriter out= res.getWriter();
//      out.println(" the sum :"+k);
      
      
      
      
//       Redirect to square servlet
//      res.sendRedirect("sq");
	 
      
      
      
      
//	 k= k*k ;
//	 HttpSession session = req.getSession();
//	 session.setAttribute("k",k);
//
//	 res.sendRedirect("sq");
//	 req.setAttribute("k",k);
	 
//	 RequestDispatcher rd= req.getRequestDispatcher("sq");
//	 rd.forward(req, res);
	 
	 
	

  }
  
}
	 