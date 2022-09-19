package Ch14;
/*
 * 날짜 : 2022/09/19
 * 이름 : 심규영
 * 내용 : try-catch문 사용하기
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class P494_ExceptionHandling1 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch(FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("여기도 수행됩니다.");
	}
}
