package Ch03;
/*
 * 날짜 : 2022/08/30
 * 이름 : 심규영
 * 내용 : 짝수와 홀수 구별하기, P89
 */
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		number = sc.nextInt();
		sc.close();
		if (number % 2 == 0) {
			System.out.println("입력된 정수는 짝수입니다.");
		} else {
			System.out.println("입력된 정수는 홀수입니다.");
		}
	}
}
