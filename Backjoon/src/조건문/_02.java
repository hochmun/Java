package 조건문;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 심규영
 * 내용 : 백준 2단계 2번째 문제, 시험 성적
 */
public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		if(a>=90 && a <= 100) {
			System.out.println("A");
		} else if(a>=80) {
			System.out.println("B");
		} else if(a>=70) {
			System.out.println("C");
		} else if(a>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
