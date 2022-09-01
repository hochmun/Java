package Ch04;
/*
 * 날짜 : 2022/09/01
 * 이름 : 심규영
 * 내용 : DeskLamp 클래스 작성하고 객체 생성해보기, P150
 */
public class DeskLampTest {
	public static void main(String[] args) {
		DeskLamp myLamp = new DeskLamp();
		
		myLamp.turnOn();
		System.out.println(myLamp);
		myLamp.turnOff();
		System.out.println(myLamp);
	}
}
