package 이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 내용 : 2차원 배열을 활용하여 색종이로 평면을 덮는 문제
 * 날짜 : 2022/11/21
 * 이름 : 심규영
 * 
 * 	- 문제 
 * 		가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다.
 * 		이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를
 * 		색종이의 변과 도화지의 변이 평행하도록 붙인다.
 * 		이러한 방식으로 색종이를 한 장 또는 여러장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는
 * 		프로그램 작성
 * 	- 입력
 * 		첫째 줄에 색종이의 수가 주어진다.
 * 		둘째 줄부터 한 줄에 하나씩 색종이를 붙인 위치가 주어진다.
 * 		색종이를 붙인 위치는 두 개의 자연수로 주어지는데
 * 			첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고,
 * 			두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다.
 * 		색종이의 수는 100이하이며, 색종이가 도화지 밖으로 나가는 경우는 없다.
 * 	- 출력
 * 		첫째 줄에 색종이가 붙은 검은 영역의 넓이를 출력한다.
 */
public class _2563 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int paperCount = Integer.parseInt(br.readLine());
		boolean [][] arr = new boolean[100][100]; // 0~99
		int count = 0;
		
		for(int i = 0; i < paperCount; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for(int j = x; j < x+10; j++) {
				for(int k = y; k < y+10; k++) {
					if(arr[j][k]==false) {
						arr[j][k] = true;
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
	}
}
