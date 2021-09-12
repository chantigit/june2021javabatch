

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentSignUpError")
public class StudentSignUpError extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2 style='color:red;'> UserId is already exist & please try with another</h2><br><br>");
		out.println("<a href='index.html'>Home</a>|");
		out.println("<a href='studentreg.html'>Try with another userid</a>|");
		out.println("<a href='studentlogin.html'>signin</a>|");
	}

}
