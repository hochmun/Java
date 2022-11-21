package 기본수학2;
/*
 * 날짜 : 2022/09/07
 * 이름 : 심규영
 * 내용 : 백준 8단계 5번째 문제, 베르트랑 공준
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _05 {
	public static boolean[] prime;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		while (n != 0) {
			make_prime(2*n);
			int count = 0;
			
			for (int i = n+1; i <= 2*n; i++) {
				if(prime[i] == false) {
					count++;
				}
			}
			
			sb.append(count).append("\n");
			n = Integer.parseInt(br.readLine());
		}
		
		System.out.println(sb);
	}
	
	public static void make_prime(int N) {
		
		prime = new boolean[N+1];
		
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
