import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/slip18_22")
public class slip18_22 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public slip18_22() {
		super();
	}

	// Use doPost for form submission
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// Get form data
		String seatno = request.getParameter("seatno");
		String name = request.getParameter("name");
		String cls = request.getParameter("class");
		int marks = Integer.parseInt(request.getParameter("marks"));

		// Calculate percentage (out of 500)
		double percentage = (marks / 500.0) * 100;

		// Calculate grade
		String grade;
		if (percentage >= 75) {
			grade = "Distinction";
		} else if (percentage >= 60) {
			grade = "First Class";
		} else if (percentage >= 50) {
			grade = "Second Class";
		} else if (percentage >= 40) {
			grade = "Pass";
		} else {
			grade = "Fail";
		}

		// Display result
		out.println("<html><body>");
		out.println("<h2>Student Details</h2>");
		out.println("Seat No: " + seatno + "<br>");
		out.println("Name: " + name + "<br>");
		out.println("Class: " + cls + "<br>");
		out.println("Total Marks: " + marks + "<br>");
		out.println("Percentage: " + percentage + "%<br>");
		out.println("Grade: " + grade + "<br>");
		out.println("</body></html>");
	}
}