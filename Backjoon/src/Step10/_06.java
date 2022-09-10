package Step10;
/*
 * 날짜 : 2022/09/10
 * 이름 : 심규영
 * 내용 : 백준 9단계 5번째 문제, 하노이 탑 이동 순서, 11729
 * 
 * 1 = 1
 * 2 = 3
 * 3 = 7
 * 4 = 15
 * 5 = 31
 * 
 * N = 원판 개수
 * n = N - 1; 배열에 입력하는 원판 개수
 * 원판 이동 횟수는 2^N-1
 * n번 원판 위에 다른 원판이 있으면 이동불가
 * 	n 과 n-1 값만 비교하면 안됨 - 4번 원판 위에 1번 원판이 있는 경우 같은게 있음
 * 		n-1번 원판만 비교하고 알고리즘을 실행시켜도 됨
 * 			최초에 모든원판이 1번에 있으므로 상관없음
 * 이동하는 위치에 자기보다 작은 원판이 있으면 안됨
 * 		자신보다 작은 원판에 둘 경우를 가정하지 않는다?
 * 			알고리즘이 바르다면 애초에 두지 않을것?
 * n번 원판이 이동한 뒤에 n-1번 원판이 다시 올라와야함
 * 		변수를 이동해야하는 원판번호와 목표위치 변수 2개를 쓴다
 * 			n번 원판이  목표위치로 이동한뒤 n-1번 원판이 n번 원판 위치로 이동하는 함수를 쓴다.
 * 				ex) f(N-1, arr.get(n));
 * 
 * 
 * 굳이 배열을 쓸 필요가 없었음
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class _06 {
	
	static LinkedList<Integer> arr; // 원판 위치 배열
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 원판의 갯수
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		arr = new LinkedList<Integer>(); // 원판 생성
		
		for (int i = 0; i < N; i++) {
			arr.add(1); // 초기 원판 위치 설정
		}
		
		f(N, 3);
		
		System.out.println((int)Math.pow(2, N) - 1);
		System.out.println(sb);
	}
	
	static void f(int N, int target) {
		int n = N-1;
		int target2 = 0;
		
		if ((arr.get(n) == 1 && target == 2) || (arr.get(n) == 2 && target == 1)) {
			target2 = 3;
		} else if ((arr.get(n) == 1 && target == 3) || (arr.get(n) == 3 && target == 1)) {
			target2 = 2;
		} else if ((arr.get(n) == 2 && target == 3) || (arr.get(n) == 3 && target == 2)) {
			target2 = 1;
		}
		
		// N이 1이하일 경우
		if (N <= 1) {
			sb.append(arr.get(n)+" "+target+"\n");
			arr.set(n, target);
		} else {
			//n-1번을 n이 가야하는 목표위치와 현재위치가 아닌곳으로 이동
			f(N - 1, target2);
			// n-1이하의 모든 원판이 이동한후 n번 원판을 목표위치로 이동
			sb.append(arr.get(n)+" "+target+"\n"); // 현재위치 에서 목표위치로 이동 내역 출력
			arr.set(n, target); // N번째 원판을 목표위치로 이동
			// n-1번 원판을 n원판 위로 부른다.
			f(N - 1, arr.get(n));
		}
	}
}
