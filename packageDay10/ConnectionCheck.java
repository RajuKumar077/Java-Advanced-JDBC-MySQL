package packageDay10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionCheck {
	public static void main(String args[]) {
		Connection con = null;
		PreparedStatement ps = null;

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

			// SQL Insert Query
			String sql = "INSERT INTO Wipro (Id, Name) VALUES (?, ?)";
			ps = con.prepareStatement(sql);

			// Setting values in the PreparedStatement
			ps.setInt(1, 123);
			ps.setString(2, "YYY");

			// Add first set of values 
			ps.setInt(1, 777); 
			ps.setString(2, "Hunter"); 
			ps.addBatch(); 

			// Add second set of values 
			ps.setInt(2, 100);
			ps.setString(1, "Will");
			ps.addBatch(); 

			// Execute batch update 

			ps.executeBatch();




			// Execute the insertion
			int rowsInserted = ps.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("Data inserted successfully!");
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
				if (ps != null) ps.close();
				if (con != null) con.close();
				System.out.println("Database connection closed.");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}



