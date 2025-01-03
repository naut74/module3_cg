package com.example.simple_login;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter writer = response.getWriter();
        writer.print("<html>");
        if ("admin".equals(username) && "admin".equals(password)) {
            writer.print("<h1>Welcome " + username + "!</h1>");
        } else {
            writer.print("<h1>Login failed</h1>");
        }
        writer.print("</html>");
    }
}
