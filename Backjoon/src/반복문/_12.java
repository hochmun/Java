package 반복문;
/*
 * 날짜 : 2022/08/20
 * 이름 : 심규영
 * 내용 : 백준 3단계 12번째 문제, A+B - 4
 */
import java.util.Scanner;

public class _12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while((sc.hasNext())) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		sc.close();
	}
}