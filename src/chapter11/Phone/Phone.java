package chapter11.Phone;

public abstract class Phone {

	public String owner;
	//��ӽ� �θ��� �����ڸ� ����ؾ���
	public Phone(String owner) {
		this.owner = owner;
	}

	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}

	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}
