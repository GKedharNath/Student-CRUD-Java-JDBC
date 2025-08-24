package myPackage;

public class StudentQueries {
	public static final String insert="insert into student (sid,sname,branch) values (?,?,?)";
	public static final String read="select * from student";
	public static final String update="update student set branch=? where sid=?";
	public static final String delete="delete from student where sid=?";
}
