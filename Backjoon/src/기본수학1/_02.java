package 기본수학1;
/*
 * 날짜 : 2022/08/26
 * 이름 : 심규영
 * 내용 : 백준 7단계 2번째 문제, 벌집
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 방번호
		int x = 2;
		if (N == 1) {
			System.out.println("1");
		}
		else {
			while(!(N <= f(x))) {
				x++;
			}
			System.out.println(x);
		}
	}
	
	public static int f(int x) {
		if (x <= 1) {
			return 1;
		} else {
			return f(x-1) + 6 * (x-1);
		}
	}
}
