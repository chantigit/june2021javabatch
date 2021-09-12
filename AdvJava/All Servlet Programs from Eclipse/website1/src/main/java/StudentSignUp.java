

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chanti.model.Student;
import com.chanti.model.StudentDao;


@WebServlet("/StudentSignUp")
public class StudentSignUp extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.Get data from html form
		String fn=request.getParameter("n1");
		String uid=request.getParameter("n2");
		String pwd=request.getParameter("n3");
		String coursesList[]=request.getParameterValues("n4");
		String courses="";
		for(int i=0;i<coursesList.length;i++){
			courses=courses+","+coursesList[i];
		}
		String q=request.getParameter("n5");
		
		//2.Set data to Bean class
		Student student=new Student();
		student.setFullName(fn);
		student.setUserId(uid);
		student.setPassword(pwd);
		student.setCourses(courses);
		student.setQulaification(q);
		//3.Call dao methods & generate response
		if(StudentDao.isStudentExist(student.getUserId()))
		{
			response.sendRedirect("StudentSignUpError");
		}
		else
		{
			if(StudentDao.saveStudentRecord(student)>0)
			{
				//response.sendRedirect("StudentSignUpSuccess");
				RequestDispatcher rd=request.getRequestDispatcher("StudentSignUpSuccess");
				//set data to request object
				request.setAttribute("userid", student.getUserId());
				rd.forward(request, response);
			}
		}
	}
}
