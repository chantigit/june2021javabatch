

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet3")
public class MyServlet3 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1 style='color:red;'>Welcome to Servlet3</h1>");
		/*
		out.println("<a href='MyServlet2'> 	Goto S2 		</a>  |");
		out.println("<a href='MyServlet1'> 	Goto S1 		</a>");
		*/
	}

}
