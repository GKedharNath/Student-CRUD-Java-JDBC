package myPackage;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Student {
	/* load driver
	 * connection establish
	 * statement create
	 * execute query
	 * connection close
	 */
	//connection establish
	public void createDataBase() {
		try {
				String url="jdbc:mysql://localhost:3306/jdbc";
				String userName="root";
				String password="Kedhar@03";
				String query="create database MYJDBC";
				Connection con=DriverManager.getConnection(url,userName,password);
				Statement st= con.createStatement();
				st.execute(query);
				System.out.println("Database created Successfully");
				con.close();
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void createTable() {
		try {
			String url="jdbc:mysql://localhost:3306/";
			String dbName="myjdbc";
			String userName="root";
			String password="Kedhar@03";
			String query="create table Student (sid integer, sname varchar(20), branch varchar(20))";
			Connection con=DriverManager.getConnection(url+dbName,userName,password);
			Statement st= con.createStatement();
			st.execute(query);
			System.out.println("Table created Successfully");
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public void createData() {

		try {
			String url="jdbc:mysql://localhost:3306/";
			String userName="root";
			String password="Kedhar@03";
			String dbName="myjdbc";
			Connection con=DriverManager.getConnection(url+dbName,userName,password);
			//one way of inserting values into the table			
			String query="insert into student (sid,sname,branch) values (?,?,?)";
			
			//also there is another way for inserting values that is by using preparedStatement interface
			PreparedStatement pst= con.prepareStatement(query);
			pst.setInt(1, 1);
			pst.setString(2, "anshu");
			pst.setString(3, "asrith");
			pst.execute();
			System.out.println("Data Inserted Successfully");
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void inputData() {

		String url="jdbc:mysql://localhost:3306/myjdbc";
		String userName="root";
		String password="Kedhar@03";
		
		String query="insert into student (sid,sname,branch) values (?,?,?)";
		try(
				Connection con= DriverManager.getConnection(url,userName,password);
				PreparedStatement pst= con.prepareStatement(query);
				Scanner sc=new Scanner(System.in);
				){
			System.out.println("How many students you want to insert");
			int n=sc.nextInt();
			sc.nextLine();
			for(int i=0;i<n;i++) {
				System.out.println("Enter details of the student"+i);
				
				System.out.println("Enter student id");
				int sid=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter Name: ");
                String sname = sc.nextLine();

                System.out.println("Enter Branch: ");
                String branch = sc.nextLine();
				
                pst.setInt(1, sid);
                pst.setString(2, sname);
                pst.setString(3, branch);
                pst.executeUpdate();
			}
			System.out.println("All the student data inserted successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}



}

