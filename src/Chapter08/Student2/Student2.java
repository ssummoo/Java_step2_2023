package Chapter08.Student2;

public class Student2 {
	
	public static int seriaLNum=9999;
	int sutdentID;
	String StudentName;
	String address;
	
	public Student2() {
		seriaLNum++;
		this.sutdentID=seriaLNum;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public static int getSeriaLNum() {
		return seriaLNum;
	}
}
