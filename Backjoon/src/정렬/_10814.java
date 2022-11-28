package 정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 내용 : 나이순 정렬
 * 날짜 : 2022/11/22
 * 이름 : 심규영
 * 
 *  안정 정렬(stable sort) 알고리즘 문제
 *  
 *  - 입력
 *  	첫째 줄에 온라인 저지 회원의 수 N이 주어진다(1 <= N <= 100,000)
 *  	둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다.
 *  	나이는 1보다 크거나 같으며, 200보다 작거나 같은 정수이고,
 *  	이름은 알파벳 대소문자로 이루어져 있고,
 *  		길이가 100보다 작거나 같은 문자열이다.
 *  	입력은 가입한 순서로 주어진다.
 *  - 출력
 *  	첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이순,
 *  	나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력한다.
 */
public class _10814 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int arr1[] = new int[N];
		String arr2[] = new String[N];
		
		for(int i = 0; i < N; i++ ) {
			st = new StringTokenizer(br.readLine());
			arr1[i] = Integer.parseInt(st.nextToken());
			arr2[i] = st.nextToken();
		}
		
		merge_sort(arr1, arr2, 0, arr1.length-1);
	}
	
	public static void merge_sort(int[] arr1, String[] arr2, int start, int end) {
		if (start < end) {
			int middle = (start + end) / 2;
			
			merge_sort(arr1, arr2, start, middle);
			
			merge_sort(arr1, arr2, middle+1, end);
			
			
		}
	}
	
	public static void marge_logic(int[] arr1, String[] arr2, int start, int middle, int end) {
		int[] tempArr = new int[(end-start)+1];
		String[] tempArr2 = new String[(end-start)+1];
		int i = start;
		int r = middle+1;
		int idx = 0;
		
		if(end - start < 2) {
			if(arr1[start] > arr1[end]) {
				tempArr[0] = arr1[end];
				tempArr2[0] = arr2[end];
			}
		}
		
	}
	
}
