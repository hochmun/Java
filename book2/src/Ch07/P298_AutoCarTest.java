package Ch07;
/*
 * 날짜 : 2022/09/18
 * 이름 : 심규영
 * 내용 : LAB 자율 주행 자동차
 */
public class P298_AutoCarTest {
	public static void main(String[] args) {
		P298_OperateCar obj = new P298_AutoCar();
		obj.start();
		obj.setSpeed(30);
		obj.turn(15);
		obj.stop();
	}
}
