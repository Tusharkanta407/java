import java.sql.*;

public class EmployeeDB {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@//localhost:1521/xe"; 
        String user = "system"; 
        String password = "123";  
        String insertSQL = "INSERT INTO EMPLOYEE (name, salary, age, location, department) " +
                           "VALUES ('John Doe', 50000, 30, 'New York', 'IT')";
        String selectSQL = "SELECT * FROM EMPLOYEE";

        
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            System.out.println(" Connected to  Database!");

            
            int rowsInserted = stmt.executeUpdate(insertSQL);
            System.out.println("✔ " + rowsInserted + " row(s) inserted.");

            
            try (ResultSet rs = stmt.executeQuery(selectSQL)) {
                System.out.println("\n📌 EMPLOYEE TABLE:");
                System.out.println("---------------------------------------------------");
                System.out.printf("%-5s %-15s %-10s %-5s %-15s %-15s%n", "ID", "Name", "Salary", "Age", "Location", "Department");
                System.out.println("---------------------------------------------------");

                while (rs.next()) {
                    System.out.printf("%-5d %-15s %-10d %-5d %-15s %-15s%n",
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getInt("salary"),
                            rs.getInt("age"),
                            rs.getString("location"),
                            rs.getString("department"));
                }
                System.out.println("---------------------------------------------------");
            }

        } catch (SQLException e) {
            System.err.println("❌ SQL Error: " + e.getMessage());
        }
    }
}


