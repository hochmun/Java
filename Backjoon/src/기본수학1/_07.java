package 기본수학1;
/*
 * 날짜 : 2022/08/28
 * 이름 : 심규영
 * 내용 : 백준 7단계 7번째 문제, 설탕 배달
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _07 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int x = 0;
		int y = 0;
		int X = N / 5;
		boolean check = false;
		for (int i = 0; i <= X; i++) {
			if ((N -( 5 * (X - i)))%3 == 0) {
				x = X - i;
				if(X == i) {
					y = N / 3;
				} else {
					y =(int)Math.ceil(((double)N -( 5 * (X-i)))/3);
				}
				check = true;
				break;
			}
		}
		if (check == true) {
			System.out.println(x+y);
		} else {
			System.out.println("-1");
		}
	}
}
