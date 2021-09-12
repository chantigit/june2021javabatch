

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
		//1.Get data from request object which is made by S1 : request.getAttribute("key");
		String fn = (String)request.getAttribute("key1");
		String ln = (String)request.getAttribute("key2");
		//2.Prepare response
		out.println("<h2>Hi Mr :"+fn+" "+ln+", from S2 servlet</h2>");
	}

}
