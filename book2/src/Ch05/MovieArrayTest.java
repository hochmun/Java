package Ch05;
/*
 * 날짜 : 2022/09/11
 * 이름 : 심규영
 * 내용 : 객체 배열 만들기, P212
 */
import java.util.Scanner;

public class MovieArrayTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Movie [] list = new Movie[10];
		list[0] = new Movie("백투더퓨처","로버트 저메키스");
		list[1] = new Movie("티파냐에서 아침을","에드워드 블레이크");
		
		for (int i = 0; i < Movie.count; i++) {
			System.out.println("========================");
			System.out.println("제목: "+list[i].title);
			System.out.println("제목: "+list[i].director);
			System.out.println("========================");
		}
	}
}
