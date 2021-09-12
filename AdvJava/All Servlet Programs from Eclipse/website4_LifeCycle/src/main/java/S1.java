

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/S1")
public class S1 extends HttpServlet {
	int i;
	public void init(ServletConfig config) throws ServletException {
		i=578952;
		System.out.println("S1.init():"+i);
	}
	public void destroy() {
		System.out.println("S1.destroy()");
	}
	public ServletConfig getServletConfig() {
		System.out.println("S1.getServletConfig()");
		return null;
	}
	public String getServletInfo() {
		System.out.println("S1.getServletInfo()");
		return "Current Servlet Name is:"+this.getClass().getName(); 
	}
	//Hit Counter Program
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		i++;
		System.out.println("S1.service():"+i);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("This site has been visited "+ i +" times");
	}

}
