package Chapter21.inputStream;

import java.io.IOException;

public class SystemTest2 {

	public static void main(String[] args) {

		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		int i;
		try {
			i=System.in.read();
			System.out.println(i);  //ASCII 코드
			System.out.println((char)i);//char
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

}
