package servletconfig;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Myservlet  extends HttpServlet{
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
		
		PrintWriter out = res.getWriter();
		out.println(" hello world");
		
		ServletContext ctx = getServletContext();
		
		String str =ctx.getInitParameter("name");
		out.println(""+str);
		
		
		
		
		
}

}
