package Chapter19.Lambda;

public class TestStringConcat {

	public static void main(String[] args) {

		String s1="Hell";
		String s2="World";
		
		//인스턴스 변수
		System.out.println("----인스턴스 변수----");
		
		StringConcatImple concat1= new StringConcatImple();
		concat1.makeString(s1, s2);
		
		//Lambda식
		System.out.println("====Lamda 식====");
		StringConcat concat2=(s,v)-> System.out.println(s+", "+v);
		concat2.makeString(s1, s2);
		
		//익명의 내부클래스
		System.out.println("----익명의 내부클래스----");
		StringConcat concat3=new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+", "+s2);
				
			}
		};
		concat3.makeString(s1, s2);
	}

}
