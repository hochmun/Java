package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/09/26
 * 이름 : 심규영
 * 내용 : 백준 9단계 3번째 문제, 수 정렬하기 3, 10989
 * 
 *  첫째 줄에 수의 개수 N (1 <= N <= 10,000,000)
 *  두째 줄부터 N개의 줄에는 수가 주어진다. (0 < x <= 10,000)
 *  
 */
public class _03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		boolean[] arr = new boolean [20000001];
		int [] arr2 = new int [20000001];
		
		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			arr[x + 10000000] = true;
			arr2[x + 10000000] ++;
		}
		
		for (int i = 0; i < 20000001; i++) {
			while(arr[i] && arr2[i] > 0) {
				sb.append(i-10000000).append('\n');
				arr2[i]--;
			}
		}
		
		System.out.println(sb);
	}
}
