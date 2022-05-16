import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        REDIRECT:
//        response.sendRedirect("https://www.google.com");
//        response.sendRedirect("/second.jsp");

//        FORWARD:
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/second.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
