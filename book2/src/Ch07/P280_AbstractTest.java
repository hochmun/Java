package Ch07;
/*
 * 날짜 : 2022/09/18
 * 이름 : 심규영
 * 내용 : 추상 메소드의 예, P280
 */
abstract class Shape {
	int x, y;
	// 추상 클래스라고 하더라도 추상 메소드가 아닌 보통의 메소드도 가질 수 있음
	public void translate (int x, int y) {
		this.x = x;
		this.y = y;
	}
	// 추상 메소드를 선언한다. 추상 메소드를 하나라도 가지면 추상 클래스가 된다.
	// 추상 메소드를 가지고 있는데도 abstract를 class 앞에 붙이지 않으면 컴파일
	// 오류가 발생한다.
	public abstract void draw();
}

class Rectangle extends Shape {
	int width, height;
	
	//자식 클래스에서 추상 메소드를 구현하기 않으면 컴파일 오류가 발생한다.
	@Override
	public void draw() {
		System.out.println("사각형 그리기 메소드");
	}
}

class Circle extends Shape {
	int radius;

	@Override
	public void draw() {
		System.out.println("원 그리기 메소드");
	}
}

public class P280_AbstractTest {
	public static void main(String[] args) {
		//추상 클래스로 객체를 생성할 수는 없다.
		//Shape s1 = new Shape();
		Shape s2 = new Circle();
		s2.draw();
	}
}
