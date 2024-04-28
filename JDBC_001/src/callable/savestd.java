package callable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.CallableStatement;

public class savestd {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_001?user=root&password=root");
		CallableStatement cs=(CallableStatement) con.prepareCall("{call save_std(107,'sssssn')}");
		ResultSet rs=cs.executeQuery();
		cs.execute();
		con.close();
	}

}
