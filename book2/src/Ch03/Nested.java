package Ch03;
/*
 * 날짜 : 2022/08/30
 * 이름 : 심규영
 * 내용 : 다중 if-else문, P90
 */
import java.util.Scanner;

public class Nested {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int number = sc.nextInt();
		sc.close();
		if (number > 0) {
			System.out.println("양수입니다.");
		} else if (number == 0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("음수입니다.");
		}
	}
}
