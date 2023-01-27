package Chapter22;

import java.util.Scanner;

public class ThreadCount implements Runnable {

	private int n;

	public ThreadCount(int n) {
		this.n = n;
	}

	public static void main(String[] args) {
		// ��ĳ�ʸ� �̿��Ͽ� Ű���忡�� ���ڸ� �Է¹ް�
		// �Է¹��� ���ڰ� 1�� �����ϴٰ� 0�̵Ǿ����� "����"��� �޼����� �Բ� Thread������������ ����

		// ��ĳ�ʸ� �̿��Ͽ� Ű���忡�� ���ڸ� �Է¹ް�
		System.out.print("���� �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		ThreadCount tc = new ThreadCount(num);
		// Thread ��ü �� ����
		Thread t = new Thread(tc);
		t.start();
	}

	// �Է¹��� ���ڰ� 1�� �����ϴٰ� 0�̵Ǿ����� "����"��� �޼����� �Բ� Thread������������ ����
	@Override
	public void run() {
		for (int i = n; i >= 0; i--) {
			try {
				System.out.print(i + " ");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("���α׷� ����");
	}

}
