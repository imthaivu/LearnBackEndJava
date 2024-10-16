package com.laptrinhjavaweb.controller.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.model.UserModel;

@WebServlet(urlPatterns = {"/trang-chu"})
public class HomeController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	// Xử lý yêu cầu GET
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserModel userModel = new UserModel();
		userModel.setFullName("Hello world");
		request.setAttribute("model", userModel);
		processRequest(request, response);
	}


	// Xử lý yêu cầu POST
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	

	// Phương thức chung để xử lý cả GET và POST
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Logic xử lý yêu cầu, ví dụ như chuyển tiếp đến trang home.jsp
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
		rd.forward(request, response);
	}
	

	// Cung cấp thông tin về servlet
	@Override
	public String getServletInfo() {
		return "HomeController servlet for managing home page.";
	}
}
