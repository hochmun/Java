package 반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/08/20
 * 이름 : 심규영
 * 내용 : 백준 3단계 5번째 문제, 빠른 A+B 설명페이지 https://m.blog.naver.com/ka28/221850826909
 */
public class _05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //할당된 버퍼에 값 넣어주기
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()); // int
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n"); // \n 자동 개행 없음
		}
		bw.close(); // 스트림을 닫음 , flush로 출력
	}
}
