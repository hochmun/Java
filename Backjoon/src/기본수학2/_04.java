package 기본수학2;
/*
 * 날짜 : 2022/09/07
 * 이름 : 심규영
 * 내용 : 백준 8단계 4번째 문제, 소수 구하기
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _04 {
	
	public static boolean[] prime;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		make__prime(N);
		
		for (int i = M; i <= N; i++) {
			if(prime[i] == false) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
	// 에라토스테네스의 체
	public static void make__prime(int N) {
		
		prime = new boolean[N + 1];
		
		if (N < 2) {
			return;
		}
		
		prime[0] = prime[1] = true;
		
		for (int i = 2; i <= Math.sqrt(N); i++) {
			
			if (prime[i] == true) {
				continue;
			}
			
			for (int j = i*i; j < prime.length; j = j+i) {
				prime[j] = true;
			}
		}
	}
}
