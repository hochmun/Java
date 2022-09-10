package Step10;
/*
 * 날짜 : 2022/09/07
 * 이름 : 심규영
 * 내용 : 백준 9단계 2번째 문제, 피보나치 수 5
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(f(n));
	}
	
	public static int f(int n) {
		if(n < 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return f(n-1) + f(n-2);
		}
	}
}
