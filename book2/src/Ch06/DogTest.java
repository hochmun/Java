package Ch06;
/*
 * 날짜 : 2022/09/11
 * 이름 : 심규영
 * 내용 : Animal 클래스와 Dog 클래스 만들어보기, P228
 */
class Animal {
	int age;
	void eat() {
		System.out.println("먹고 있음...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("짖고 있음...");
	}
}

public class DogTest {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();
	}
}
