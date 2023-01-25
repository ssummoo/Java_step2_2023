package Chapter19.Lambda;

interface PrintString{
	void showStirng(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		
//���ٽ�
		PrintString LambdaStr=s->System.out.println(s); //�Լ����� ���������� ��ü
		showMyString(LambdaStr);
		
		PrintString reStr=returnString();  //returnString()�޼ҵ�ȿ� �ִ� Lambda�� ������ ȣ��
		reStr.showStirng("hell ");
		
	}

	
	public static void showMyString(PrintString p) { // �Ű����� ���� | p�� body
		p.showStirng("Hell lamda");
	}
	
	public static PrintString returnString() {  //��ȯ������ body ����
		return s ->System.out.println(s+"World");
		
	}
}
