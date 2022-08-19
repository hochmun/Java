package Step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 심규영
 * 내용 : 백준 3단계 4번째 문제, 영수증
 */
public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int sum = 0;
		for(int x = sc.nextInt(); x > 0; x--) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum += a*b;
		}
		sc.close();
		if( max == sum ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
