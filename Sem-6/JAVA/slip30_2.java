import java.sql.*;

public class slip30_2 {
    public static void main(String[] args) {

        try {
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/vjw",
                "tybcs",
                "123"
            );

            Statement st = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY
            );

            ResultSet rs = st.executeQuery("SELECT * FROM teacher1");

            System.out.println("Forward Direction:");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " +
                                   rs.getString(2) + " " +
                                   rs.getDouble(3));
            }

            System.out.println("\nBackward Direction:");
            while (rs.previous()) {
                System.out.println(rs.getInt(1) + " " +
                                   rs.getString(2) + " " +
                                   rs.getDouble(3));
            }

            System.out.println("\nFirst Record:");
            rs.first();
            System.out.println(rs.getInt(1) + " " +
                               rs.getString(2) + " " +
                               rs.getDouble(3));

            System.out.println("\nLast Record:");
            rs.last();
            System.out.println(rs.getInt(1) + " " +
                               rs.getString(2) + " " +
                               rs.getDouble(3));

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}