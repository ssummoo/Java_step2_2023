package chapter11.Car;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율주행을 시작합니다.");
		System.out.println("핸들이 조작됩니다.");

	}

	@Override
	public void stop() {
		System.out.println("스스로 정지합니다.");	
		
	}
	

}
