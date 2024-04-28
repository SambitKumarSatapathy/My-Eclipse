package com.servletjdbc;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AnimalCrud {

	public static boolean saveAnimal(String name,int legs,int life) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet-001?user=root&password=root");
			PreparedStatement ps=con.prepareStatement("INSERT INTO animal VALUES(?,?,?)");
			ps.setString(1, name);
			ps.setInt(2, legs);
			ps.setInt(3, life);
			ps.execute();
			con.close();
			return true;
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	
		
	}
public static ResultSet getanimal() throws ClassNotFoundException {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet-001?user=root&password=root");
		Statement st =con.createStatement();
		String sql="select * from animal";
		return st.executeQuery(sql);
	}catch (Exception e) {
		
		e.printStackTrace();}
	return null;
	
}
	
	
}