package Step04;
/*
 * 날짜 : 2022/08/20
 * 이름 : 심규영
 * 내용 : 백준 4단계 1번째 문제, 최소, 최대
 */
import java.util.Arrays;
import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] N = new int[sc.nextInt()];
		for(int i = 0; i < N.length; i++) {
			N[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(N);
		System.out.println(N[0] + " " + N[N.length-1]);
	}
}