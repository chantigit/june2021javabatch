

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/S1")
public class S1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//1.Get data from html form
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		//$$$$$$$$$$$$HIDDEN FORM FIELD $$$$$$$$$$$$$$$$$$$$$$$
		/*
		//2.Create html form with hidden fields + submit button
		String responseToBrowser="<form action=\"S2\">\r\n"
				+ "	first name : <input type=\"hidden\" name=\"firstName\" value="+firstName+"> <br><br>\r\n"
				+ "	last name : <input type=\"text\" name=\"lastName\" value="+lastName+"> <br> <br>\r\n"
				+ "	<input	type=\"submit\">\r\n"
				+ "</form>";
		*/
		//$$$$$$$$$$$$HIDDEN FORM FIELD $$$$$$$$$$$$$$$$$$$$$$$
		//URL Rewriting
		out.println("<a href='S2?x="+firstName+"&y="+lastName+"'>Visit S2</a>");
		
	}

}
