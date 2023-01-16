package Chapter10.C03;

public class SupersonicAirplane extends Airplane{

	//필드(전역변수, 변경할 수 없게 선언
	//NORMAL=1 SUPERSONIC=2
	public static final int NORMAL=1;
	public static final int SUPERSONIC=2;
	public int flymode=NORMAL; //1
	//오버라이딩을 이용하여 flymode가 SUPERSONIC이면 초음속비행입니다. 그렇지 않으면 Airplane의 fly를 실행한다.

	@Override
	public void fly() {
		if(flymode==SUPERSONIC) {
			System.out.println("초음속 비행입니다.");
		}else { 
			super.fly();	
		}
}
}
