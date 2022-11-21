package 문자열;
/*
 * 날짜 : 2022/08/24
 * 이름 : 심규영
 * 내용 : 백준 6단계 3번째 문제, 알파벳 찾기
 */
import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		int [] abc = new int [26];
		for(int i = 0; i < 26; i++) {
			abc[i] = -1;
		}
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			int n = (int)ch - 97;
			if(abc[n] == -1) {
				abc [n] = i;
			}
		}
		for(int i = 0; i < 26; i++) {
			System.out.print(abc[i]+" ");
		}
	}
}
