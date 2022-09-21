package Ch15;
/*
 * 날짜 : 2022/09/21
 * 이름 : 심규영
 * 내용 : FileReader로 읽기
 */
import java.io.FileReader;
import java.io.IOException;

public class P536_FileReaderTest {
	public static void main(String[] args) {
		try (FileReader fr = new FileReader("reader.txt")) {
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
