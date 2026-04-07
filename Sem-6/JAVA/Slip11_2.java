import java.sql.*;

public class Slip11_2 {
    public static void main(String[] args) {

        try {
            // Load Driver
            Class.forName("org.postgresql.Driver");

            // Connection
            Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/vjw",
                "tybcs",
                "123"
            );

            // Create Statement
            Statement st = con.createStatement();

            // Execute Query
            ResultSet rs = st.executeQuery("SELECT * FROM employee");

            // Get Metadata
            ResultSetMetaData rsmd = rs.getMetaData();

            int colCount = rsmd.getColumnCount();

            System.out.println("Number of Columns: " + colCount);

            // Display column info
            for (int i = 1; i <= colCount; i++) {
                System.out.println("Column " + i + " Name: " + rsmd.getColumnName(i));
                System.out.println("Column " + i + " Type: " + rsmd.getColumnTypeName(i));
                System.out.println("Column " + i + " Size: " + rsmd.getColumnDisplaySize(i));
                System.out.println("-----------------------------");
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}