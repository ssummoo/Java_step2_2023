package Chapter21.outputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream02 {

	public static void main(String[] args) throws IOException{
		

		//FileOutputStream fos=new  FileOutputStream("output1.txt"); //��ü����
		FileOutputStream fos=new  FileOutputStream("output2.txt"); //Ư�� index �����ؼ� ����
		try (fos){
			byte[] bs=new byte[26];
			byte data=65; //A
					
			for(int i = 0; i<bs.length; i++) {
				bs[i]=data;
				data++;
			}
			
			//fos.write(bs);//�迭 �Ѳ����� ����
			fos.write(bs, 2, 10);	//�迭 2������� 10���� ���� 
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
		

	}

}
