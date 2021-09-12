

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/StudentSignUpSuccess")
public class StudentSignUpSuccess extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//Get data from request object which is made by StudentSignUp servlet
		String userId =(String) request.getAttribute("userid");
		out.println("<h2 style='color:blue;'>Hey "+userId+", Your registration is done</h2>");
		out.println("<a href='index.html'>Home</a>|");
		out.println("<a href='studentlogin.html'>signin</a>|");
	}

}
