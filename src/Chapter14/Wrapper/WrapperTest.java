package Chapter14.Wrapper;

import javax.swing.JOptionPane;

public class WrapperTest {

	public static void main(String[] args) {
		
		String str1="";
		String str2="";
		char ch=65; // A
		double num1, num2;
		
		//Wrapper : �⺻Ÿ���� ��ü�� ����
		//UnBoxing Wrapper
		num1=Double.parseDouble(JOptionPane.showInputDialog("��1"));
		num2=Double.parseDouble(JOptionPane.showInputDialog("��2"));
		
		if(num2 != 0) {
			System.out.println(num1/num2);
		}
		//isDigit : �������� �Ǵ��ϴ� Method
		
		if(Character.isDigit(ch)) {
			System.out.println(ch+"�� �����Դϴ�.");
		}else
			System.out.println(ch+"�� �����Դϴ�.");
	}

}
