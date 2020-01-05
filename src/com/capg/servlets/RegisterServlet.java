package com.capg.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capg.dao.EmployeeDao;
import com.capg.model.Employee;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Employee  employee=new Employee();
		employee.setEmployeeId(Integer.parseInt(req.getParameter("id")));
		employee.setEmployeeName(req.getParameter("name"));
		String message = EmployeeDao.saveEmployee(employee);
		if (message == "Success") {
			resp.getWriter().println("Employee Registered Successfully");
			//resp.sendRedirect("/FirstApplication/home");
			HttpSession session = req.getSession();
			session.setAttribute("name", employee.getEmployeeName());
		}else {
			resp.getWriter().println("Employee Not Registered ");
		}
	}
}
