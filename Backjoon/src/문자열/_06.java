package 문자열;
/*
 * 날짜 : 2022/08/24
 * 이름 : 심규영
 * 내용 : 백준 6단계 6번째 문제, 단어의 개수
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _06 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		System.out.println(st.countTokens());
	}
}