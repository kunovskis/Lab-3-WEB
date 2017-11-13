package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AddressInfo.do")
public class AddressInfoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<p>" + req.getHeader("User-Agent") + "</p>");
        out.println("<p>" + req.getParameter("name") + "</p>");
        out.println("<p>" + req.getParameter("surname") + "</p>");
        out.println("<p>" + req.getSession().getAttribute("size") + "</p>");
    }
}
