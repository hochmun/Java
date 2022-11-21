package 반복문;
/*
 * 날짜 : 2022/08/20
 * 이름 : 심규영
 * 내용 : 백준 3단계 9번째 문제, 별 찍기 - 2
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _09 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for(int i = 1; i <= N; i++) {
			for(int n = N-i; n >= 1; n--) {
				bw.write(" ");
			}
			for(int j = 1; j <= i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.close();
	}
}
