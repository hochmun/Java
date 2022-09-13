package Ch05;
/*
 * 날짜 : 2022/09/11
 * 이름 : 심규영
 * 내용 : 정적 메소드 사용하기, P205
 */
public class Test {
	public static int cube (int x) {
		int result = x*x*x;
		return result;
	}
	public static void main(String[] args) {
		System.out.println("10*10*10은 "+cube(10));
	}
}
