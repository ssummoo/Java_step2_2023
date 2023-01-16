package chapter11.PLAY;

public class SuperLevel extends PlayLevel {

	@Override
	public void run() {
		System.out.println("RUN FASTER");

	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("HIGH JUMP");

	}

	@Override
	public void turn() {
		System.out.println("TURN");

	}

	@Override
	public void showLevelMessage() {
		System.out.println("SUPER LEVEL");

	}
}