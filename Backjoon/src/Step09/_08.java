package Step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/09/29
 * 이름 : 심규영
 * 내용 : 백준 9단계 8번째 문제, 좌표 정렬하기2, 11651
 */
public class _08 {
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
			xyarr[y+100000].add(x);
		}
		
		// 오름차순 입력
		for (int i = 0; i < 200001; i++) {
			if (xyarr[i].size() == 1) {
				sb.append(xyarr[i].get(0)).append(' ').append(i-100000).append('\n');
			} else if (xyarr[i].size() > 1) {
				xyarr[i].sort(Comparator.naturalOrder());
				for (int j = 0; j < xyarr[i].size(); j++) {
					sb.append(xyarr[i].get(j)).append(' ')
					.append(i-100000).append('\n');
				}
			}
		}
		
		// 출력
		System.out.print(sb);
	}
}
