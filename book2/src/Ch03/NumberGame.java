package Ch03;
/*
 * 날짜 : 2022/09/01
 * 이름 : 심규영
 * 내용 : miniProject 숫자 추측 게임, P123
 */
import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*100), count = 0;
		int guess;
		do {
			System.out.print("정답을 추측하여 보시오: ");
			guess = sc.nextInt();
			count++;
			if (guess < answer) {
				System.out.println("제시한 정수가 낮습니다.");
			} else if (guess > answer) {
				System.out.println("제시한 정수가 높습니다.");
			}
		} while (guess != answer);
		System.out.println("축하합니다. 시도횟수="+count);
		sc.close();
	}
}
