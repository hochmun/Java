package 기본수학1;
/*
 * 날짜 : 2022/08/26
 * 이름 : 심규영
 * 내용 : 백준 7단계 3번째 문제, 분수찾기
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int Y = 0; // 열
		int Z = 0; // 행
		if(X == 1) {
			System.out.println("1/1");
		}
		else {
			// 열 구하기
			for(int i = 2; i <= X; i++) {
				if (X <= (i*(1+i))/2) {
					Y = i;
					break;
				}
			}
			// 행 구하기
			Z = X - ((Y-1)*Y)/2;
			// 답 구하기
			if (Y%2==0) {
				System.out.println(Z+"/"+(1+Y-Z));
			} else {
				System.out.println((1+Y-Z)+"/"+Z);
			}
		}
	}
}
