package Chapter22;

public class ThreadEx01_Main {

	public static void main(String[] args) {

		ThreadEx01 t=new ThreadEx01();
		t.start(); 
		//== t.run(); | �Ϲ������� ������ �Ʒ��� ���ʿ��� ���������� �����ϵǴ� ������ ��ġ�� �ʴ´�
		//t.run()�� �Ϲ� �޼ҵ� ȣ��� ���ֵǹǷ� �������� �������� ���� ���Ѵ�
		//Thread�� start�� ȣ��
		System.out.println("main ����");

	}

}
