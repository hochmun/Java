package Ch03;
/*
 * 날짜 : 2022/09/01
 * 이름 : 심규영
 * 내용 : 점수 평균 구하기, P108
 */
import java.util.Scanner;

public class Averager {
	public static void main(String[] args) {
		int total = 0, count = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("점수를 입력하시오: ");
			int grade = sc.nextInt();
			if (grade < 0) break;
			total += grade;
			count++;
		}
		System.out.println("평균은 "+ total / count);
	}
}
