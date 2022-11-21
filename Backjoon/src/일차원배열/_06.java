package 일차원배열;
/*
 * 날짜 : 2022/08/22
 * 이름 : 심규영
 * 내용 : 백준 4단계 6번째 문제, 평균은 넘겠지
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int TestCase = Integer.parseInt(br.readLine());
		int [] arr;
		for(int i = 0; i < TestCase; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			arr= new int[A];
			double sum = 0;
			for(int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			double Ave = (sum / A);
			double count = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] > Ave) {
					count++;
				}
			}
			bw.write(String.format("%.3f%%\n", (count/A)*100));
		}
		bw.close();
	}
}
