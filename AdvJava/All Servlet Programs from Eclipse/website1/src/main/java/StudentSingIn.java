

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chanti.model.Student;
import com.chanti.model.StudentDao;

@WebServlet("/StudentSingIn")
public class StudentSingIn extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.Get data from html form
		String uid=request.getParameter("n1");
		String pwd=request.getParameter("n2");
		//2.Set data to Bean class
		Student student=new Student();
		student.setUserId(uid);
		student.setPassword(pwd);
		//3.Call dao methods & generate response
		if(StudentDao.loginStudent(student.getUserId(), student.getPassword()))
		{
			//1.Create session object 
			HttpSession   session=request.getSession();
			//2.Set data to session object
			session.setAttribute("userid",student.getUserId());
			//3.Redirect to success page
			response.sendRedirect("StudentSignInSuccess");
		}
		else
		{
			//1.Redirect to error page
			response.sendRedirect("StudentSignInError");
		}
		
	}
}
