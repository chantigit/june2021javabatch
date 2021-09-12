

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
		String fn = request.getParameter("firstName");
		String ln = request.getParameter("lastName");
		//2.Set data to request object  : request.setAttribute("key",value);
		request.setAttribute("key1",fn);
		request.setAttribute("key2",ln);
		//3.Prepare response
		out.println("<h2>Hi Mr :"+fn+" "+ln+", from S1 servlet</h2>");
		//4.Dispatch / Make request to S2 servlet 
		RequestDispatcher rd=request.getRequestDispatcher("S2");
		//5.call include(-,-) or forward(-,-) method
		//rd.include(request,response);
		rd.forward(request,response);
	}

}
