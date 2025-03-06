package packageDay11;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertingDataInSql {
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
			
			String sql = "INSERT INTO Wipro (Id, Name) VALUES (?, ?)";
			ps = con.prepareStatement(sql);

			// Add first set of values 
			ps.setInt(1, 232); 
			ps.setString(2, "Bob"); 
			ps.addBatch(); 

			// Add second set of values 
			ps.setInt(1, 233);  // Corrected position
			ps.setString(2, "Alice");  // Corrected position
			ps.addBatch(); 

			// Execute batch update 
			ps.executeBatch();
			System.out.println("Batch execution completed successfully!");

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


