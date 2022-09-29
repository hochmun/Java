package Step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

/*
 * 날짜 : 2022/09/29
 * 이름 : 심규영
 * 내용 : 백준 9단계 9번째 문제, 단어 정렬, 1181
 * 
 * 입력
 *  - 첫째 줄에 단어의 개수 N이 주어진다. (1 <= N <= 20,000)
 *  - 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한줄에 하나씩 주어진다.
 *  - 문자열의 길이는 50을 넘지 않는다.
 *  
 * 출력
 *  - 길이가 짧은 것부터
 *  - 길이가 같으면 사전 순으로
 *  - 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.
 */
public class _09 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<String>[] arr = new ArrayList[51];
		
		for (int i = 0; i <= 50; i++) {
			arr[i] = new ArrayList<String>();
		}
		
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			if(!arr[s.length()].contains(s)) {
				arr[s.length()].add(s);
			}
		}
		
		for (int i = 0; i < 51; i++) {
			if (arr[i].size() == 1) {
				sb.append(arr[i].get(0)).append('\n');
			} else if (arr[i].size() > 1) {
				arr[i].sort(Comparator.naturalOrder());
				for (int j = 0; j < arr[i].size(); j++) {
					sb.append(arr[i].get(j)).append('\n');
				}
			}
		}
		
		System.out.println(sb);
	}
}
