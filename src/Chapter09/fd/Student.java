package Chapter09.fd;

public class Student extends People{

	public int studentNo;
	
	public Student (String name, String ssn, int studentNo) {
		super(name, ssn);//�����ε��� �θ�Ŭ������ �����ڸ� ȣ���Ͽ� �ʱ�ȭ
		this.studentNo=studentNo;
		
	}
}
