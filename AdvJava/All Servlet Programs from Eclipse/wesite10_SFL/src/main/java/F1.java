

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class F1 implements Filter {

    public F1() {
    	System.out.println("F1.F1()");
    }
	public void destroy() {
		System.out.println("F1.destroy()");
	}
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("F1.init()");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("F1.doFilter()");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//Get data from html form
		String name = request.getParameter("personName");
		out.println("<h2 style='color:orange;'>Hi "+name+" before servlet</h2>");
		chain.doFilter(request, response);
		out.println("<h2 style='color:orange;'>Hi "+name+" after servlet</h2>");
	}
}
