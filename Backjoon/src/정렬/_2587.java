package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 내용 : 5개의 수의 평균과 중앙값을 구하는 문제
 * 날짜 : 2022/11/21
 * 이름 : 심규영
 * 
 *  - 입력
 *  	첫째 줄부터 다섯 번째 줄까지 한 줄에 하나씩 자연수가 주어진다
 *  	주어지는 자연수는 100보다 작은 10의 배수이다.
 *  - 출력
 *  	첫째 줄에는 평균을 출력하고, 둘째 줄에는 중앙값을 출력한다.
 *  	평균과 중앙값은 모두 자연수이다.
 */
public class _2587 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [] arr = new int [11];
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			int number = Integer.parseInt(br.readLine());
			arr[number/10]++;
			sum += number;
		}
		
		final int avg = sum/5;
		int mid = 0;
		int count = 3;
		
		for (int i = 0; i < 11 && count > 0 ; i++) {
			while(arr[i] > 0 && count > 0) {
				arr[i]--;
				count--;
				mid = i;
			}
		}
		
		System.out.print(avg+"\n"+mid*10);
	}
}
