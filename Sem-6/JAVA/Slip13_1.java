import java.sql.*;

public class Slip13_1 {
    public static void main(String[] args) {

        try {
            // Load Driver
            Class.forName("org.postgresql.Driver");

            // Establish Connection
            Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/vjw",
                "tybcs",
                "123"
            );

            // Get DatabaseMetaData
            DatabaseMetaData dbmd = con.getMetaData();

            // Display Database Information
            System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
            System.out.println("Database Version: " + dbmd.getDatabaseProductVersion());
            System.out.println("Driver Name: " + dbmd.getDriverName());
            System.out.println("Driver Version: " + dbmd.getDriverVersion());

            // List all tables
            System.out.println("\nTables in Database:");

            ResultSet rs = dbmd.getTables(null, null, "%", new String[]{"TABLE"});

            while (rs.next()) {
                System.out.println(rs.getString("TABLE_NAME"));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}