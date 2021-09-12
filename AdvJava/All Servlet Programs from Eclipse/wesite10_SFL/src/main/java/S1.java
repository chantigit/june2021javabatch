

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class S1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("S1.doGet()");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//Get data from html form
		String name = request.getParameter("personName");
		out.println("<h2 style='color:red;'>Hi "+name+" inside servlet1</h2>");
		
		//To enable/use listeners 3 actions we are doing
		//1.creating session
		HttpSession session=request.getSession();
		session.setAttribute("k1",name);
		//2.creating context
		ServletContext context = getServletContext();
		context.setAttribute("k2",name);
		//3.request to S2
		RequestDispatcher rd = request.getRequestDispatcher("S2");
		request.setAttribute("k3", name);
		rd.include(request, response);
	}

}
