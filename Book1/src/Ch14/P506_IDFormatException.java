package Ch14;
/*
 * 날짜 : 2022/09/20
 * 이름 : 심규영
 * 내용 : 사용자 정의 예외 구현하기
 */
public class P506_IDFormatException extends Exception {
	public P506_IDFormatException (String message) {
		super(message);
	}
}
