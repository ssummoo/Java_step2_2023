package Chapter19.Lambda;

public class TestStringConcat {

	public static void main(String[] args) {

		String s1="Hell";
		String s2="World";
		
		//�ν��Ͻ� ����
		System.out.println("----�ν��Ͻ� ����----");
		
		StringConcatImple concat1= new StringConcatImple();
		concat1.makeString(s1, s2);
		
		//Lambda��
		System.out.println("====Lamda ��====");
		StringConcat concat2=(s,v)-> System.out.println(s+", "+v);
		concat2.makeString(s1, s2);
		
		//�͸��� ����Ŭ����
		System.out.println("----�͸��� ����Ŭ����----");
		StringConcat concat3=new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+", "+s2);
				
			}
		};
		concat3.makeString(s1, s2);
	}

}
