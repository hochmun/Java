package 문자열;
/*
 * 날짜 : 2022/08/23
 * 이름 : 심규영
 * 내용 : 백준 6단계 2번째 문제, 숫자의 합
 */
import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numlen = sc.nextInt();
		String num = sc.next();
		sc.close();
		int sum = 0;
		for(int i = 0; i < numlen; i++) {
			sum += num.charAt(i)-'0'; // 간단하게 String 유형을 int 유형으로 바꾸는 방법
		}
		System.out.println(sum);
	}
}
