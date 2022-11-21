package 문자열;
/*
 * 날짜 : 2022/08/24
 * 이름 : 심규영
 * 내용 : 백준 6단계 4번째 문제, 문자열 반복
 */
import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스 개수
		for(int i = 0; i < T; i++) { // 테스트 횟수만큼 반복
			int R = sc.nextInt(); // 반복 횟수
			String S = sc.next(); // 문자열 입력
			for(int j = 0; j < S.length(); j++) { // 문자열 길이만큼 반복
				for(int k =0; k < R; k++) { // 반복 횟수 만큼 반복
					char ch = S.charAt(j); // 문자열의 j번째 단어를 ch에 입력
					System.out.print(ch); // j번째 단어을 반복횟수 만큼 출력
				}
			}
			System.out.println(); // 하나의 테스트케이스가 끝난뒤 줄바꿈
		}
		sc.close();
	}
}