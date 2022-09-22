package Ch15;
/*
 * 날짜 : 2022/09/22
 * 이름 : 심규영
 * 내용 : InputStreamReader 사용하기
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class P541_InputStreamReaderTest {
	public static void main(String[] args) {
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
			int i;
			while((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
