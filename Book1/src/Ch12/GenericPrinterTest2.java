package Ch12;
/*
 * 날짜 : 2022/09/16
 * 이름 : 심규영
 * 내용 : <T extends 클래스> 테스트하기, P399
 */
public class GenericPrinterTest2 {
	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		powderPrinter.printing();
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		plasticPrinter.printing();
	}
}
