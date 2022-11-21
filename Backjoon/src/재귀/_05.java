package 재귀;
/*
 * 날짜 : 2022/09/08
 * 이름 : 심규영
 * 내용 : 백준 9단계 4번째 문제, 별 찍기 - 10
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _05 {
	
	static char[][] arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		arr = new char [N][N];
		f(0, 0, N, false);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
	
	public static void f(int x, int y, int N, boolean B) {
		 
		if (B) {
			for (int i = x; i < x+N; i++) {
				for (int j = y; j < y+N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		if (N == 1) {
			arr[x][y] = '*';
			return;
		}
		
		int size = N/3;
		int count = 0;
		for (int i = x; i < x+N; i += size) {
			for (int j = y; j < y+N; j += size) {
				count++;
				if (count == 5) {
					f(i, j, size, true);
				} else {
					f(i, j, size, false);
				}
			}
		}
		
	}
	
}
