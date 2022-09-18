package Ch07;
/*
 * 날짜 : 2022/09/18
 * 이름 : 심규영
 * 내용 : 예제 7-4 디폴트 메소드 예제
 */
interface Drawable2 {
	void draw();
	// 다시 정의할 수도 있고, 아니면 기본 구현을 그대로 사용해도 된다.
	public default void getSize() {
		System.out.println("1024X768 해상도");
	}
}

class Circle3 implements Drawable2 {
	int radius;
	@Override
	public void draw() {
		System.out.println("Circle Draw");
	}
	
	@Override
	public void getSize() {
		System.out.println("3000X2000 해상도");
	}
	
}

public class P294_TestClass {
	public static void main(String[] args) {
		Drawable2 d = new Circle3();
		d.getSize();
		d.draw();
	}
}
