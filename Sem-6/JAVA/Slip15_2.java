

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Slip15_2
 */
@WebServlet("/Slip15_2")
public class Slip15_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Slip15_2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();

        // Get existing cookies
        Cookie[] cookies = request.getCookies();
        int count = 0;
        boolean found = false;

        // Check if a "visit" cookie exists
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visit")) {
                    count = Integer.parseInt(c.getValue());
                    found = true;
                    break;
                }
            }
        }

        // If no cookie found (first visit) or logic requires incrementing before display
        if (!found) {
            count = 1; // First visit
            out.println("<h1>Welcome to the web page!</h1>");
        } else {
            // Increment count for the current visit
            count++;
            out.println("<h1>You have visited this page " + count + " times.</h1>");
        }

        // Create and add the cookie to the response
        // Note: In the provided context examples, the cookie is often set to the current count
        // or the count is incremented and then stored. The following logic sets the cookie 
        // to the current count value after the decision is made.
        Cookie c = new Cookie("visit", String.valueOf(count));
        response.addCookie(c);
        
        out.close();
		
	}

}
