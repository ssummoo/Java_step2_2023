package chapter11.PLAY;

public class BeginnerLevel extends PlayLevel {

	@Override
	public void run() {
		System.out.println("RUN");

	}

	@Override
	public void jump() {
		System.out.println("CAN'T JUMP");
	}

	@Override
	public void turn() {

		System.out.println("CAN'T TURN");

	}

	@Override
	public void showLevelMessage() {
		System.out.println("BEGINNER LEVEL");
		// TODO Auto-generated method stub

	}

}
