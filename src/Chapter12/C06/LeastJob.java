package Chapter12.C06;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("�����ȭ�� ������� ��⿭���� �����ɴϴ�.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� �������� ���ų� ����� �ð��� ���� ���� �������� ���");
		
	}

}
