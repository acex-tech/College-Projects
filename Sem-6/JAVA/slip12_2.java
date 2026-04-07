import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class slip12_2 {

    JFrame f;
    JTable table;
    DefaultTableModel model;

    slip12_2() {

        f = new JFrame("PROJECT Table");
        f.setSize(600, 400);
        f.setLayout(new BorderLayout());

        model = new DefaultTableModel();
        table = new JTable(model);

        // Column Names
        model.addColumn("Project ID");
        model.addColumn("Project Name");
        model.addColumn("Description");
        model.addColumn("Status");

        try {
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/vjw",
                "tybcs",
                "123"
            );

            Statement st = con.createStatement();

            // ✅ Create Table
            st.executeUpdate("CREATE TABLE IF NOT EXISTS PROJECT (" +
                    "project_id INT PRIMARY KEY, " +
                    "project_name VARCHAR(50), " +
                    "project_description VARCHAR(100), " +
                    "project_status VARCHAR(20))");

            // ✅ Insert Data
            st.executeUpdate("INSERT INTO PROJECT VALUES (1,'Library','Library System','Active') ON CONFLICT DO NOTHING");
            st.executeUpdate("INSERT INTO PROJECT VALUES (2,'Billing','Billing System','Completed') ON CONFLICT DO NOTHING");

            // ✅ Fetch Data
            ResultSet rs = st.executeQuery("SELECT * FROM PROJECT");

            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt("project_id"),
                        rs.getString("project_name"),
                        rs.getString("project_description"),
                        rs.getString("project_status")
                });
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        f.add(new JScrollPane(table), BorderLayout.CENTER);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new slip12_2();
    }
}