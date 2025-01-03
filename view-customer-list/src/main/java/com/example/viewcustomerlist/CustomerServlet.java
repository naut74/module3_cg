package com.example.viewcustomerlist;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customers")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "John Doe", "01/01/2000", "123 Main St", "customer1.jpg"));
        customers.add(new Customer(2, "Jane Doe", "02/02/2001", "456 Main St", "customer2.jpg"));
        customers.add(new Customer(3, "Jack Sparrow", "03/03/2002", "789 Main St", "customer3.jpg"));
        customers.add(new Customer(4, "Johnny Depp", "04/04/2003", "101 Main St", "customer4.jpg"));

        req.setAttribute("customers", customers);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
