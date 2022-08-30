package Ch03;
/*
 * 날짜 : 2022/08/30
 * 이름 : 심규영
 * 내용 : 정확한 입력받기, P105
 */
import java.util.Scanner;

public class CheckInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		do {
			System.out.print("올바른 월을 입력하시오 [1-12]: ");
			month = sc.nextInt();
		} while (month < 1 || month > 12);
		sc.close();
		System.out.println("사용자가 입력한 월은 "+month);
	}
}
