package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/11/21
 * 이름 : 심규영
 * 내용 :
 * 
 * 	- 입력
 * 		총 28줄로 각 제출자의 출석번호 n(1 <= n <= 30)가 한 줄에 하나씩 주어짐
 * 		출석번호에 중복은 없다
 * 	- 출력
 * 		1번째 줄엔 제출하지 않은 학생의 출석버호 중 가장 작은 것을 출력하고
 * 		2번째 줄에선 그 다음 출석번호를 출력
 */
public class _5597 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] number = new boolean[31];
		
		for(int i = 1; i <= 28; i++) {
			number[Integer.parseInt(br.readLine())] = true;
		}
		
		for(int i = 1; i <= 30; i++) {
			if(number[i] == false) {
				System.out.println(i);
			}
		}
		
	}
}
