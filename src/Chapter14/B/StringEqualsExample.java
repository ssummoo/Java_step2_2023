package Chapter14.B;

public class StringEqualsExample {

	public static void main(String[] args) {

		String strVar1 = new String("ȫ�浿");
		String strVar2 = "ȫ�浿";

		if (strVar1 == strVar2) {// �ܺ�(�޸𸮰� ������ ��)
			System.out.println("���� String ��ü�� ����");
		} else {
			System.out.println("�ٸ� String ��ü�� ����");
		}

		if (strVar1.equals(strVar2)) { //����
			System.out.println("���� ���ڿ��� ����");
		} else {
			System.out.println("�ٸ� ���ڿ��� ����");
		}
	}

}
