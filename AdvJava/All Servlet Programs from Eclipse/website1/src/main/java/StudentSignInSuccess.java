

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chanti.model.Student;
import com.chanti.model.StudentDao;

@WebServlet("/StudentSignInSuccess")
public class StudentSignInSuccess extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.Create session object 
		HttpSession   session=request.getSession();
		//2.Get data from session object
		String uid=(String)session.getAttribute("userid");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2 style='color:blue;'> Hey "+uid+", Your login is done</h2>");
		//Call loadStudentById(uid)
		Student student = StudentDao.loadStudentById(uid);
		//You will get Student object
		out.println("<h3>Here is your details :--</h3>");
		
		out.println("<table border='2px' align='center' bgcolor='yellow' cellspacing='15px' cellpadding='10px'>");
		out.println("<tr><td><label>FullName</label></td><td>"+student.getFullName() +"</td></tr>");
		out.println("<tr><td><label>UserId</label></td><td>"+student.getUserId() +"</td></tr>");
		out.println("<tr><td><label>Password</label></td><td>"+student.getPassword() +"</td></tr>");
		out.println("<tr><td><label>Courses</label></td><td>"+student.getCourses() +"</td></tr>");
		out.println("<tr><td><label>Qualification</label></td><td>"+student.getQulaification() +"</td></tr></table>");
		
		//Link to logout
		out.println("<a href='StudentEdit?userid="+uid+"'>Edit your details</a>|");
		out.println("<a href='StudentSignOut'>logout</a>");
	}

}
