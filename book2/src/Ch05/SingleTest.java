package Ch05;
/*
 * 날짜 : 2022/09/11
 * 이름 : 심규영
 * 내용 : 싱글톤 패턴, P207
 */
public class SingleTest {
	public static void main(String[] args) {
		Single obj1 = Single.getInstance();
		Single obj2 = Single.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
