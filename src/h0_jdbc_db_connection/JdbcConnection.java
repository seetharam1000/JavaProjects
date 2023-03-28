package h0_jdbc_db_connection;

import java.sql.*;

public class JdbcConnection {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/world";
		String username = "root";
		String password = "root";
		String query = "select *from city";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			int id = rs.getInt("ID");
			String name = rs.getString("Name");
			String code =rs.getString("CountryCode");
			String dist = rs.getString("District");
			int pop = rs.getInt("Population");
			
			System.out.println(id + " - "+name+" - "+code+" - "+dist+" - "+pop);
		}
		st.close();
		con.close();
		
	}
}
