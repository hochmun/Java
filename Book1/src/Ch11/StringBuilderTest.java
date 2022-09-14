package Ch11;
/*
 * 날짜 : 2022/09/14
 * 이름 : 심규영
 * 내용 : StringBuilder 클래스 예제, P373
 */
public class StringBuilderTest {
	public static void main(String[] args) {
		String javaStr = new String("Java");
		//인스턴스가 처음 생성됐을 때 메모리 주소
		System.out.println("javaStr 문자열 주소 :"+System.identityHashCode(javaStr));
		
		//String으로부터 StringBuilder생성
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 메모리 주소:"+System.identityHashCode(buffer));
		
		//문자열 추가
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!");
		System.out.println("연산 후 buffer 메모리 주소:"+System.identityHashCode(buffer));
		
		//String 클래스로 반환
		javaStr = buffer.toString();
		System.out.println(javaStr);
		System.out.println("연결된 javaStr 문자열 주소 :"+System.identityHashCode(javaStr));
		
	}
}
