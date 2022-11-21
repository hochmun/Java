package 기본수학2;
/*
 * 날짜 : 2022/09/03
 * 이름 : 심규영
 * 내용 : 백준 8단계 2번째 문제, 소수
 * 
 * 소수를 구하는 메소드, 에라토스테네스의 체
 * public static boolean[] prime;
 * public static void make_prime(int N) {
 * 
 * 	prime = new boolean[N + 1]; // 0 ~ N
 * 	
 * 	if(N < 2) {
 * 		ruturn;
 * 	}
 * 	
 * 	prime[0] = prime[1] = true
 * 	// 제곱근 함수 : Math.sqar()
 * 	for(int i = 2; i <= Math.sqrt(N); i++) {
 * 		// 이미 체크된 배열이면 다음 반복문으로 skip
 * 		if(prime[i] == true) {
 * 			continue;
 * 		}
 * 		// i 의 배수들을 걸러주기 위한 반복문
 * 		for(int j = i * i; j < prime.length; j = j+i) {
 * 			prime[j] = true;
 * 		}
 * 	}
 * }
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class _02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		
		ArrayList<Integer> primenum = new ArrayList<Integer>();
		
		for (int i = M; i <= N; i++) { // M 이상 N 이하 수 입력
			primenum.add(i);
		}
		
		if (primenum.contains(1) == true) {
			primenum.remove(Integer.valueOf(1)); // 1 값 제거
		}
		/* 
		 * 뒤에서부터 입력된 수의 소수 확인후 아닐경우 제거
		 * 뒤에서부터 제거하기 때문에 배열 순서에 영향 안감
		 */
		for (int i = primenum.size() - 1; i >= 0; i--) {
			int x = primenum.get(i);
			for (int j = 2; j < x; j++) {
				if (x % j == 0) {
					primenum.remove(Integer.valueOf(x));
					break;
				}
			}
		}
		
		if (primenum.size() == 0) {
			System.out.println("-1");
		} else {
			for (int num : primenum) {
				sum += num;
			}
			System.out.println(sum+"\n"+Collections.min(primenum));
		}
		
	}
}
