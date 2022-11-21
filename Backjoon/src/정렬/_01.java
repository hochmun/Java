package 정렬;
/*
 * 날짜 : 2022/09/13
 * 이름 : 심규영
 * 내용 : 백준 9단계 1번째 문제, 수 정렬하기, 2750
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _01 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int [N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 1; i < arr.length; i++) {
			int target = arr[i];
			int j = i - 1;
			
			while (j >= 0 && target < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = target;
			
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
		
	}
}
