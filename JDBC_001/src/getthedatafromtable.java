import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class getthedatafromtable {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_001?user=root&password=root");
	        Statement st=con.createStatement();
	        ResultSet r= st.executeQuery("select * from student");
	        while(r.next()) {
	        	int roll=r.getInt(1);
	        	String name =r.getString(2);
	        	String gender =r.getString(3);
	        	long phone=r.getLong(4);
	        	System.out.println(name+" "+roll+" "+gender+" "+phone);
	        	System.out.println("-----------------------------------");
	        }
	        r.close();
	        
	}

}
