import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/emp")
public class ReceveEmp extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String empno=req.getParameter("no");
		System.out.println(empno);
		String name=req.getParameter("name");
		System.out.println(name);
		String sal=req.getParameter("sal");
		System.out.println(sal); 
		

	}

}
