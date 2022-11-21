package 이차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 내용 : N*M크기의 두 행령 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오
 * 날짜 : 2022/11/21
 * 이름 : 심규영
 * 
 *  - 입력
 *  	첫째 줄에 행렬의 크기 N과 M이 주어진다.
 *  	둘째 줄부터 N개의 줄에 행령 A의 원소 M개가 차례대로 주어진다.
 *  	이어서 N개의 줄에 행령 B의 원소 M개가 차례대로 주어진다.
 *  	(N,M <= 100), (행렬의 원소 <= 100)
 *  - 출력
 *  	첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다.
 *  	행렬의 각 원소는 공백으로 구분한다.
 */
public class _2738 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int [][] arr1 = new int[N][M];
		int [][] arr2 = new int[N][M];
		
		// arr1 값 넣기
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				arr1[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// arr2 값 넣기
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				arr2[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// arr1 + arr2 출력
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				int sum = arr1[i][j] + arr2[i][j];
				bw.write(sum+"");
				if(j+1 != M) {
					bw.write(" ");
				}
			}
			bw.write("\n");
		}
		
		// 출력
		bw.close();
		br.close();
	}
}
