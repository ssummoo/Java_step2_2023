package Chapter09.Car;

public class Car {

	public int speed;

	public void speedUP() {
		speed += 1;

	}

	// Override 제한
	public final void stop() {
		System.out.println("자동차가 멈춥니다.");
		speed = 0;

	}
}
