package Chapter16.generic2;

public class ThreeDPrinterMain {

	public static void main(String[] args) {
		//���1
		ThreeDPrinter printPowder= new ThreeDPrinter();
		Powder p1=new Powder();
		printPowder.setMaterial(p1);
		System.out.println(p1);
		//���2
		Powder p2=(Powder)printPowder.getMaterial();  //Object Type�� Power Type���� DownCasting
		System.out.println(p2);
		//���1
		ThreeDPrinter printPlastic= new ThreeDPrinter();
		Plastic p3=new Plastic();
		printPlastic.setMaterial(p3);
		System.out.println(p3);
		//���2
		Plastic p4=(Plastic)printPlastic.getMaterial();  //Object Type�� Power Type���� DownCasting
		System.out.println(p4);
		
		
	}

}
