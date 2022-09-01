package Ch04;
/*
 * 날짜 : 2022/09/01
 * 이름 : 심규영
 * 내용 : DeskLamp 클래스 작성하고 객체 생성해보기, P150
 */
public class DeskLamp {
	//속성
	private boolean isOn;
	
	//기능
	public void turnOn() {
		isOn = true;
	}
	
	public void turnOff() {
		isOn = false;
	}
	
	@Override
	public String toString() {
		return "현재 상태는 "+(isOn == true ? "켜짐" : "꺼짐");
	}
	
}
