package Step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 심규영
 * 내용 : 백준 3단계 2번째 문제, A+B - 3
 */
public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int T = sc.nextInt(); T > 0; T--) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}
		sc.close();
	}
}
