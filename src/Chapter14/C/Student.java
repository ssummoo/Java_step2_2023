package Chapter14.C;

public class Student {

	int studentId;
	String studentName;

	//������	
	public Student(int sutdentId, String studentName) {

		this.studentId = sutdentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		
		return studentId+" | "+studentName;
		
	}
	//�������ּ�
	@Override
	public int hashCode() {		
		return studentId;
	}
	//���� �񱳹�(������ ��)
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student std=(Student)obj; //DownCasting
			if(studentId==std.studentId) //���Ǵ�
				return true;
			else 
				return false;
		}
		
		return false;
	}
	
	
	
	
}
