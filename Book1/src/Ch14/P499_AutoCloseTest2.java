package Ch14;
/*
 * 날짜 : 2022/09/20
 * 이름 : 심규영
 * 내용 : try-with-resources문 사용하기(2)
 */
public class P499_AutoCloseTest2 {
	public static void main(String[] args) {
		try(P498_AutoCloseObj obj = new P498_AutoCloseObj()) {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("예외 부분입니다");
		}
	}
}
