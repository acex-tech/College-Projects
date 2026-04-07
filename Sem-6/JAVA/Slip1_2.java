import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Slip1_2 extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton b1;

    Connection con;
    PreparedStatement pst;

    Slip1_2() {
        setTitle("Employee Form");
        setLayout(null);

        l1 = new JLabel("Employee No:");
        l2 = new JLabel("Name:");
        l3 = new JLabel("Designation:");
        l4 = new JLabel("Salary:");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();

        b1 = new JButton("Save");

        l1.setBounds(50, 50, 100, 30);
        t1.setBounds(160, 50, 150, 30);

        l2.setBounds(50, 100, 100, 30);
        t2.setBounds(160, 100, 150, 30);

        l3.setBounds(50, 150, 100, 30);
        t3.setBounds(160, 150, 150, 30);

        l4.setBounds(50, 200, 100, 30);
        t4.setBounds(160, 200, 150, 30);

        b1.setBounds(120, 260, 100, 30);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(l4); add(t4);
        add(b1);

        b1.addActionListener(this);

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/vjw",
                "tybcs",
                "123"
            );
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
	public void actionPerformed(ActionEvent e) {
        try {
            int eno = Integer.parseInt(t1.getText());
            String name = t2.getText();
            String desig = t3.getText();
            double sal = Double.parseDouble(t4.getText());

            pst = con.prepareStatement(
                "INSERT INTO employee(eno, ename, designation, salary) VALUES (?, ?, ?, ?)"
            );

            pst.setInt(1, eno);
            pst.setString(2, name);
            pst.setString(3, desig);
            pst.setDouble(4, sal);

            int i = pst.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Record Inserted Successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Error!");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new Slip1_2();
    }
}