package sub5;

public class Truck extends Car {
	
	//속성
	private int capacity;
	
	//생성자
	public Truck (String name, String color, int speed, int capacity) {
		super(name, color, speed);
		this.capacity = capacity;
	}
	
	//기능
	public void load(int capacity) {
		this.capacity += capacity;
	}
	
	public void show() {
		System.out.println("트럭명 : "+name);
		System.out.println("트럭색 : "+color);
		System.out.println("트럭속도 : "+speed);
		System.out.println("적재량 : "+capacity);
	}
	
}
