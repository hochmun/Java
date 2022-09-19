package Ch14;
/*
 * 날짜 : 2022/09/19
 * 이름 : 심규영
 * 내용 : AutoCloseable 인터페이스 구현하기
 */
public class P498_AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되었습니다");
	}

}
