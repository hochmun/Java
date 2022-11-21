package 반복문;
/*
 * 날짜 : 2022/08/20
 * 이름 : 심규영
 * 내용 : 백준 3단계 13번째 문제, 더하기 사이클
 */
import java.util.Scanner;

public class _13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int n = N;
		int cycle = 0;
		while(true) {
			int a = n / 10;
			int b = n - a*10;
			int c = a + b;
			int d = c / 10;
			int e = c - d*10;
			int f = b*10 + e;
			n = f;
			cycle++;
			if ( N == f) {
				break;
				}
			}
		System.out.println(cycle);
	}
}