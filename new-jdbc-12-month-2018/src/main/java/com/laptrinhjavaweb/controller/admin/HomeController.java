package com.laptrinhjavaweb.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/admin-home" })
// giai

public class HomeController extends HttpServlet {

    private static final long serialVersionUID = 1L;

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Lấy đối tượng RequestDispatcher để chuyển tiếp yêu cầu đến trang JSP
        RequestDispatcher rd = request.getRequestDispatcher("/views/admin/home.jsp");
        // Chuyển tiếp yêu cầu và phản hồi đến trang JSP
        rd.forward(request, response);
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Hiện tại phương thức này chưa được triển khai
    }

}
