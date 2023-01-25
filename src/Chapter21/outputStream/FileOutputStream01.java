package Chapter21.outputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {

	public static void main(String[] args) throws IOException{
		

		FileOutputStream fos=new  FileOutputStream("output1.txt");
		try (fos){
			byte[] bs=new byte[26];
			byte data=65; //A
					
			for(int i = 0; i<bs.length; i++) {
				bs[i]=data;
				data++;
			}
			
			fos.write(bs);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("저장이 완료 되었습니다.");
		

	}

}
