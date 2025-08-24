package myPackage;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentCRUD crud=new StudentCRUD();
		int choice;
		do {
			System.out.println("\n----Student CRUD application----");
			System.out.println("1. Insert student");
			System.out.println("2. Read student");
			System.out.println("3. Update student");
			System.out.println("4. Delete student");
			System.out.println("5. Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			switch(choice) {
				//inserting students
				case 1:
					System.out.println("Enter student ID");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter student Name");
					String name=sc.nextLine();
					System.out.println("Enter student branch");
					String branch=sc.nextLine();
					
					Student2 student=new Student2(id,name,branch);
					crud.insertStudent(student);
					break;
				
				//read student data
				case 2:
					List<Student2> students= crud.readStudents();
					System.out.println("\n---Student records---");
					for(Student2 s: students) {
						System.out.println(s);
					}
					break;
					
				//update student data
				case 3:
					System.out.println("Enter student id for update");
					int sid=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter branch name");
					String newbranch=sc.nextLine();
					crud.updateStudent(sid, newbranch);
					break;
					
				//delete student data
				case 4:
					System.out.println("Enter student id to delete student data");
					int uid=sc.nextInt();
					crud.deleteStudent(uid);
					break;
				
				//Exit option
				case 5:
					System.out.println("Exiting....");
					break;
					
				default:
					System.out.println("Invalid choice! please try again.");
			}
			
		}
		while(choice!=5);
		sc.close();
	}

}
