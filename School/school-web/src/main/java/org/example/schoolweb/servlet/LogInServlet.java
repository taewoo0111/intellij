package org.example.schoolweb.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/class/login")
public class LogInServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String nickname = req.getParameter("nickname");
        String grade = req.getParameter("grade");
        String gender = req.getParameter("gender");
        String[] classes = req.getParameterValues("class");
        List<String> classList = new ArrayList<>();

        if (classes != null) {
            classList.addAll(Arrays.asList(classes));
        }

        req.setAttribute("name", name);
        req.setAttribute("nickname", nickname);
        req.setAttribute("grade", grade);
        req.setAttribute("gender", gender);
        req.setAttribute("list", classList);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/class/class1.jsp");
        dispatcher.forward(req, resp);
    }
}
