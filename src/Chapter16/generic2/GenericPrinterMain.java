package Chapter16.generic2;

public class GenericPrinterMain {

	public static void main(String[] args) {

		GenericPrinter<Powder> printPowder=new GenericPrinter<Powder>();
		printPowder.setMaterial(new Powder());
		Powder powder=printPowder.getMaterial();
		System.out.println(powder);
		powder.doprinting();
		System.out.println();
		
		GenericPrinter<Plastic> printPlastic=new GenericPrinter<Plastic>();
		printPlastic.setMaterial(new Plastic());
		Plastic plastic=printPlastic.getMaterial();
		System.out.println(plastic);
		plastic.doprinting();
		System.out.println();
		
		//물의 재료는 허용되면 안되지만 제네릭의 특성상 허용하는 모순이 발생한다.
		GenericPrinter<Water> printWater=new GenericPrinter<Water>();
		printWater.setMaterial(new Water());
		System.out.println(printWater);
		System.out.println();
		
		
		
	}
}
