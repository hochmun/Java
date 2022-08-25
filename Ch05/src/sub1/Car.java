package sub1;
/*
 * 날짜 : 2022/08/25
 * 이름 : 심규영
 * 내용 : 자바 클래스 실습하기
 */
public class Car {
	// 속성
	String name;
	String color;
	int speed;
	// 기능
	public void speedUp(int speed) {
		this.speed += speed;
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	public void show() {
		System.out.println("차량명 : "+name);
		System.out.println("차량색 : "+color);
		System.out.println("현재속도 : "+speed);
	}
}
