import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/sam")
public class Readperson3Data extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("n");
		System.out.println(name);
		String age=req.getParameter("a");
		System.out.println(age);
		String gender=req.getParameter("g");
		System.out.println(gender); 
		String email=req.getParameter("e");
		System.out.println(email);
		PrintWriter pw=res.getWriter();
		pw.write("<html><body><h1>"+name+"</h1></body></html>");
	}

}
