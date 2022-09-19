package Ch07;
/*
 * 날짜 : 2022/09/19
 * 이름 : 심규영
 * 내용 : Programming 5번 문제
 */
interface Animal3 {
	void bark();
}

public class P316_05_DogTest {
	public static void main(String[] args) {
		Animal3 dog = new Animal3() {
			public void bark() {
				System.out.println("컹컹");
			}
		};
		dog.bark();
	}
}
