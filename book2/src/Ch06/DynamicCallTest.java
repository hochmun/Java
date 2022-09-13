package Ch06;
/*
 * 날짜 : 2022/09/11
 * 이름 : 심규영
 * 내용 : 동물 다형성, P258
 */
class Animal2 {
	void speak() {
		System.out.println("Animal 클래스의 sound()");
	}
}

class Dog2 extends Animal2 {
	@Override
	void speak() {
		System.out.println("멍멍");
	}
}

class Cat2 extends Animal2 {
	@Override
	void speak() {
		System.out.println("야옹");
	}
}

public class DynamicCallTest {
	public static void main(String[] args) {
		Animal2 a1 = new Dog2();
		Animal2 a2 = new Cat2();
		
		a1.speak();
		a2.speak();
	}
}
