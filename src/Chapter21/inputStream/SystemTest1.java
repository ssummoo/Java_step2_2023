package Chapter21.inputStream;

import java.io.IOException;

public class SystemTest1 {

	public static void main(String[] args) {

		System.out.println("���ĺ� �������� ���� [Enter]�� ��������");
		int i;
		try {
			while((i=System.in.read()) != '\n') {
			System.out.print((char)i+" ");  //����
			System.out.print(i+" "); //ASCII
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

}
