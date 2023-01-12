package Chapter08.Student1;

public class Student1Main2 {

	public static void main(String[] args) {
		
		Student1 studentLee=new Student1();
		studentLee.setStudentName("이재민");
		studentLee.sutdentID=studentLee.seriaLNum;
		System.out.println("이름 : "+studentLee.StudentName
						+"  아이디 : "+studentLee.sutdentID);
		
		Student1.seriaLNum++;
		
		Student1 studentKim=new Student1();
		studentKim.setStudentName("김창우");
		studentKim.sutdentID=studentKim.seriaLNum;
		System.out.println("이름 : "+studentKim.StudentName
						+"  아이디 : "+studentKim.sutdentID);
		Student1.seriaLNum++;
		
		Student1 studentPark=new Student1();
		studentPark.setStudentName("박창훈");
		studentPark.sutdentID=studentPark.seriaLNum;
		System.out.println("이름 : "+studentPark.StudentName
						+"  아이디 : "+studentPark.sutdentID);
		Student1.seriaLNum++;
		
	}

}
