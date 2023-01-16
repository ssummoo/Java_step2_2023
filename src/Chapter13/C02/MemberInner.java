package Chapter13.C02;

public class MemberInner {

	int a=10;
	private int b=100;
	static int c=200;
	
	//생성자
	
	//메소드
	
	//내부클래스
	
	class Inner{
		//필드명
		
		//생성자
		
		//메소드
		public void printData() {
			System.out.println("int a : "+a);
			System.out.println("private int b : "+b);
			System.out.println("static int c : "+c);
		}
	}
	
	
	public static void main(String[] args) {
		//외부
		//MemberInner outer=new MemberInner();
		//내부
		//MemberInner.Inner Inner=outer.new Inner();
		//MemberInner.Inner Inner=outer.new Inner();
		//한줄로
		MemberInner.Inner inner= new MemberInner().new Inner();
		
		inner.printData();
	}

}
