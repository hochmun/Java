package Ch07;
/*
 * 날짜 : 2022/09/18
 * 이름 : 심규영
 * 내용 : 예제 7-3 다중 상속 예제
 */
class Shape2 {
	protected int x, y;
}

interface Drawable {
	void draw();
}

class Circle2 extends Shape2 implements Drawable {
	int radius;
	public void draw() {
		System.out.println("Circle Draw at ("+x+", "+y+")");
	}
}

public class P292_TestInterface3 {
	public static void main(String[] args) {
		Drawable obj = new Circle2();
		obj.draw();
	}
}
