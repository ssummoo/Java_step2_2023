package chapter11.Animal;

public abstract class Animal {//추상클래스

	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");		
	}
	//추상메소드
	public abstract void sound();
}
