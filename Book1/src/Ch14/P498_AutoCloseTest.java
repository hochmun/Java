package Ch14;
/*
 * 날짜 : 2022/09/19
 * 이름 : 심규영
 * 내용 : try-with-resources문 사용하기(1)
 */
public class P498_AutoCloseTest {
	public static void main(String[] args) {
		try(P498_AutoCloseObj obj = new P498_AutoCloseObj()) {
		} catch(Exception e) {
			System.out.println("예외 부분입니다");
		}
	}
}
