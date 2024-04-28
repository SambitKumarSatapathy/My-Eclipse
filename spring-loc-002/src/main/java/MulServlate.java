import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("sambhu")
public class MulServlate extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double num1=Double.parseDouble(req.getParameter("n1"));
		double num2=Double.parseDouble(req.getParameter("n2"));
		PrintWriter pw=res.getWriter();
		pw.write("<h1>MUL IS : "+(num1*num2)+"</h1>");
	}
}
