package 기본수학1;
/*
 * 날짜 : 2022/08/28
 * 이름 : 심규영
 * 내용 : 백준 7단계 6번째 문제, 부녀회장이 될테야
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TestCase = Integer.parseInt(br.readLine());
		int apt [][] = new int [15][15];
		for (int i = 0; i < 15; i++) {
			apt[i][1] = 1;
			apt[0][i] = i;
		}
		for(int i = 1; i < 15; i++) {
			for (int j = 2; j < 15; j++) {
				apt[i][j] = apt[i][j-1] + apt[i-1][j];
			}
		}
		for (int i = 0; i < TestCase; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			System.out.println(apt[k][n]);
		}
	}
}
