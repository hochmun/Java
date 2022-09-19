package Ch07;
/*
 * 날짜 : 2022/09/19
 * 이름 : 심규영
 * 내용 : Programming 3번 문제
 */
interface Animal2 {
	void walk();
	void fly();
	void sing();
}

interface Drawable3 {
	void draw();
}

class Duck implements Animal2, Drawable3 {

	@Override
	public void draw() {
		System.out.print("그릴 수 있음");
	}

	@Override
	public void walk() {
		System.out.print("걸을 수 있음, ");
	}

	@Override
	public void fly() {
		System.out.print("날 수 있음, ");
	}

	@Override
	public void sing() {
		System.out.print("노래할 수 있음, ");
	}
	
}

public class P315_03_DuckTest {
	public static void main(String[] args) {
		Duck duck = new Duck();
		System.out.print("Duck은 ");
		duck.walk();
		duck.fly();
		duck.sing();
		duck.draw();
	}
}
