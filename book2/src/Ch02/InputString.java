package Ch02;
/*
 * 날짜 : 2022/08/30
 * 이름 : 심규영
 * 내용 : 사용자로부터 이름과 나이를 받는 프로그램, P67
 */
import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		String name;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오: ");
		name = sc.nextLine();
		System.out.print("나이를 입력하시오: ");
		age = sc.nextInt();
		
		System.out.println(name + "님 안녕하세요! "+(age)+"살이시네요.");
		sc.close();
	}
}
