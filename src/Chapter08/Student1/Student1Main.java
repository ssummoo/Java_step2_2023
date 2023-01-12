package Chapter08.Student1;

public class Student1Main {

	public static void main(String[] args) {
		
		Student1 studentLee=new Student1();
		studentLee.setStudentName("ÀÌÀç¹Î");		
		System.out.println(studentLee.StudentName);
		System.out.println(Student1.getSeriaLNum());
		Student1.seriaLNum++;
		
		Student1 studentKim=new Student1();
		studentKim.setStudentName("±èÃ¢¿ì");
		System.out.println(studentKim.StudentName);
		System.out.println(Student1.getSeriaLNum());
		Student1.seriaLNum++;
		
		Student1 studentPark=new Student1();
		studentPark.setStudentName("¹ÚÃ¢ÈÆ");
		System.out.println(studentPark.StudentName);
		System.out.println(Student1.getSeriaLNum());
		Student1.seriaLNum++;
		
	}

}
