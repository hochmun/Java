package Ch03;
/*
 * 날짜 : 2022/08/30
 * 이름 : 심규영
 * 내용 : 팩토리얼 계산하기, P100
 */
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		long fact = 1;
		int n;
		
		System.out.print("정수를 입력하시오:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		for(int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		
		System.out.printf("%d!은 %d입니다.\n", n, fact);
	}
}
