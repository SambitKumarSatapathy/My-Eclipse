import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PhoneBookCRUD {

	public static boolean saveContact(String name , Long contact , String city) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver") ;
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_001?user=root&password=root");
			PreparedStatement ps = con.prepareStatement("INSERT INTO phonebook( name , contact , city) VALUES( ? , ? , ? )") ;
			ps.setString(1, name) ;
			ps.setLong(2, contact);
			ps.setString(3, city) ;
			ps.execute() ;
			con.close() ;
			return true ;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false ;
	}
	
	public static int deleteContact(int slno) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver") ;
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_001?user=root&password=root");
			Statement st = con.createStatement() ;
			String sql = "DELETE FROM phonebook WHERE slno = "+slno ;
			int res =st.executeUpdate(sql) ;
			con.close() ;
			return res ;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0 ;
	}
}