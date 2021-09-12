

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chanti.model.Student;
import com.chanti.model.StudentDao;


@WebServlet("/StudentEdit")
public class StudentEdit extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//1.Get userid from link
		String uid=request.getParameter("userid");
		out.println("<h2 style='color:blue;'> Here you can edit your details</h2>");
		//Call loadStudentById(uid)
		Student student = StudentDao.loadStudentById(uid);
		
		
		out.println("<form action='StudentUpdate' style='border:3px solid red;'>");
		
		out.println("<table border='2px' align='center' bgcolor='yellow' cellspacing='15px' cellpadding='10px'>");
		out.println("<tr><td><label>FullName</label></td><td><input type='text' name='n1' value='"+student.getFullName()+"'></td></tr>");
		out.println("<tr><td><label>UserId</label></td><td><input type='hidden' name='n2' value='"+student.getUserId()+"'></td></tr>");
		out.println("<tr><td><label>Password</label></td><td><input type='text' name='n3' value='"+student.getPassword()+"'></td></tr>");
		out.println("<tr><td><label>Courses</label></td><td><input type='text' name='n4' value='"+student.getCourses()+"'></td></tr>");
		out.println("<tr><td><label>Qualification</label></td><td><input type='text' name='n5' value='"+student.getQulaification()+"'></td></tr>");

		out.println("<tr><input type='submit' value='Update'><tr></table>");
		out.println("</form>");
		
	
		out.println("<a href='StudentSignOut'>logout</a>");
	}

}
