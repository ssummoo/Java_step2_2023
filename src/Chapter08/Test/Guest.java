package Chapter08.Test;

public class Guest {
	//필드(멤버변수)
	private String name;
	private String gender;
	
	public String getPoint() {
		return Guide.point;
	}
	
	
	//생성자 생략
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
}
