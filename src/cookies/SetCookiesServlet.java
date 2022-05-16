package cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class SetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie1 = new Cookie("my_cookie", "123");
        cookie1.setMaxAge(60 * 60 * 24);

        Cookie cookie2 = new Cookie("orlanda_cookie", "456");
        cookie2.setMaxAge(-1); //удалится при закрытии браузера

        response.addCookie(cookie1);
        response.addCookie(cookie2);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
