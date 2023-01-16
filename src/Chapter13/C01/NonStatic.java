package Chapter13.C01;

import javax.swing.JOptionPane;

class Out {

	// 필드
	static int a = 1;

	// 생성자

	// 메소드

	// 내부 클래스
	public class In {
		
		//필드
		
		//디폴트 생성자
		
		//메소드
		public String InFunc() {
			return (a+"번째 Non-Static 내부 실습");
		}
	}//Inner class

}//Outer class
	public class NonStatic {
		
		public static void main(String[] args) {
			//1. 바깥 클래스 객체
			Out obj1=new Out();
			//2. 내부 클래스 객체
			Out.In obj2=obj1.new In();
			//3. 내부 클래스 메소드
			String str=obj2.InFunc();
			
			JOptionPane.showMessageDialog(null, str+"\n Success");
		}
	}
