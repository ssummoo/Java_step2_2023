package Chapter08.Student1;

public class Student1Main2 {

	public static void main(String[] args) {
		
		Student1 studentLee=new Student1();
		studentLee.setStudentName("�����");
		studentLee.sutdentID=studentLee.seriaLNum;
		System.out.println("�̸� : "+studentLee.StudentName
						+"  ���̵� : "+studentLee.sutdentID);
		
		Student1.seriaLNum++;
		
		Student1 studentKim=new Student1();
		studentKim.setStudentName("��â��");
		studentKim.sutdentID=studentKim.seriaLNum;
		System.out.println("�̸� : "+studentKim.StudentName
						+"  ���̵� : "+studentKim.sutdentID);
		Student1.seriaLNum++;
		
		Student1 studentPark=new Student1();
		studentPark.setStudentName("��â��");
		studentPark.sutdentID=studentPark.seriaLNum;
		System.out.println("�̸� : "+studentPark.StudentName
						+"  ���̵� : "+studentPark.sutdentID);
		Student1.seriaLNum++;
		
	}

}
