package Chapter20;

public class ArrayExceptionMain {

	public static void main(String[] args) {

		int[] arr = new int[5];

		try {
			for (int i = 0; i <= 5; i++) {
				arr[i] = i + 1;
				System.out.print(arr[i] + " ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println(e);
		} finally { // �����߻� ���� ������� ������ ����
			System.out.println("Finally!!");
		}
		System.out.println();
		System.out.println("���α׷� ���� ");
	}

}
