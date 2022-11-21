package 함수;
/*
 * 날짜 : 2022/08/22
 * 이름 : 심규영
 * 내용 : 백준 5단계 2번째 문제, 셀프넘버
 */
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class _02 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean[] check = new boolean[10001];
		for(int i = 1; i <= 10000; i++) {
			int n = d(i);
			if(n <= 10000) {
				check[n] = true;
			}
		}
		for(int i = 1; i <= 10000; i++) {
			if(!check[i]) {
				bw.write(i+"\n");
			}
		}
		bw.close();
	}


	public static int d (int N) {
		int sum = N;
		String number = String.valueOf(N);
		for(int i = 0; i < number.length(); i++) {
			int j = Character.digit(number.charAt(i), 10);
			sum += j;
		}
		return sum;
	}
}