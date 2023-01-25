package Chapter21.inputStream;

import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest02 {

	public static void main(String[] args) {

		// �ѱ۱���
		// FileInputStream fis=null;
		FileReader fis = null;
		try {
			fis = new FileReader("input.txt");
			int i;
			// fis.read() : ������ ������ ������ -1�� return
			while ((i = fis.read()) != -1) {
				System.out.print((char) i + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
				// NullPointerException�� ���� ���ؼ� ����

			} catch (NullPointerException e) {
				System.out.println(e);

			}
		}
		System.out.println();
		System.out.println("END");
	}

}
