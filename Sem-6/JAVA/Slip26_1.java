import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Slip26_1 {

    public static void main(String[] args) {

        String name = args[0];
        System.out.println("Deleting employee: " + name);

        Connection con;

        try {
            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/vjw",
                "tybcs",
                "123"
            );

            PreparedStatement ps = con.prepareStatement(
                "DELETE FROM employee WHERE ename=?"
            );

            ps.setString(1, name);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Record Deleted Successfully");
            } else {
                System.out.println("No Record Found");
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}