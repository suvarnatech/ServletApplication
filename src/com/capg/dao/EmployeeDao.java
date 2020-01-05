package com.capg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.capg.connection.JDBCConnection;
import com.capg.model.Employee;

public class EmployeeDao {
	private static final String INSERT = " insert into Employee(id,name) values(?,?)";
	private static final String FETCH_ALL = " select * from Employee ";

	public static String saveEmployee(Employee employee) {
		try {
			Connection connection = JDBCConnection.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement(INSERT);
			prepareStatement.setInt(1, employee.getEmployeeId());
			prepareStatement.setString(2, employee.getEmployeeName());
			if (prepareStatement.execute()) {
				return "Failed";
			} else {
				return "Success";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "";
	}
}
