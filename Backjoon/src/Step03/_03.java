package Step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 심규영
 * 내용 : 백준 3단계 3번째 문제, 합
 */
public class _03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int n = sc.nextInt(); n > 0; n--) {
			sum += n;
		}
		sc.close();
		System.out.println(sum);
	}
}
