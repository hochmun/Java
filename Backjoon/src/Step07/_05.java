package Step07;
/*
 * 날짜 : 2022/08/27
 * 이름 : 심규영
 * 내용 : 백준 7단계 5번째 문제, ACM 호텔
 * 
 *  TestCase 는 케이스 갯수
 *  H 는 층수, W는 층당 방 갯수, N는 N번째 손님
 *  x는 N번째 손님한테 배정되는 방 번호
 *  엘레베이터에 가장 가까운 방 선호, 아래층 우선 선호
 *  
 *  h는 배정되는 방 층, w는 배정되는 방 호수
 *  h = N % H, if ( h == 0 ) { h = H }
 *  w = Math.ceil ( N / H )
 *  x = ( h * 100 ) + w
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int TestCase = Integer.parseInt(br.readLine());
		for (int i = 0; i < TestCase; i++) {
			st = new StringTokenizer(br.readLine());
			double H = Integer.parseInt(st.nextToken()), W = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
			f(H, W, N);
		}
	}
	public static void f(double H, double W, double N) {
		int h = (int) (N % H);
		int w = (int)Math.ceil( N / H );
		if ( h == 0) {
			h = (int) H;
		}
		System.out.println((h*100)+w);
	}
}
