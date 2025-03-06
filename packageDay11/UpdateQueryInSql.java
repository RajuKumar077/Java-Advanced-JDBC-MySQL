package packageDay11;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UpdateQueryInSql {
    public static void main(String args[]) {
        Connection con = null;
        PreparedStatement ps1 = null, ps2 = null;


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


            // Define the first UPDATE SQL query
            String sql1 = "UPDATE Wipro SET Id = ? WHERE Name = 'Bob'";
            ps1 = con.prepareStatement(sql1);
            ps1.setInt(1, 999); // Update Id to 999 for Name = 'Bob'


            // Execute the first update
            ps1.executeUpdate();


            // Define the second UPDATE SQL query
            String sql2 = "UPDATE Wipro SET Name = ? WHERE Id = 100";
            ps2 = con.prepareStatement(sql2);
            ps2.setString(1, "PPP"); // Update Name to 'PPP' for Id = 100


            // Execute the second update
            ps2.executeUpdate();


            System.out.println("Both updates completed successfully!");


        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found. Check if the driver JAR is added.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection error! Check your URL, username, or password.");
            e.printStackTrace();
        } finally {
            // Close resources in the correct order
            try {
                if (ps1 != null) ps1.close();
                if (ps2 != null) ps2.close();
                if (con != null) con.close();
                System.out.println("Database connection closed.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
