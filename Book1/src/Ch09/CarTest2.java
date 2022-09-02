package Ch09;
/*
 * 날짜 : 2022/09/02
 * 이름 : 심규영
 * 내용 : 추상 클래스와 템플릿 메서드, P294
 */
public class CarTest2 {
	public static void main(String[] args) {
		System.out.println("=== 자율 주행하는 자동차 ===");
		Car2 myCar = new AiCar();
		myCar.run();
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		Car2 hisCar = new ManualCar();
		hisCar.run();
	}
}
