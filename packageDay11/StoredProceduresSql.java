package packageDay11;
import java.sql.*;


public class StoredProceduresSql {
    
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mysql";
        String user = "root";
        String password = "rps@123";
        Connection conn = null;
        CallableStatement state = null;


        try {
            // Establish database connection
            conn = DriverManager.getConnection(url, user, password);


            // Prepare the stored procedure call
            String query = "{CALL GetWiproById(?)}"; // Your stored procedure
            state = conn.prepareCall(query);


            // Set the input parameter (ID for fetching record)
            state.setInt(1, 1); 


            // Execute the stored procedure
            ResultSet rs = state.executeQuery();


            // Check if the ResultSet contains data
            if (rs.next()) {
                // Retrieve data from the ResultSet based on your stored procedure's output
                String name = rs.getString("Name"); // Change the column names if needed
                int id = rs.getInt("Id");


                System.out.println("Name: " + name);
                System.out.println("ID: " + id);
            } else {
                System.out.println("No record found for the given ID.");
            }


            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (state != null) state.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


