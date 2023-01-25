package Chapter21.inputStream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest03 {

	public static void main(String[] args) {

		try (FileInputStream fis=new FileInputStream("input2.txt")){
			
			byte[] bs=new byte[10]; //���۷� Ȱ��
			int i;
			
			while ((i = fis.read(bs)) != -1) {
				//�����б� : 10���� Garbage�� ���
				for(byte b: bs) {
					System.out.print((char) b + " ");
				}//10�� ��� �Ϸ�
				System.out.println(" : "+i+"����Ʈ ����");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("END");
	}

}
