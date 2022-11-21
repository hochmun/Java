package 재귀;
/*
 * 날짜 : 2022/09/07
 * 이름 : 심규영
 * 내용 : 백준 9단계 1번째 문제, 팩토리얼
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _01 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(f(N));
	}
	
	public static int f(int N) {
		if(N <= 1) {
			return 1;
		} else {
			return N * f(N-1);
		}
	}
}
