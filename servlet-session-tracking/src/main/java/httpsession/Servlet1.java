package httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession; 
@WebServlet("/hs1")
public class Servlet1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		System.out.println(name);
		HttpSession hs1=req.getSession();
		hs1.setAttribute("n", name);
//		resp.getWriter().write("<a href=hs2>Servlet2</a>");
		PrintWriter pw=resp.getWriter();
		pw.write("<html><body>");
		pw.write("<form action=hs2 method=post>");
		pw.write("<input type=submit>");
		pw.write("</form></body></html>");
	}

}
