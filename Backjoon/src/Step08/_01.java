package Step08;
/*
 * 날짜 : 2022/09/02
 * 이름 : 심규영
 * 내용 : 백준 8단계 1번째 문제, 소수 찾기
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _01 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // testcase
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0; // 소수가 아닌수 측정
		for(int i = 0; i < N; i++) { //testcase 만큼 반복
			int x = Integer.parseInt(st.nextToken());
			if(x == 1) { // 1은 소수가 아님
				count++;
				continue;
			}
			for(int j = 2; j < x; j++) {
				if(x%j == 0) {
					count++;
					break;
				}
			}
		}
		System.out.println(N - count);
	}
}
