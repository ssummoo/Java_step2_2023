package Chapter13.C06;

import java.util.Scanner;

public class EnumMain {

	public enum Item {
		Start, Pause, Exit
	} // 0,1,2

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("���ڸ� �Է��ϼ���[0:���ӽ���, 1:�Ͻ�����, 2:��������] ");

			int n = scan.nextInt();

			Item start = Item.Start; // Start�� 0
			Item pause = Item.Pause; // Pause�� 1
			Item Exit = Item.Exit; // Exit�� 2

			if (n == start.ordinal()) // n == 0
				System.out.println("������ ������");

			else if (n == pause.ordinal())
				System.out.println("������ �Ͻ�������");
			else
				System.out.println("������ �����");
				return;
		}

	}
}
