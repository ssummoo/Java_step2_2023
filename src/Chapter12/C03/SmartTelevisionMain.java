package Chapter12.C03;

public class SmartTelevisionMain {

	public static void main(String[] args) {
		
	SmartTelevision tv =new SmartTelevision();
	
	tv.turnOn();
	tv.setVolume(10);
	tv.turnOff();
	tv.search("www.naver.com");
	System.out.println("===============");
	
	Remote rc=tv;
	//Remote 인터페이스에 정의되어있는 메소드만 오버라이딩된 메소드 대입
	rc.turnOn();
	rc.setVolume(-7);
	rc.turnOff();
	//rc.search("www.google.com"); 
		System.out.println("===============");
	
	Searchable sc=tv; 
	//Searchable 인터페이스에 있는 변수만 사용가능
	//sc.turnOn();
	//sc.setVolume(5);
	//sc.turnOff();
	sc.search("www.google.com");
	System.out.println("===============");
	
	
	
	
	
	
	}
}
