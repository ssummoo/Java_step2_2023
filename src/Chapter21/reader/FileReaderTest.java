package Chapter21.reader;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis=null;
		
		fis=new FileInputStream("reader.txt");
		
		int i;
		while((i=fis.read()) !=-1) {
			System.out.println((char)i);
		}
		fis.close();
		System.out.println("END");
				
	}

}
