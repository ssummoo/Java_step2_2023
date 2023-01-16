package chapter11.PLAY;

public class AdvancedLevel extends PlayLevel {

	@Override
	public void run() {
		System.out.println("RUN FAST");

	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("JUMP");

	}

	@Override
	public void turn() {
		System.out.println("CAN'T TURN");

	}

	@Override
	public void showLevelMessage() {
		System.out.println("ADVANCED LEVEL");

	}

}
