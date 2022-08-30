package sub5;

public class Sedan extends Car {
	//속성
	private int cc;
	
	//생성자
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc;
	}
	
	//기능
	public void speedTurbo() {
		this.speed += 20;
	}
	
	public void show() {
		System.out.println("차량명 : "+name);
		System.out.println("차량색 : "+color);
		System.out.println("차량속도 : "+speed);
		System.out.println("배기량 : "+cc);
	}
}
