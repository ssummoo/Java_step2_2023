package Chapter13.C01;

import javax.swing.JOptionPane;

	class Out2 {
		
		static int a = 1;
		int b;

	static class In {// public 생략

		String Infunc() {

			return (a + "번째 static 내부 클래스");
		}

	}
}

public class EmbedMain {

	public static void main(String[] args) {
		
		//static은 클래스명으로 직접 접근이 가능함
		
		Out2.In obj2= new Out2.In();
		//2. 내부에 있는 메소드 
		String str=obj2.Infunc();
		JOptionPane.showMessageDialog(null, str);
	}

}
