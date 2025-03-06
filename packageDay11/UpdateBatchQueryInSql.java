package packageDay11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UpdateBatchQueryInSql {
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


			// Define the UPDATE SQL query for batch update
			String sql = "UPDATE Wipro SET Id = ? WHERE Name = ?";


			// Initialize PreparedStatement with the query
			ps = con.prepareStatement(sql);


			// Add first update statement to the batch
			ps.setInt(1, 111);  // Update Id to 111 for Name 'Bob'
			ps.setString(2, "Bob");
			ps.addBatch();


			// Add second update statement to the batch
			ps.setInt(1, 222);  // Update Id to 222 for Name 'Alice'
			ps.setString(2, "Alice");
			ps.addBatch();


			// Add third update statement to the batch
			ps.setInt(1, 333);  // Update Id to 333 for Name 'John'
			ps.setString(2, "John");
			ps.addBatch();


			// Execute the batch of updates
			int[] updateCounts = ps.executeBatch();
			System.out.println("Batch execution completed!");


			// Optionally print the update counts
			for (int count : updateCounts) {
				System.out.println("Rows updated: " + count);
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


