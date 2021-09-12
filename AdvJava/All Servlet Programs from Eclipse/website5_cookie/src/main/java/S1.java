

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/S1")
public class S1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//1.Get data from html form
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		//2.Create 2 cookie objects
		Cookie   c1=new   Cookie("userfirstname",firstName);
		Cookie   c2=new   Cookie("userlastname",lastName);
		c1.setMaxAge(3*60);
		//3.Send to browser
		response.addCookie(c1);
		response.addCookie(c2);
		//4.Redirect to S2
		response.sendRedirect("S2");

	}

}
