import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDeleteExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "your_password";

        String sql = "DELETE FROM students WHERE id = ?";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con =
                     DriverManager.getConnection(url, username, password);
                 PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setInt(1, 101);

                int rowsDeleted = ps.executeUpdate();

                if (rowsDeleted > 0) {
                    System.out.println(
                        "Student record deleted successfully.");
                } else {
                    System.out.println("No matching record found.");
                }

                System.out.println("Rows deleted: " + rowsDeleted);
            }

        } catch (ClassNotFoundException e) {
            System.out.println(
                "MySQL JDBC driver not found.");
        } catch (SQLException e) {
            System.out.println(
                "Database error: " + e.getMessage());
        }
    }
}
