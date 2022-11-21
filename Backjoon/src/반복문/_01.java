package 반복문;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 심규영
 * 내용 : 백준 3단계 1번째 문제, 구구단
 */
public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		for(int x = 1; x <= 9; x++) {
			System.out.println(N + " * " + x + " = " + N*x);
		}
	}
}
