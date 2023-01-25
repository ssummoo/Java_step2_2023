package Chapter21.decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {

		//FileInputStream : ����� ������ ����
		try (InputStreamReader isr=new InputStreamReader(new FileInputStream("reader.txt"))){
			//System.in �� ����Ʈ ������ ó���� ����
			//InputStreamReader is2r=new InputStreamReader(System.in);
			
			int i ;
			while((i=isr.read()) != -1) {
				System.out.println((char)i);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		/*
		 * 
		//Socket�� ��
		Socket socket=new Socket();
		
		try{
			InputStreamReader ir= new InputStreamReader(socket.getInputStream());
			//���پ� �о���̱�
			BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			br.readLine();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		 */
		
	}

}
