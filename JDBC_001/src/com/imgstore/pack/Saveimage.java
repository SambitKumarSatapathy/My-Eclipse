package com.imgstore.pack;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Saveimage {
	public static void main(String[] args) throws Exception {
		File f=new File("C:\\New folder\\my.jpg");
		FileInputStream fis=new FileInputStream (f);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_001?user=root &password=root");
		PreparedStatement ps=con.prepareStatement ("INSERT INTO image VALUES (?, ?);");
		ps.setInt(1, 101);
		ps.setBlob (2, fis);
		ps.execute();
		con.close();
		System.out.println("image saved");
	}
}