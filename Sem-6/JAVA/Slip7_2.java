import java.sql.*;
import java.util.Scanner;

public class Slip7_2 {

    public static void main(String[] args) {

        Connection con = null;
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/vjw",
                    "tybcs",
                    "123"
            );

            Statement st = con.createStatement();

            // Create table safely
            String sql = "CREATE TABLE IF NOT EXISTS Product (pid INT PRIMARY KEY, pname TEXT, price INT)";
            st.execute(sql);

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO Product VALUES (?,?,?)"
            );

            System.out.println("Enter 5 records (pid pname price):");

            for (int i = 0; i < 5; i++) {
                int pid = sc.nextInt();
                sc.nextLine();
                String pname = sc.nextLine();
                int price = sc.nextInt();

                ps.setInt(1, pid);
                ps.setString(2, pname);
                ps.setInt(3, price);

                ps.executeUpdate();
            }

            System.out.println("Data inserted successfully!");

            Statement st2 = con.createStatement();
            ResultSet rs = st2.executeQuery("SELECT * FROM Product");

            System.out.println("\n--- Product Records ---");

            while (rs.next()) {
                int pid = rs.getInt("pid");
                String pname = rs.getString("pname");
                int price = rs.getInt("price");

                System.out.println(pid + "  " + pname + "  " + price);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}