package Chapter21.inputStream;

import java.io.IOException;

public class SystemTest2 {

	public static void main(String[] args) {

		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������");
		int i;
		try {
			i=System.in.read();
			System.out.println(i);  //ASCII �ڵ�
			System.out.println((char)i);//char
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

}
