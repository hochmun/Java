package Ch05;

public class Car {
	private int battery = 100, distance = 0;
	
	private static Car instance = new Car();
	private Car () {}
	
	public static Car getInstance() {
		return instance;
	}
	
	public void drive () {
		distance += 1;
		battery -= 10;
	}
	
	public void dispDistance() {
		System.out.println("주행거리 " + distance + "km");
	}
	
	public void dispBattery() {
		System.out.println("배터리 " + battery + "%");
	}
	
}
