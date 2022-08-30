package Ch06;
/*
 * 날짜 : 2022/08/30
 * 이름 : 심규영
 * 내용 : 버스 클래스 구현하기, P177
 */
public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus (int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("버스 "+busNumber+"번의 승객은 "+passengerCount+"명이고, 수입은 "+money+"입니다.");
	}
}
