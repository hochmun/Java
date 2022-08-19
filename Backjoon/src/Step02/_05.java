package Step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 심규영
 * 내용 : 백준 2단계 5번째 문제, 알람 시계
 */
public class _05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		M -= 45;
		if(M < 0) {
			H -= 1;
			M += 60;
		}
		if(H<0) {
			H += 24;
		}
		System.out.println(H + " " + M);
	}
}
