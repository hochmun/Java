package Step07;
/*
 * 날짜 : 2022/08/26
 * 이름 : 심규영
 * 내용 : 백준 7단계 1번째 문제, 손익분기점
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		int FixedCost = Integer.parseInt(st.nextToken()); // 고정 비용
		int VariableCost = Integer.parseInt(st.nextToken()); // 가변 비용
		int SalesCost = Integer.parseInt(st.nextToken()); // 판매 비용
		// 손익분기점 = 고정비용 / ( 판매비용 - 가변비용 )
		if (SalesCost > VariableCost) {
			System.out.println((FixedCost/(SalesCost-VariableCost))+1);
		} else {
			System.out.println("-1");
		}
	}
}
