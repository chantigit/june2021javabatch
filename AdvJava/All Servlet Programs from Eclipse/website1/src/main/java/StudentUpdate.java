

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chanti.model.Student;
import com.chanti.model.StudentDao;


@WebServlet("/StudentUpdate")
public class StudentUpdate extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.Get data from html form which is prepared inside StudentEdit servlet
		String fn=request.getParameter("n1");
		String uid=request.getParameter("n2");
		String pwd=request.getParameter("n3");
		String courses=request.getParameter("n4");
		String q=request.getParameter("n5");
		//2.Set data to Bean class
		Student student=new Student();
		student.setFullName(fn);
		student.setUserId(uid);
		student.setPassword(pwd);
		student.setCourses(courses);
		student.setQulaification(q);
		//3.Call Dao update method
		if(StudentDao.updateStudentRecord(student)>0)
		{
			response.sendRedirect("StudentSignInSuccess");
		}
		else
		{
			System.out.println("Error during update");
		}
	}

}
