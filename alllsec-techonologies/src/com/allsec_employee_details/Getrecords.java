package com.allsec_employee_details;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Getrecords extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws
	                                                  ServletException, IOException {
		String empid=request.getParameter("employee_id");
		
		int emp_id=Integer.parseInt(empid);
		
		
		try {
			ResultSet rs= EmployeeDAO.getEmployee(emp_id);
		
			while(rs.next()){
				
				PrintWriter out=response.getWriter();
				out.println("Employee Details"+rs.getString(1)+"---"+rs.getString(2)+"---"+ rs.getString(3)+
				             rs.getString(4)+ "---" +rs.getString(5)+"---"+rs.getString(6));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	
	
	
	
	}
}
	
	
