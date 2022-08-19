package Step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 심규영
 * 내용 : 백준 2단계 6번째 문제, 오븐 시계
 */
public class _06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		B += C;
		while(B>59) {
			A += 1;
			B -= 60;
		}
		while(A>23) {
			A -= 24;
		}
		System.out.println(A + " " + B);
	}
}
