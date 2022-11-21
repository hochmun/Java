package 문자열;

import java.util.Arrays;
import java.util.Scanner;

public class _05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next(); // 문자 입력
		sc.close();
		// 알파뱃 횟수 카운팅용 배열
		int [] alphabet = new int [26];
		// 문자 길이 만큼 반복
		for(int i = 0; i < word.length(); i++) {
			// 문자열 나누기
			char ch = word.charAt(i);
			// 아스키코드로 변형
			int ASC = (int)ch;
			// 대소문자 구분해서 알파벳 위치 지정
			if(ASC >= 65 && ASC <= 90) {
				ASC -= 65; // 대문자
			} else {
				ASC -= 97; // 소문자
			}
			// 해당 알파벳 카운팅
			alphabet[ASC]++;
		}
		// 최대값
		int max = Arrays.stream(alphabet).max().getAsInt();
		// 최대값 중복 카운트
		int count = 0;
		int max_alphabet = 0; // 최대값 알파벳 위치 기록용
		for(int i = 0; i < alphabet.length; i++) {
			if(alphabet[i] == max) {
				count++;
				max_alphabet = i;
			}
		}
		if(count >= 2) {
			System.out.println("?");
		} else {
			System.out.println((char)(max_alphabet+65));
		}
	}
}