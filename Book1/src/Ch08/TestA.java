package Ch08;
/*
 * 날짜 : 2022/09/01
 * 이름 : 심규영
 * 내용 : 메서드 호출하기, P254
 */
public class TestA {
	int num;
	
	void aaa() {
		System.out.println("aaa() 출력");
	}
	
	public static void main(String[] args) {
		TestA a1 = new TestA();
		a1.aaa();
		TestA a2 = new TestA();
		a2.aaa();
	}
}
