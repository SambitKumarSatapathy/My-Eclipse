package com.imgstore.pack;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Readimage {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection ("jdbc:mysql://localhost:3306/jdbc_001?user=root&password=root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery ("SELECT * FROM image");
		rs.next();
		int id=rs.getInt(1); 
		Blob b=rs.getBlob(2); 
		byte[]arr=b.getBytes (1,(int)b.length());
		FileOutputStream fos=new FileOutputStream ("C:\\New folder\\ph.jpg"); 
		fos.write(arr); 
		System.out.println("image created");
	}
}