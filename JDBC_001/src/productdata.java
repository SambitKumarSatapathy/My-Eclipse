
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.Statement;

		public class productdata {

			public static void main(String[] args)throws Exception {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_001","root","root");
				Statement st=con.createStatement();
				//String sql="INSERT INTO product VALUES(101,'ydfgyuw',999.9,'sambit')";
				//String sql2="INSERT INTO product VALUES(102,'ydfgyuw',999.9,'sambit')";
				//String sql3="INSERT INTO product VALUES(103,'ydfgyuw',999.9,'sambit')";
				//String sql="UPDATE product SET price=342.8 WHERE pid = 101";
				String sql="DELETE FROM +product WHERE pid =102 ";
				st.execute(sql);
				//st.execute(sql2);
				//st.execute(sql3);
				con.close();
				System.out.println("successfully execute");

			}

		

	}


