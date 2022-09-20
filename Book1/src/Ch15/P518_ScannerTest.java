package Ch15;
/*
 * 날짜 : 2022/09/20
 * 이름 : 심규영
 * 내용 : Scanner 테스트하기
 */
import java.util.Scanner;

public class P518_ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름:");
		String name = scanner.nextLine();
		System.out.println("직업:");
		String job = scanner.nextLine();
		System.out.println("사번:");
		int num = scanner.nextInt();
		scanner.close();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
	}
}
