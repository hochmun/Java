package Step07;
/*
 * 날짜 : 2022/08/27
 * 이름 : 심규영
 * 내용 : 백준 7단계 4번째 문제, 달팽이는 올라가고 싶다
 * 
 *  x 는 걸리는 날짜
 *  A 는 하루에 올라가는 높이
 *  B 는 하루에 미끄러지는 높이
 *  V 는 최대 높이
 *  
 *  V = A * x - B * ( x - 1)
 *    = A * x - B * x + B
 *    = (A - B)x + B
 *  V - B = ( A - B ) x
 *  x = ( V - B ) / ( A - B )
 *  
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double A = Integer.parseInt(st.nextToken());
		double B = Integer.parseInt(st.nextToken());
		double V = Integer.parseInt(st.nextToken());
		System.out.println((int)Math.ceil((V-B)/(A-B)));
	}
}
