import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ani")
public class GetAnimal extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		int legs=Integer.parseInt(req.getParameter("legs"));
		int life=Integer.parseInt(req.getParameter("life"));
		
		PrintWriter pw=resp.getWriter();
		pw.write("<h1>"+name+"</h1>");
		pw.write("<h1>"+legs+"</h1>");
		pw.write("<h1>"+life+"</h1>");
		
	}

}