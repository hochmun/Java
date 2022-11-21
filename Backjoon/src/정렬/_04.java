package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/09/26
 * 이름 : 심규영
 * 내용 : 백준 9단계 4번째 문제, 커트라인, 25305
 * 
 *  첫째 줄에는 응시자의 수 N과 상을 받는 사람의 수 k가 공백을 사이에 두고 주어진다.
 *  둘째 줄에는 각 학생의 점수 x가 공백을 사이에 두고 주어진다.
 *  
 *  상을 받는 커트라인을 출력하라
 *  
 *  1 <= N <= 1,000
 *  1 <= k <= N
 *  0 <= x <= 10,000
 */
public class _04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 응시자의 수
		int N = Integer.parseInt(st.nextToken());
		// 상을 받는 사람의 수
		int k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		boolean [] arr = new boolean [20001];
		int [] arr2 = new int [20001];
		
		for (int i = 0; i < N; i ++) {
			int x = Integer.parseInt(st.nextToken());
			arr[x+10000] = true;
			arr2 [x+10000]++;
		}
		
		for (int i = 20000; i > 0; i--) {
			while (arr[i] && arr2[i] > 0 && k > 1) {
				k--;
				arr2[i]--;
			}
			if (arr[i] && arr2[i] > 0 && k == 1) {
				System.out.println(i-(10000));
				break;
			}
		}
	}
}
