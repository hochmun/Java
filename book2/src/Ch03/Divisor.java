package Ch03;
/*
 * 날짜 : 2022/08/30
 * 이름 : 심규영
 * 내용 : 약수 계산하기, P101
 */
import java.util.Scanner;

public class Divisor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 입력하시오: ");
		int n = scan.nextInt();
		scan.close();
		System.out.println(n + "의 약수는 다음과 같습니다.");
		for (int i = 1; i <= n; ++i) {
			if (n % i == 0) {
				System.out.print(" "+i);
			}
		}
	}
}
