import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class savedb {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		FileInputStream f= new FileInputStream("db.properties");
		Properties p =new Properties();
		p.load(f);
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_001",p);
        Statement st=con.createStatement();
        String sql="INSERT INTO product VALUES(105,'ydHGK',999.9,'sambit')";
        st.execute(sql);
        con.close();
        System.out.println("done");
        }
}
