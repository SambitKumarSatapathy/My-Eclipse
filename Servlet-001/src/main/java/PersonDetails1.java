import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/fetch1")
public class PersonDetails1 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		System.out.println(name);
		String age=req.getParameter("age");
		System.out.println(age);
		String gender=req.getParameter("gender");
		System.out.println(gender);
		String email=req.getParameter("email");
		System.out.println(email);
		PrintWriter pw=res.getWriter();
		pw.write("<html><body><h1>"+name+"</h1></body></html?>");
		pw.write("<html><body><h1>"+age+"</h1></body></html?>");
		pw.write("<html><body><h1>"+gender+"</h1></body></html?>");
		pw.write("<html><body><h1>"+email+"</h1></body></html?>");
		
	}

}
