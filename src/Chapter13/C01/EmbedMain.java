package Chapter13.C01;

import javax.swing.JOptionPane;

class Out2 {

	static int a = 1;
	int b;

	static class In {// public ����

		String Infunc() {

			return (a + "��° static ���� Ŭ����");
		}

	}
}

public class EmbedMain {

	public static void main(String[] args) {
		
		//static�� Ŭ���������� ���� ������ ������
		
		Out2.In obj2= new Out2.In();
		//2. ���ο� �ִ� �޼ҵ� 
		String str=obj2.Infunc();
		JOptionPane.showMessageDialog(null, str);
	}

}
