package com.allsec_employee_details;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	
	public static Connection getConn() {
		Connection con = null;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "System");

		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

}
