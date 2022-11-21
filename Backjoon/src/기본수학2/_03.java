package 기본수학2;
/*
 * 날짜 : 2022/09/06
 * 이름 : 심규영
 * 내용 : 백준 8단계 3번째 문제, 소인수분해
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 2; i <= N; i++) {
			if(N%i == 0) {
				sb.append(i+System.getProperty("line.separator"));
				N = N/i;
				i--;
			}
		}
		
		System.out.println(sb);
	}
}
