package Step04;
/*
 * 날짜 : 2022/08/20
 * 이름 : 심규영
 * 내용 : 백준 4단계 3번째 문제, 나머지
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] arr = new int [10];
		int [] arr2 = new int [10];
		int max = -1;
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i] % 42;
			}
		Arrays.sort(arr2);
		for(int i = 0; i < arr2.length; i++) {
			if(arr2[i] > max) {
				max = arr2[i];
				count++;
			}
		}
		System.out.println(count);
	}
}
