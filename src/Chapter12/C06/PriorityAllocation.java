package Chapter12.C06;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("���� ����� ���� ������� ��⿭���� �����ɴϴ�.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� Skill ���� ���� ���� �������� �켱������ ����ϱ�");
		
	}

}