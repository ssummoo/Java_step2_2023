package Chapter15;

public class PersonMain {

	public static void main(String[] args) throws ClassNotFoundException {

		//���1
		Person person = new Person();
		Class pClass1=person.getClass();//Class : Ŭ������ ����
		System.out.println(pClass1.getName());

		//���2
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		
		//���3
		Class pClass3=Class.forName("Chapter15.Person");
		System.out.println(pClass3.getName());
		
	
		
	}

}
