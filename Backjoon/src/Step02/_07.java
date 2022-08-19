package Step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 심규영
 * 내용 : 백준 2단계 7번째 문제, 주사위 세개
 */
public class _07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int x;
		if(a == b && b == c) {
			x = 10000 + a * 1000;
		} else if (a == b && !(a == c)) {
			x = 1000 + a * 100;
		} else if (a == c && !(a == b)) {
			x = 1000 + a * 100;
		} else if (b == c && !(b == a)) {
			x = 1000 + b * 100;
		} else {
			int max = a;
			if(b > max) max = b;
			if(c > max) max = c;
			x = max * 100;
		}
		System.out.println(x);
	}
}
