package Chapter09.Car;

public class SportsCar extends Car {

	@Override
	public void speedUP() {
		speed += 10;
		System.out.println("speed : " + speed);

	}
	/*
	 * //finalÀÌ¹Ç·Î Override°¡ ¾ÈµÊ public void stop() {
	 * System.out.println("½ºÆ÷Ã÷Ä«°¡ ¸ØÃä´Ï´Ù."); speed=0; }
	 */

	public static void main(String[] args) {
		SportsCar ac = new SportsCar();

		ac.speedUP();
		ac.stop();

	}

}
