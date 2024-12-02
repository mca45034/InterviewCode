import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class examples extends HttpServlet{

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String url = "http://example.com/somepage";
        String encodedURL = response.encodeURL(url);

        out.println("<html><body>");
        out.println("<h1>URL Rewriting Example</h1>");
        out.println("<p>Original URL: " + url + "</p>");
        out.println("<p>Encoded URL: " + encodedURL + "</p>");
        out.println("<a href=\"" + encodedURL + "\">Click here to visit the page</a>");
        out.println("</body></html>");
    }
}