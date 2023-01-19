package Chapter14.C;

public class Student {

	int studentId;
	String studentName;

	//생성자	
	public Student(int sutdentId, String studentName) {

		this.studentId = sutdentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		
		return studentId+" | "+studentName;
		
	}
	//물리적주소
	@Override
	public int hashCode() {		
		return studentId;
	}
	//논리적 비교문(내용을 비교)
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student std=(Student)obj; //DownCasting
			if(studentId==std.studentId) //비교판단
				return true;
			else 
				return false;
		}
		
		return false;
	}
	
	
	
	
}
