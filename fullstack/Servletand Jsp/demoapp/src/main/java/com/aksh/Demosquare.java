package com.aksh;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sq")
public class Demosquare extends HttpServlet {
	 public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException
	  {
		 
//		 int k =(int)req.getAttribute("k");
//		 PrintWriter  out = res.getWriter();
//		 out.println(" result is : "+k);
//		 int k =Integer.parseInt(req.getParameter("k"));
		 
		 
//		 HttpSession session = req.getSession();
//		 int k =(int)session.getAttribute("k");
//		 k=k*k;
		 
		 int k=0;

		 Cookie arr[]=req.getCookies();
		 for( Cookie c : arr)
		 {
			 if( c.getName().equals("k"))
				 k=Integer.parseInt( c.getValue());
		 }
		 
		k= k* k;
		 
		 PrintWriter  out = res.getWriter();
		 out.println(" result is : "+k);
		 System.out.println(" cookies ");
	  }
}