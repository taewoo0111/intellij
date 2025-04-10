package org.example.schoolweb.servlet;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String hello = "Hello World!";

        // 응답 인코딩
        resp.setCharacterEncoding("utf-8");
        // 응답 컨텐트 설정
        resp.setContentType("text/html; charset = utf-8");

        PrintWriter pw = resp.getWriter();
        pw.println("<!doctype html>");
        pw.println("<html>");
        pw.println("<head>");
        pw.println("<meta charset = 'utf-8'>");
        pw.println("<title>오늘의 인사 페이지</title>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<p> 오늘의 인사: <strong>" + hello + "</strong></p>");
        pw.println("</body>");
        pw.println("</html>");
        pw.close();
    }
}