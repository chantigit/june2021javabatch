import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Welcome to Servlet1</h1>");
		/*
		out.println("<a href='MyServlet2'> 	Goto S2 		</a>  |");
		out.println("<a href='MyServlet3'> 	Goto S3 		</a>");
		*/
		//response.sendRedirect("MyServlet2");
		response.sendRedirect("https://www.paytm.com");
	}
}
