

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet2")
public class MyServlet2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1 style='color:red;'>Welcome to Servlet2</h1>");
		/*
		out.println("<a href='MyServlet1'> 	Goto S1 		</a>  |");
		out.println("<a href='MyServlet3'> 	Goto S3 		</a>");
		*/
		response.sendRedirect("MyServlet3");
	}

}
