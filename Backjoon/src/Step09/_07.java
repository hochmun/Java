package Step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/09/28
 * 이름 : 심규영
 * 내용 : 백준 9단계 7번째 문제, 좌표 정렬하기, 11650
 * 
 *  문제
 *   - 2차원 평면 위의 점 N개가 주어진다.
 *   - 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 
 *   작성하시오.
 *   
 *  입력
 *   - 첫재 줄에 점의 개수 N (1 <= N <= 100,000)이 주어진다.
 *   - 두째 줄 부터 N개의 줄에는 i번 점의 위치 xi 와 yi가 주어진다. (-100,000 <= x,y <= 100,000)
 *   - 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
 *   
 *  출력
 *   - 첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
 *   
 *   int 2차원 배열로 출력하면 메모리초과
 *   boolean 2차원 배열도 메모리초과
 */
public class _07 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer>[] xyarr = new ArrayList[200001];
		
		for(int i = 0; i < 200001; i++) {
			xyarr[i] = new ArrayList<Integer>();
		}
		
		// 카운팅 정렬
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			xyarr[x+100000].add(y);
		}
		
		// 오름차순 입력
		for (int i = 0; i < 200001; i++) {
			if (xyarr[i].size() == 1) {
				sb.append(i-100000).append(' ').append(xyarr[i].get(0)).append('\n');
			} else if (xyarr[i].size() > 1) {
				xyarr[i].sort(Comparator.naturalOrder());
				for (int j = 0; j < xyarr[i].size(); j++) {
					sb.append(i-100000).append(' ')
					.append(xyarr[i].get(j)).append('\n');
				}
			}
		}
		
		// 출력
		System.out.print(sb);
	}
}
