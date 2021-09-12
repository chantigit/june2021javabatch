

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/S2")
public class S2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//1.Reading all cookies from browser memory
		Cookie[] cookies = request.getCookies();
		//2.Write them on browser
		out.println("<h1>All Cookie are:</h1>");
		for (Cookie cookie : cookies)
		{
			out.println("<h3> Key ="+cookie.getName()+", Value="+cookie.getValue()+" </h3>");
		}
		out.println("<a href='index.html'> home </a>");
	}

}
