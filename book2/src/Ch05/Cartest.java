package Ch05;
/*
 * 날짜 : 2022/09/11
 * 이름 : 심규영
 * 내용 : 전기 자동차, P215
 */
public class Cartest {
	public static void main(String[] args) {
		Car car = Car.getInstance();
		car.drive();
		car.drive();
		
		car.dispDistance();
		car.dispBattery();
	}
}
