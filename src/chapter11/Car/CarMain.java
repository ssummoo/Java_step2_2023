package chapter11.Car;

public class CarMain {
/*
 * 
	public static void main(String[] args) {
		method(new ManualCar());
		System.out.println("-----------");
		method(new AICar());
	}

	public static void method(Car car) {
		car.drive();
		car.stop();
 */
	
 public static void main(String[] args) {
	 System.out.println("-----------��������-----------");
	 Car mycar=new AICar();
	 mycar.run();
	 System.out.println("-----------�Ϲ�����-----------");
	 Car urcar=new ManualCar();
	 urcar.run();
}

}
