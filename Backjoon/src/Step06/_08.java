package Step06;
/*
 * 날짜 : 2022/08/25
 * 이름 : 심규영
 * 내용 : 백준 6단계 8번째 문제, 다이얼
 */
import java.util.Scanner;

public class _08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alphabet = sc.nextLine();
		sc.close();
		int time = 0; // 걸리는 시간
		for(int i = 0; i < alphabet.length(); i++) {
			char ch = alphabet.charAt(i);
			int ASC = (int)ch;
			if(ASC == 32) {
				time += 2;
			} else if (ASC >= 65 && ASC <= 67) {
				time += 3;
			} else if (ASC >= 68 && ASC <= 70) {
				time += 4;
			} else if (ASC >= 71 && ASC <= 73) {
				time += 5;
			} else if (ASC >= 74 && ASC <= 76) {
				time += 6;
			} else if (ASC >= 77 && ASC <= 79) {
				time += 7;
			} else if (ASC >= 80 && ASC <= 83) {
				time += 8;
			} else if (ASC >= 84 && ASC <= 86) {
				time += 9;
			} else if (ASC >= 87 && ASC <= 90) {
				time += 10;
			} else {
				time += 11;
			}
		}
		System.out.println(time);
	}
}
