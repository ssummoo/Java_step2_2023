package Chapter12.C06;

public class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("�����ȭ�� ������� ��⿭���� �����ɴϴ�.");		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("�������� �������� ����մϴ�.");		
	}

}
