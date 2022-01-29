package com.rakuten;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
//com.mysql.cj.jdbc.Driver
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
      
	 public static boolean creatStudent(Student st) {
//		 jdbc code to insert data
		boolean f = false;
		 try {
//			 jdbc code
			 Connection con = ConnectionProvider.creatConnection();	 
			 
			 String q = "insert into students(S_NAME,S_PHONE,S_CITY) values(?,?,?)";
			 //we will use prepared statements here
			 PreparedStatement pstmt = con.prepareStatement(q);
			 // Setting the values 
			 pstmt.setString(1, st.getStudentName());
			 pstmt.setInt(2, st.getStudentPhone());
			 pstmt.setString(3, st.getStudentCity());
			 
			 // Execute the query..........
			 pstmt.executeUpdate();
			 f=true;
			 
		 } catch(Exception e) {
			e.printStackTrace(); 
		 }
		 
		 return f;
		 
	 }

	public static boolean deleteStudent(int userID) {
		
		boolean f = false;
		 try {
//			 jdbc code
			 Connection con = ConnectionProvider.creatConnection();	 
			 
			 String q = "delete from student where ID = ?";
			 //we will use prepared statements here
			 PreparedStatement pstmt = con.prepareStatement(q);
			 // Setting the values 
			 pstmt.setInt(1, userID);
			
			 
			 // Execute the query..........
			 pstmt.executeUpdate();
			 f=true;
			 
		 } catch(Exception e) {
			e.printStackTrace(); 
		 }
		 
		 return f;
		
		
	}

	public static void showAllStudents() {
		
		
		 try {
//			 jdbc code
			 Connection con = ConnectionProvider.creatConnection();	 
			 
			 String q = "select * from Students;";
			 Statement stmt  = con.createStatement();
			 ResultSet set = stmt.executeQuery(q);
			 
			 while(set.next()) {
				 int id = set.getInt(1);
				 String name = set.getString(2);
				 String phone = set.getString(3);
				 String city = set.getString(4);
				 
				 System.out.println("ID : "+id);
				 System.out.println("Student Name :"+name);
				 System.out.println("Phone : "+phone);
				 System.out.println("City : "+city);
				 System.out.println("**************************");
			 }

			 
			 
		 } catch(Exception e) {
			e.printStackTrace(); 
		 }
		 		
	}

	public static boolean updateStudentToDataBase(Student updatestudent) {
		
////	 jdbc code to update data
	boolean f = false;
	 try {
//		 jdbc code
		 Connection con = ConnectionProvider.creatConnection();	 
		 
		 String q = "update students SET S_NAME = ?, S_PHONE = ?, S_CITY = ? where ID = ?";
		 

		 PreparedStatement pstmt = con.prepareStatement(q);
		 // Setting the values 
		

		 
		 pstmt.setString(1,updatestudent.getStudentName());
		 pstmt.setInt(2,updatestudent.getStudentPhone());
		 pstmt.setString(3, updatestudent.getStudentCity());
		 pstmt.setInt(4, updatestudent.getStudentID());

		 
		 // Execute the query..........
		 pstmt.executeUpdate();
		 f=true;
		 
	 } catch(Exception e) {
		e.printStackTrace(); 
	 }
	 
	 return f;
	 
}

	
}

	
	


