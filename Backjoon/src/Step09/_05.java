package Step09;
/*
 * 날짜 : 2022/09
 * 이름 :
 * 내용 :
 * 
 * 1 = 1
 * 2 = 3
 * 3 = 7
 * 4 = 15
 * 5 = 31
 * 
 * arr의 길이에 따라 이동 변화
 * if(arr.len % 2 == 0 && x == 1) {
 * 		arr[0]은 현재위치에서 현재위치와 목표위치가 아닌곳으로 이동
 * } esle {
 * 		arr[0]은 현재위치에서 3번으로 이동
 * }
 *
 * 배열의 마지막 숫자(제일 아래쪽 깔린 원판)이 목표위치 3번에 도착하면 배열에서 제거?
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _05 {
	
	static ArrayList<Integer> arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 원판의 갯수
		int N = Integer.parseInt(br.readLine());
		
		arr = new ArrayList<>(N); // 원판 갯수 설정
		
		for (int i = 0; i < N; i++) {
			arr.add(1); // 초기 원판 위치 설정
		}
		
		
		
	}
	
	// 맨 밑 원판이 홀수일때 1이 목표 위치 부터 가고
	// 맨 밑 원판이 짝수일대 1이 목표 위치가 아닌 지점 부터 간다
	// 원판 갯수가 늘어 날수록 2의 제곱으로 이동 횟수가 늘어간다
	
	static void f(int N) {
		int n = N-1;
		
		if (arr.size() % 2 == 0 && n == 0) {
			//전체 원판이 짝수이고 현재 원판이 1번째 원판일때 현재위치와 3번위치가 아닌곳으로 이동
			sb.append(arr.get(n)+" "+(3 - arr.get(n))+"\n");
			
			arr[n] = 3 - arr[n];
		} else if (arr.length % 2 != 0 && n == 0) {
			sb.append(arr[n]+" 3\n");
			arr[n] = 3;
		}
		
		if (arr.length == N && arr[n] == 3) {
			// 현재 원판이 마지막 원판이고 3번 위치에 있을때 배열에서 제외한다
		}
		
	}
}
