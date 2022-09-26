package Step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * 날짜 : 2022/09/26
 * 이름 : 심규영
 * 내용 : 백준 9단계 5번째 문제, 통계학, 2108
 * 
 *  산술평균 : N개의 수들의 합을 N으로 나눈 값
 *  중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
 *  최빈값 : N개의 수들 중 가장 많이 나타나는 값
 *  범위 : N개의 수들 중 최댓값과 최솟값의 차이
 *  
 *  첫째 줄에 수의 개수 N (1 <= N <= 500,000)이 주어진다
 *  단, N은 홀수이다
 *  그 다음 N개의 줄에는 정수들이 주어진다
 *  입력되는 정수의 절댓값은 4,000을 넘지 않는다.
 *  
 *  첫째 줄에는 산술평균을 출력한다 (소수점 이하 첫째 자리에서 반올림한 값을 출력한다)
 *  둘째 줄에는 중앙값을 출력한다.
 *  셋째 줄에는 최빈값을 출력한다. (여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다)
 *  넷째 줄에는 범위를 출력한다. 
 */
public class _05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		
		boolean arr[] = new boolean [8001];
		int arr2[] = new int [8001];
		ArrayList<Integer> arr3 = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			arr[x+4000] = true;
			arr2[x+4000]++;
			sum += x;
		}
		
		// 산술평균
		int avg = sum / N ;
		
		// 최빈값
		int max = -1;
		int maxindex = 0;
		boolean swich;
		for (int i = 0; i < arr2.length; i++) {
			if(arr2[i] > max) {
				max = arr2[i];
				maxindex = i - 4000;
			}
			if(arr2[i] == max) {
				swich = true;
			}
		}
		if (swich) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] )
			}
		}
		
		
		for (int i = 0; i < 8001; i++) {
			while (arr[i] && arr2[i] > 0) {
				arr3.add(i-4000);
				arr2[i]--;
			}
		}
		
		// 중앙값
		int mid = arr3.get((N/2));
		
		// 범위
		int maxmin = arr3.get(N-1) - arr3.get(0);
		
		System.out.println(avg);
		System.out.println(mid);
		System.out.println(maxindex);
		System.out.println(maxmin);
	}
}
