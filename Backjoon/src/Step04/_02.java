package Step04;
/*
 * 날짜 : 2022/08/20
 * 이름 : 심규영
 * 내용 : 백준 4단계 2번째 문제, 최댓값
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] arr = new int [9];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int max = arr[0];
		int a = 1;
		for(int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				a = i + 1;
			}
		}
		System.out.println(max + "\n" + a);
	}
}
