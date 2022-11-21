package 문자열;
/*
 * 날짜 : 2022/08/25
 * 이름 : 심규영
 * 내용 : 백준 6단계 9번째 문제, 크로아키아 알파벳
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _09 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		br.close();
		int AlphabetCount = 0;
		for(int i = 0; i < word.length(); i++) {
			char ch1 = word.charAt(i);
			if(i+1 == word.length()) {
				AlphabetCount++;
			} else if(i+3 <= word.length()) {
				if(ch1 == 'd' && word.charAt(i+1) == '-') {
					AlphabetCount++;
					i++;
				} else if(ch1 == 'l' && word.charAt(i+1) == 'j') {
					AlphabetCount++;
					i++;
				} else if(ch1 == 'n' && word.charAt(i+1) == 'j') {
					AlphabetCount++;
					i++;
				} else if(ch1 == 's' && word.charAt(i+1) == '=') {
					AlphabetCount++;
					i++;
				} else if(ch1 == 'z' && word.charAt(i+1) == '=') {
					AlphabetCount++;
					i++;
				} else if(ch1 == 'c' && (word.charAt(i+1) == '=' || word.charAt(i+1) == '-')) {
					AlphabetCount++;
					i++;
				} else if(ch1 == 'd' && word.charAt(i+1) == 'z' && word.charAt(i+2) == '=') {
					AlphabetCount++;
					i += 2;
				} else {
					AlphabetCount++;
				}
			} else {
				if(ch1 == 'd' && word.charAt(i+1) == '-') {
					AlphabetCount++;
					i++;
				} else if(ch1 == 'l' && word.charAt(i+1) == 'j') {
					AlphabetCount++;
					i++;
				} else if(ch1 == 'n' && word.charAt(i+1) == 'j') {
					AlphabetCount++;
					i++;
				} else if(ch1 == 's' && word.charAt(i+1) == '=') {
					AlphabetCount++;
					i++;
				} else if(ch1 == 'z' && word.charAt(i+1) == '=') {
					AlphabetCount++;
					i++;
				} else if(ch1 == 'c' && (word.charAt(i+1) == '=' || word.charAt(i+1) == '-')) {
					AlphabetCount++;
					i++;
				} else {
					AlphabetCount++;
				}
			}
		}
		System.out.println(AlphabetCount);
	}
}
