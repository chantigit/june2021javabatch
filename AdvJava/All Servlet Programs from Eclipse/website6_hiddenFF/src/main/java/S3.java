

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/S3")
public class S3 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//1.Get data from html form which is prepared inside S2
		String firstName = request.getParameter("xx");
		String lastName = request.getParameter("yy");
		out.println("Your Full Name is:"+lastName+" "+firstName);
	}

}
