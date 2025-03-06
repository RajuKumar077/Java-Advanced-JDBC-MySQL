package packageDay11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class SelectAllQuery {
	public static void main(String args[]) {
		Connection con = null;
		Statement stmt = null;  // Declare Statement here
		ResultSet rs = null;    // Declare ResultSet for storing query results
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


			// Create Statement object for executing the SELECT query
			stmt = con.createStatement();

			// SQL query to select all records from the 'Wipro' table
			String selectSql = "SELECT * FROM Wipro";

			// Execute the query and store the result in ResultSet
			rs = stmt.executeQuery(selectSql);

			// Loop through the ResultSet and print out the data
			while (rs.next()) {
				System.out.println("Id: " + rs.getInt("Id") + ", Name: " + rs.getString("Name"));
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver not found. Check if the driver JAR is added.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Database connection error! Check your URL, username, or password.");
			e.printStackTrace();
		} finally {
			// Close resources in the correct order
			try {
				if (rs != null) rs.close();  // Close ResultSet first
				if (stmt != null) stmt.close();  // Close Statement second
				if (con != null) con.close();  // Close Connection last
				System.out.println("Database connection closed.");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

