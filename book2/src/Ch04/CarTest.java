package Ch04;
/*
 * 날짜 : 2022/09/05
 * 이름 : 심규영
 * 내용 : 자동차 클래스 작성, P178
 */
public class CarTest {
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.changeGear(1);
		myCar.speedUp();
		System.out.println(myCar);
	}

}
