import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SaveStudentData {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_001","root","root");
		Statement st=con.createStatement();
		String sql="INSERT INTO student VALUES(101,'RAVI','MALE',99994)";
		st.execute(sql);
		con.close();
		System.out.println("successfully execute");

	}

}
