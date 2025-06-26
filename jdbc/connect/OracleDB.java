import java.sql.*;

public class OracleDB {
    public static void main(String[] args) {
        try {
            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Connect to Oracle Database (update URL, username, and password)
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "123");

            System.out.println("Connected to Oracle Database!");

            con.close(); // Close connection
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

