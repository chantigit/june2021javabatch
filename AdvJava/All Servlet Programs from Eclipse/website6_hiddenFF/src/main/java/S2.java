

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/S2")
public class S2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//Hidden form Field
		/*
		//1.Get data from html form which is prepared inside S1
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");		
		String responseToBrowser="<form action=\"S3\">\r\n"
				+ "	first name : <input type=\"hidden\" name=\"firstName\" value="+firstName+"> <br><br>\r\n"
				+ "	last name : <input type=\"text\" name=\"lastName\" value="+lastName+"> <br> <br>\r\n"
				+ "	<input	type=\"submit\">\r\n"
				+ "</form>";
		out.println(responseToBrowser);
		*/
		//URL Rewriting
		//1.Get data from link
		String firstName = request.getParameter("x");
		String lastName = request.getParameter("y");	
		out.println("<a href='S3?xx="+firstName+"&yy="+lastName+"'>Visit S3</a>");
	}

}
