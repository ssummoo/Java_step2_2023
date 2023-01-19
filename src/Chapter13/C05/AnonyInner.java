package Chapter13.C05;

public class AnonyInner {

	public void test() {
		
		new TestInter() {//TestInter ti = new TestInter => ti.printData
			@Override
			public void printData() {
				System.out.println("화욜팅!");	
			}//추상메소드 구현			
		}.printData();
	}
	
	
	public static void main(String[] args) {
		AnonyInner in = new AnonyInner();
		in.test();
	}

}
