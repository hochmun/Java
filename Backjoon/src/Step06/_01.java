package Step06;
/*
 * 날짜 : 2022/08/23
 * 이름 : 심규영
 * 내용 : 백준 6단계 1번째 문제, 아스키 코드
 */
import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.nextLine().charAt(0);
		sc.close();
		int num = (int)a;
		System.out.println(num);
	}
}
