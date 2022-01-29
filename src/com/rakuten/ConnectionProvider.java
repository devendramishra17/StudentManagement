package com.rakuten;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	static Connection con; 
	public static Connection creatConnection() {
        
		 
        try {
            //load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			Create the connection.......
			String user ="root";
			String password = "System";
			String url = "jdbc:mysql://localhost:3306/student_manage";
			con = DriverManager.getConnection(url,user,password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        return con;
	 }
	public static Connection createConnection1() {
		// TODO Auto-generated method stub
		return null;
	}
	public static Connection createConnection() {
		// TODO Auto-generated method stub
		return null;
	}

}
