package Step09;
/*
 * 날짜 : 2022/09/13
 * 이름 : 심규영
 * 내용 : 백준 9단계 2번째 문제, 수 정렬하기 2, 2751
 * 		카운트 정령 알고리즘
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		boolean[] arr = new boolean [2000001];
		
		for (int i = 0; i < N; i++) {
			arr[Integer.parseInt(br.readLine()) + 1000000] = true;
		}
		
		for (int i = 0; i < 2000001; i++) {
			if(arr[i]) {
				sb.append(i-1000000).append('\n');
			}
		}
		
		System.out.println(sb);
		
	}
}
