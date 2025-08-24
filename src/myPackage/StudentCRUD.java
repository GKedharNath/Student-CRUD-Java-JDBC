package myPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentCRUD {
	//create 
	public void insertStudent(Student2 student) {
		try(
				Connection con=DBConnection.getConnection();
				PreparedStatement pst=con.prepareStatement(StudentQueries.insert);
				){
			pst.setInt(1, student.getSid());
			pst.setString(2, student.getSname());
			pst.setString(3, student.getBranch());
			int rows= pst.executeUpdate();
			System.out.println(rows+"student inserted");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	//read
	public List<Student2> readStudents(){
		List<Student2> students= new ArrayList<>();
		try(
				Connection con=DBConnection.getConnection();
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(StudentQueries.read);
				){
			while(rs.next()){
				students.add(new Student2(
						rs.getInt("sid"),
						rs.getString("sname"),
						rs.getString("branch")
				));
			}
				
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return students;
	}
	//update
	public void updateStudent(int id,String newBranch) {
		try(
				Connection con=DBConnection.getConnection();
				PreparedStatement pst=con.prepareStatement(StudentQueries.update);
				){
			pst.setString(1, newBranch);
			pst.setInt(2, id);
			int rows=pst.executeUpdate();
			System.out.println(rows+"students updated");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	//delete
	public void deleteStudent(int id) {
		try(
				Connection con=DBConnection.getConnection();
				PreparedStatement pst=con.prepareStatement(StudentQueries.delete);
				){
			pst.setInt(1, id);
			int rows=pst.executeUpdate();
			System.out.println(rows+"student deleted");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
