package 기본수학1;
/*
 * 날짜 : 2022/09/02
 * 이름 : 심규영
 * 내용 : 백준 7단계 8번째 문제, 큰 수 A+B
 * 
 * 	BufferedWrite는 String 유형만 출력가능하다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _08 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String A = st.nextToken();
		String B = st.nextToken();
		int max = Math.max(A.length(), B.length());
		int [] arrA = new int[max + 1];
		int [] arrB = new int[max + 1];
		
		for (int i = A.length()-1,num = 0; i >= 0; i--,num++) {
			arrA [num] = A.charAt(i) - '0';
		}
		
		for (int i = B.length()-1,num = 0; i >= 0; i--,num++) {
			arrB [num] = B.charAt(i) - '0';
		}
		
		for (int i = 0; i < max; i++) {
			int sum = arrA[i] + arrB[i];
			arrA[i] = sum % 10;
			arrA[i+1] += (sum/10);
		}
		
		StringBuilder sb = new StringBuilder();
		
		if(arrA[max] != 0) {
			sb.append(arrA[max]);
		} 
		
		for(int i = max - 1; i >= 0; i--) {
			sb.append(arrA[i]);
		}
		System.out.println(sb);
	}
}
