package Chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args) {

		FileInputStream fis=null;
		//�ݵ�� try catch ����Ͽ� ����ó��
		//fis=new FileInputStream("a.txt");
		try {
			fis=new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Fianlly");
		}
		System.out.println("END");
	}

}
