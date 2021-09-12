

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class S2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("S2.doGet()");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//Get data from html form
		HttpSession session=request.getSession(); //calls L1.sessionCreated() method
		ServletContext context = getServletContext();//calls L1.contextInitialized() method
		String name1=(String)session.getAttribute("k1");
		String name2=(String)context.getAttribute("k2");
		String name3=(String)request.getAttribute("k3");
		out.println("<h2 style='color:red;'>Hi "+name1+" inside servlet2</h2>");
		
		session.invalidate();//calls L1.sessionDestroyed()
	
	}

}
