package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static final String url="jdbc:mysql://localhost:3306/myjdbc";
	private static final String userName="root";
	private static final String password="Kedhar@03";
	
	public static Connection getConnection() {
		Connection con=null;
		try {
			con=DriverManager.getConnection(url,userName,password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
