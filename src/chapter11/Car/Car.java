package chapter11.Car;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
		
	public void StartCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	//���ø� �޼ҵ�(�����ǰ� �ȵǰ� ����)
	public final void run() {
		StartCar();
		drive();
		stop();
		turnOff();
	}	
	
}
