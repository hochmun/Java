package exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _01 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// N 값 입력 받기
		int N = Integer.parseInt(br.readLine());
		//별을 N번째 줄까지 i번 줄에 i번 만큼 입력한다
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		// 출력
		System.out.println(sb);
	}
}
