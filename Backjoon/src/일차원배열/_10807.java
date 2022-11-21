package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 내용 : 총 N개의 정수가 주어졌을 때, 정수 v가 몇개인지 구하기
 * 날짜 : 2022/11/21
 * 이름 : 심규영
 * 
 * 	첫째 줄에 정수의 개수 N(1 <= N <= 100)
 *  둘째 둘에는 정수가 공백으로 구분되어 있다
 *  셋째 줄에는 찾으려고 하는 정수 v (-100 <= v <= 100)
 */
public class _10807 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(br.readLine());
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			if (Integer.parseInt(st.nextToken()) == v) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
