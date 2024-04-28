package com.servletjdbc;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/display")
public class GetTheData extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=resp.getWriter();
		ResultSet rs =Animalc1.getanimal();
		try {
			pw.write("<html><body><table border=2px");
			pw.write("<tr><th><NAME></th><th>LEGS</th><th>LIFE</th></tr>");
			while(rs.next()) {
				pw.write("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getInt(2)+"</td><td>"+rs.getInt(3)+"</td></tr>");
			}
			pw.write("</table></body></html>");
		
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
