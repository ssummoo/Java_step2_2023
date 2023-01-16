package Chapter10.C03;

public class SupersonicAirplaneMain {

	public static void main(String[] args) {

		SupersonicAirplane sa=new SupersonicAirplane();
		sa.takeoff();
		sa.fly();
		sa.flymode=SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flymode=SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();

	}

}
