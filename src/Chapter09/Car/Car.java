package Chapter09.Car;

public class Car {

	public int speed;

	public void speedUP() {
		speed += 1;

	}

	// Override ����
	public final void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
		speed = 0;

	}
}
