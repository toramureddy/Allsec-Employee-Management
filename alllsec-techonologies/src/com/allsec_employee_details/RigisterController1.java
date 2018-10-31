package com.allsec_employee_details;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RigisterController1 extends HttpServlet{
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String employee_id = request.getParameter("employee_id");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String job = request.getParameter("job");
		String mobile_no = request.getParameter("mobile_no");
		String email = request.getParameter("email");
		String city = request.getParameter("city");
		String pincode = request.getParameter("pincode");
		
		
		System.out.println(email);
		
		
		int emp_id=Integer.parseInt(employee_id);
		int mno=Integer.parseInt(mobile_no);
		int pcode=Integer.parseInt(pincode);
		try {
			EmployeeDAO.insertInTOEmp(emp_id, firstname, lastname, job, mno, email,city,pcode);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
   }

}
