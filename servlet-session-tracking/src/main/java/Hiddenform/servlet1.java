package Hiddenform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/hf1")
public class servlet1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		System.out.println(name);
		PrintWriter pw=resp.getWriter();
		pw.write("<html><body><form>");
		pw.write("<input type=text name=name value='"+name+"' hidden >");
		pw.write("<input type=submit value=serlet2>");
		pw.write("</form></body></html>");
	}

}
