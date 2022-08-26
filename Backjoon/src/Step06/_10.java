package Step06;
/*
 * 날짜 : 2022/08/26
 * 이름 : 심규영
 * 내용 : 백준 6단계 10번째 문제, 그룹 단어 체커
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int WordNum = Integer.parseInt(br.readLine());
		boolean [] alphabet = new boolean [26]; // 알파벳 체크
		int GroupWordNum = 0; // 그룹단어 갯수
		for(int i = 0; i < WordNum; i++) {
			String word = br.readLine(); // 단어 받기
			boolean no = false; // 그룹단어 체크용
			for(int j = 0; j < word.length(); j++) {
				while(j < word.length()-1) { // 마지막 단어 전까지 반복
					if(word.charAt(j) == word.charAt(j+1)) { // 연속된 단어가 끝날때 까지 반복
						j++;
					} else if(word.charAt(j) != word.charAt(j+1)) {
						
						int ASC = (int)word.charAt(j)-97; //아스키코드 변형
						
						if(alphabet [ASC] == false) {
							alphabet [ASC] = true; // 나온 알파벳 체크
							j++;
						} else {
							no = true; // 그룹단어 아님 체크
							break;
						}
					}
				}
				if (j == word.length()-1) { // 마지막 단어 체크
					int ASC = (int)word.charAt(j)-97;
					if(alphabet [ASC] == false) {
						alphabet [ASC] = true; // 나온 알파벳 체크
					} else {
						no = true;
					}
				}
				
				if (no == false) {
					GroupWordNum++; // 그룹단어 카운트
				} else {
					break;
				}
			}
			Arrays.fill(alphabet, false); // 알파벳 체크 초기화
		}
		System.out.println(GroupWordNum); // 그룹단어 갯수 출력
	}
}
