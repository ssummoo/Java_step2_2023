package Chapter09.Car;

public class SportsCar extends Car {

	@Override
	public void speedUP() {
		speed += 10;
		System.out.println("speed : " + speed);

	}
	/*
	 * //final�̹Ƿ� Override�� �ȵ� public void stop() {
	 * System.out.println("������ī�� ����ϴ�."); speed=0; }
	 */

	public static void main(String[] args) {
		SportsCar ac = new SportsCar();

		ac.speedUP();
		ac.stop();

	}

}
