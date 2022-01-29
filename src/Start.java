import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.rakuten.Student;
import com.rakuten.StudentDao;

public class Start {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to Add student");
			System.out.println("Press 2 to Delete student");
			System.out.println("Press 3 to Display student");
			System.out.println("Press 4 to Update in student table");
			System.out.println("Press 5 to Exit From Here");
			
			int c = Integer.parseInt(br.readLine());
			if(c==1)
			{
				// Add Student

				System.out.println("Enter Student name");
				String name = br.readLine();
				
				System.out.println("Enter Student Phone");
                int phone = Integer.parseInt(br.readLine());
                
                System.out.println("Enter Student City");
                String city  = br.readLine();
                
//                Create student object
                Student st = new Student(9,name , phone , city);
               boolean answer = StudentDao.creatStudent(st);
               if(answer) {
            	   System.out.println("Sucessfully added...");
               }
               else {
            	   System.out.println("Something went wrong...");
               }
                System.out.println(st);
				
			}else if(c==2)
			{
				// delete student
				System.out.println("Enter Student ID to Delete");
				int userID = Integer.parseInt(br.readLine());
				boolean f = StudentDao.deleteStudent(userID);
				if(f) {
					System.out.println("Deleted Successfully");
				}
				else {
					System.out.println("Something Went Wrong...");
				}
				
				
				
			}else if(c==3)
			{
				StudentDao.showAllStudents();
				//Display student
			}else if(c==4)
			{
				
				// update Student
				
				
				BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
				 
				 System.out.println("Enter new name : ");
				 String newName = br1.readLine();
				 
				 System.out.println("Enter new Phone Number : ");
				 int newPhone = Integer.parseInt(br1.readLine());
				 
				 System.out.println("Enter new city name : ");
				 String newCity = br1.readLine();
				 
				  
				 System.out.println("Enter Student ID : ");
				 int id = Integer.parseInt(br1.readLine());
				 
     			 Student st1 = new Student(id,newName , newPhone ,newCity);
				 
				StudentDao update = new StudentDao();
				
				

               boolean answer = StudentDao.updateStudentToDataBase(st1);
               if(answer) {
            	   System.out.println("Sucessfully updated...");
               }
               else {
            	   System.out.println("Something went wrong...");
               }
				
			}
			else if(c==5)
			{
				//exit
				break;
			}
			
		}
	}

}
