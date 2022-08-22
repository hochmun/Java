package Step04;
/*
 * 날짜 : 2022/08/22
 * 이름 : 심규영
 * 내용 : 백준 4단계 5번째 문제, OX퀴즈
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String [] arr = new String [Integer.parseInt(br.readLine())];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
		}
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			int count = 0;
			for (int j = 0; j < arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					count++;
					sum += count;
				} else {
					count = 0;
				}
			}
			bw.write(sum + "\n");
		}
		bw.close();
	}
}
