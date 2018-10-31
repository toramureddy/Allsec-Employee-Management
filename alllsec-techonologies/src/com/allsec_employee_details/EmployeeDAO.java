package com.allsec_employee_details;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {
	
	 static Connection con = DBconnection.getConn();

	public static void insertInTOEmp(int emp_id, String firstname, String lastname, String job, int mno, String email,
			String city, int pcode) throws SQLException {

		Connection con = DBconnection.getConn();

		PreparedStatement stmt = con.prepareStatement("insert into EmployeeDetails values(?,?,?,?,?,?)");

		stmt.setInt(1, emp_id);
		stmt.setString(2, firstname);
		stmt.setString(3, lastname);
		stmt.setString(4, job);
		stmt.setInt(5, mno);
		stmt.setString(6, email);
		int i = stmt.executeUpdate();

		System.out.println(i);
		
		PreparedStatement stmt2=con.prepareStatement("insert into Address values(?,?,?)");
		
		stmt2.setString(1, city);
		stmt2.setInt(2,pcode);
		stmt2.setInt(3,emp_id);
		stmt2.executeUpdate();

	}
	
	public static ResultSet getEmployee(int empid) throws SQLException{
		
		PreparedStatement stmt3=con.prepareStatement("SELECT * FROM EMPLOYEEDETAILS WHERE EMPLOYEE_ID=?");
		stmt3.setInt(1, empid); 
		ResultSet rs=stmt3.executeQuery();
		return rs;
		

	}

}
