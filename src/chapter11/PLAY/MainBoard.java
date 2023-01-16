package chapter11.PLAY;

public class MainBoard {

	public static void main(String[] args) {
		//Beginner level
		Player player=new Player();
		player.play(1);
		
		//Advanced level
		AdvancedLevel aLevel=new AdvancedLevel();
		player.ugradeLevel(aLevel);
		player.play(2);
		
		//Super level
		SuperLevel sLevel=new SuperLevel();
		player.ugradeLevel(sLevel);
		player.play(3);
		
	}

}
