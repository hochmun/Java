package Ch06;
/*
 * 날짜 : 2022/09/18
 * 이름 : 심규영
 * 내용 : programming 2번째 문제, P274
 */
class Animal3 {
	void walk() {
		System.out.println("걷을 수 있음");
	}
}

class Bird extends Animal3 {
	void fly() {
		System.out.println("날을 수 있음");
	}
	
	void sing() {
		System.out.println("노래 부를 수 있음");
	}
}

public class _02_AnimalTest {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}
}
