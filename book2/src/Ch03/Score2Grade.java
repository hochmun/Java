package Ch03;
/*
 * 날짜 : 2022/08/30
 * 이름 : 심규영
 * 내용 : 성적을 학점으로 변환하는 프로그램 2, P95
 */
import java.util.Scanner;

public class Score2Grade {
	public static void main(String[] args) {
		int score, number;
		char grade;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하시오: ");
		score = sc.nextInt();
		sc.close();
		number = score / 10;
		switch (number) {
		case 10:
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F'; break;
		}
		System.out.print("학점: "+grade);
	}
}
