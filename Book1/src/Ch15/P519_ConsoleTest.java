package Ch15;
/*
 * 날짜 : 2022/09/20
 * 이름 : 심규영
 * 내용 : Console 테스트하기
 * 
 * 이 예제를 실행하기 위해서는 명령 프롬프트 창을 띄우고 클래스가 컴파일 되어 있는
 * 프로젝트 폴더의 bin 폴더로 이동한 후 java Ch15.P519_ConsoleTest 라고 
 * 써서 실행 한다.
 */
import java.io.Console;

public class P519_ConsoleTest {
	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println("이름:");
		String name = console.readLine();
		System.out.println("직업:");
		String job = console.readLine();
		System.out.println("비밀번호:");
		char[] pass = console.readPassword();
		String strPass = new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}
}
