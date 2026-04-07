import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

@WebServlet("/SearchCust")
public class SearchCust extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/vjw",
                    "tybcs",
                    "123"
            );

            int cno = Integer.parseInt(request.getParameter("cno"));

            // ✅ Use PreparedStatement
            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM CUSTOMER WHERE CNO = ?"
            );
            ps.setInt(1, cno);

            ResultSet rs = ps.executeQuery(); // ✅ correct

            if (!rs.next()) {
                out.println("No record found");
            } else {
                do {
                    out.println("Customer No: " + rs.getInt("cno") + "<br>");
                    out.println("Name: " + rs.getString("cname") + "<br>");
                } while (rs.next());
            }

            con.close();

        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    }
}