package Step08;
/*
 * 날짜 : 2022/09/07
 * 이름 : 심규영
 * 내용 : 백준 8단계 6번째 문제, 골드바흐의 추측
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _06 {
	public static boolean[] prime = new boolean[10001];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		get_prime();
		
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			
			for (int j = n/2; j >= 2; j--) {
				if(!prime[j] && !prime[n-j]) {
					sb.append(j).append(' ').append(n-j).append('\n');
					break;
				}
			}
		}
		
		System.out.println(sb);
		
	}
	
	public static void get_prime() {
		
		prime[0] = prime[1] = true;
		
		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			
			if (prime[i]) {
				continue;
			}
			
			for (int j = i*i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
}
