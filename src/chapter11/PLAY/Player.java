package chapter11.PLAY;

public class Player  {

	private PlayLevel level;
	
	public  Player() {
		level=new BeginnerLevel();
		level.showLevelMessage();
		//==> PlayLevel level=new BeginnerLevel();
	}
	public PlayLevel getLevel() {
		return level;
	}
	public void ugradeLevel(PlayLevel level) {
		this.level=level;
		level.showLevelMessage();
		
	}
	public void play(int count) {
		level.go(count);
	}
	
}
