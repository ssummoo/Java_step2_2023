package Chapter16.generic2;

public class ThreeDPrinterMain {

	public static void main(String[] args) {
		//规过1
		ThreeDPrinter printPowder= new ThreeDPrinter();
		Powder p1=new Powder();
		printPowder.setMaterial(p1);
		System.out.println(p1);
		//规过2
		Powder p2=(Powder)printPowder.getMaterial();  //Object Type阑 Power Type栏肺 DownCasting
		System.out.println(p2);
		//规过1
		ThreeDPrinter printPlastic= new ThreeDPrinter();
		Plastic p3=new Plastic();
		printPlastic.setMaterial(p3);
		System.out.println(p3);
		//规过2
		Plastic p4=(Plastic)printPlastic.getMaterial();  //Object Type阑 Power Type栏肺 DownCasting
		System.out.println(p4);
		
		
	}

}
