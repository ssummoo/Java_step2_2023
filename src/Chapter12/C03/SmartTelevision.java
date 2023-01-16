package Chapter12.C03;

public class SmartTelevision implements Remote, Searchable{

	private int volume;
	
	

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > Remote.MAX_VOLUME) {
			this.volume=Remote.MAX_VOLUME;
		}else if(volume<Remote.MIN_VOLUME) {
			this.volume=Remote.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("���� TV VOLUME : "+this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url+"�� �˻��մϴ�.");
	}
	
}
