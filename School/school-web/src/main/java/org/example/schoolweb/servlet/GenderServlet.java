package org.example.schoolweb.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/gender")
public class GenderServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String jumin = req.getParameter("jumin");
        String gender = null;
        if(jumin.startsWith("1")||jumin.startsWith("3")){
            gender = "남자";
        }else if(jumin.startsWith("2")||jumin.startsWith("4")){
            gender = "여자";
        }else{
            gender="잘못된 주민번호입니다.";
        }
        req.setAttribute("gender", gender);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/viewgender");
        dispatcher.forward(req, resp);
    }
}
