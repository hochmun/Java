package 입출력과_사칙연산;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 심규영
 * 내용 : 백준 1단계 12번째 문제, 곱셈
 */
public class _12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int c = b / 100;
		int d = b/10 - c*10;
		int e = b - c*100 - d*10;
		System.out.println(a*e);
		System.out.println(a*d);
		System.out.println(a*c);
		System.out.println(a*b);
	}
}
