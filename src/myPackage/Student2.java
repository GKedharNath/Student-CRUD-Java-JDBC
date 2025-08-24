package myPackage;

public class Student2 {
	private  int sid;
	private  String sname;
	private  String branch;
	
	public Student2(int sid,String sname,String branch) {
		this.sid=sid;
		this.sname=sname;
		this.branch=branch;
	}
	public int getSid() {
		return sid;
	}
	public String getSname() {
		// TODO Auto-generated method stub
		return sname;
	}

	public String getBranch() {
		// TODO Auto-generated method stub
		return branch;
	}
	public String toString() {
		return "ID: " + sid + ", Name: "+ sname + ", branch: " + branch;
	}
}
