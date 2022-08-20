package Step04;
/*
 * 날짜 : 2022/08/20
 * 이름 : 심규영
 * 내용 : 백준 4단계 4번째 문제, 평균
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _04 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		double [] arr = new double [Integer.parseInt(br.readLine())];
		double [] arr2 = new double [arr.length];
		st = new StringTokenizer(br.readLine());
		double max = -1;
		double add = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i] / max * 100;
			add += arr2[i];
		}
		System.out.println(add / arr.length);
	}
}
