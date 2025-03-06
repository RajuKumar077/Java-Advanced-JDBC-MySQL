package packageDay11;

import java.sql.*;


public class MetaDataQuery {
	public static void main(String[] args) throws ClassNotFoundException {


		Connection con = null; 
		Statement stmt = null;
		ResultSet rs = null;


		try {

			// Load MySQL JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Database connection details
			String url = "jdbc:mysql://localhost:3306/mysql";
			String user = "root";
			String password = "rps@123";

			// Establish Connection
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Database connected successfully!");
			// Create statement
			stmt = con.createStatement();


			// SQL query to select all records from Wipro table
			String sql = "SELECT * FROM Wipro";

			// Execute the query
			rs = stmt.executeQuery(sql);

			// Retrieve metadata about the result set
			ResultSetMetaData rsmd = rs.getMetaData();

			// Get the number of columns in the result set
			int columnCount = rsmd.getColumnCount();

			// Loop through all columns in the result set
			for (int i = 1; i <= columnCount; i++) {
				System.out.println("Column Name: " + rsmd.getColumnName(i));
				System.out.println("Column Type: " + rsmd.getColumnTypeName(i));
			}


			// Display records from the ResultSet
			while (rs.next()) {
				System.out.println("ID: " + rs.getInt("ID") + ", Name: " + rs.getString("NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// Clean up the resources
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
