package Ch15;
/*
 * 날짜 : 2022/09/21
 * 이름 : 심규영
 * 내용 : 파일 끝까지 읽기
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class P525_FileInputStreamTest2 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("input.txt")) {
			int i;
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			System.out.println("end");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
