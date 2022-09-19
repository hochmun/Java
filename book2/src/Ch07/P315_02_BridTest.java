package Ch07;
/*
 * 날짜 : 2022/09/19
 * 이름 : 심규영
 * 내용 : Programming 2번 문제
 */
interface Animal {
	void walk();
	void fly();
	void sing();
}

class Bird implements Animal {

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
		System.out.println("노래할 수 있음, ");
	}
	
}

public class P315_02_BridTest {
	public static void main(String[] args) {
		Animal bird = new Bird();
		System.out.print("Bird는 ");
		bird.walk();
		bird.fly();
		bird.sing();
	}
}
