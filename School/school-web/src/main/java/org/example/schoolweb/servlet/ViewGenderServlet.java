package org.example.schoolweb.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/viewgender")
public class ViewGenderServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String gender = (String)req.getAttribute("gender");

        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println("<html>");
        resp.getWriter().println("<head>");
        resp.getWriter().println("<title>이름과 성별 확인</title>");
        resp.getWriter().println("</head>");
        resp.getWriter().println("<body>");
        resp.getWriter().println("<h1>이름과 성별 확인</h1>");
        resp.getWriter().println("<p>이름: " + name + "</p>");
        resp.getWriter().println("<p>성별: " + gender + "</p>");
        resp.getWriter().println("</body>");
        resp.getWriter().println("</html>");
        resp.getWriter().close();
    }
}
