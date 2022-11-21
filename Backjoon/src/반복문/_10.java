package 반복문;
/*
 * 날짜 : 2022/08/20
 * 이름 : 심규영
 * 내용 : 백준 3단계 10번째 문제, X보다 작은 수
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st1.nextToken());
		int X = Integer.parseInt(st1.nextToken());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++) {
			int A = Integer.parseInt(st2.nextToken());
			if (A < X) {
				bw.write(A + " ");
			}
		}
		bw.close();
	}
}
