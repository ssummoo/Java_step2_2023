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
	//Remote �������̽��� ���ǵǾ��ִ� �޼ҵ常 �������̵��� �޼ҵ� ����
	rc.turnOn();
	rc.setVolume(-7);
	rc.turnOff();
	//rc.search("www.google.com"); 
		System.out.println("===============");
	
	Searchable sc=tv; 
	//Searchable �������̽��� �ִ� ������ ��밡��
	//sc.turnOn();
	//sc.setVolume(5);
	//sc.turnOff();
	sc.search("www.google.com");
	System.out.println("===============");
	
	
	
	
	
	
	}
}
