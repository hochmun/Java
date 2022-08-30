package Ch02;
/*
 * 날짜 : 2022/08/30
 * 이름 : 심규영
 * 내용 : 섭씨-화씨 온도 변환, P77
 */
import java.util.Scanner;

public class FtoC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=========================");
		System.out.println("1. 화씨 -> 섭씨");
		System.out.println("2. 섭씨 -> 화씨");
		System.out.println("=========================");
		
		System.out.print("번호를 선택하시오: ");
		int select = sc.nextInt();
		if (select == 1) {
			System.out.print("화씨온도를 입력하시오: ");
			double f = sc.nextDouble();
			double c = 5.0/9.0*(f-32.0);
			System.out.println("섭씨온도는 "+c);
		} else {
			System.out.print("섭씨온도를 입력하시오: ");
			double c = sc.nextDouble();
			double f = 9.0/5.0*c +32.0;
			System.out.println("화씨온도는 "+f);
		}
		sc.close();
	}
}
