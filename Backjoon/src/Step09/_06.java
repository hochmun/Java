package Step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/09/28
 * 이름 : 심규영
 * 내용 : 백준 9단계 6번째 문제, 소트인사이드, 1427
 *  
 *  입력
 *  
 *  첫째 줄에 정렬하려고 하는 수 N이 주어진다.
 *   N <= 1,000,000,000
 *   
 *  출력
 *  
 *  첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
 */
public class _06 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String N = br.readLine();
		String [] Narr = N.split("");
		int [] arr = new int [21];
		
		for (String s : Narr) {
			int a = Integer.parseInt(s);
			arr[a + 10]++;
		}
		
		for (int i = 20; i >= 0; i--) {
			while(arr[i] > 0) {
				sb.append(i-10);
				arr[i]--;
			}
		}
		
		System.out.print(sb);
	}
}
