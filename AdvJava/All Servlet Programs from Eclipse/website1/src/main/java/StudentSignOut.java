

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/StudentSignOut")
public class StudentSignOut extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.Create session object 
		HttpSession   session=request.getSession();
		//2.remove
		session.setAttribute("userid",null);
		//3.expire
		session.invalidate();
		//4.redirect to login
		response.sendRedirect("studentlogin.html");
	}

}
