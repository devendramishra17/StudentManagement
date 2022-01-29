package com.rakuten;

public class Student {
	private int StudentID;
	private String StudentName;
	private int StudentPhone;
	private String StudentCity;
	
	
	public Student(int studentID, String studentName, int phone, String studentCity) {
		super();
		StudentID = studentID;
		StudentName = studentName;
		StudentPhone = phone;
		StudentCity = studentCity;
	}


	public Student(String studentName, int studentPhone, String studentCity) {
		super();
		StudentName = studentName;
		StudentPhone = studentPhone;
		StudentCity = studentCity;
	}
	
//	public Student1(int userID , String updateName) {
//		super();
//		int userID1;
//		String updateName1;
//	}


//	public void Student(int userID, String updateName) {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public int updateName() {
//		return updateName;
//	}
//	public void setuserID(String updateName) {
//		updateName = updateName;
//	}

//	public int getuserID() {
//		return StudentID;
//	}
//	public void setuserID(int userID) {
//		userID = userID;
//	}
	
	public int getStudentID() {
		return StudentID;
	}
	



	public void setStudentID(int studentID) {
		StudentID = studentID;
	}


	public String getStudentName() {
		return StudentName;
	}


	public void setStudentName(String studentName) {
		StudentName = studentName;
	}


	public int getStudentPhone() {
		return StudentPhone;
	}


	public void setStudentPhone(int studentPhone) {
		StudentPhone = studentPhone;
	}


	public String getStudentCity() {
		return StudentCity;
	}


	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}


	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", StudentPhone=" + StudentPhone
				+ ", StudentCity=" + StudentCity + "]";
	}
	
	
	
}
