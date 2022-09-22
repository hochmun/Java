package Ch15;
/*
 * 날짜 : 2022/09/22
 * 이름 : 심규영
 * 내용 : FileWriter로 쓰기
 */
import java.io.FileWriter;
import java.io.IOException;

public class P538_FileWriterTest {
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("writer.txt")) {
			fw.write('A');
			char buf [] = {'B', 'C', 'D', 'E', 'F', 'G'};
			
			fw.write(buf);
			fw.write("안녕하세요. 잘 써지네요");
			fw.write(buf, 1, 2);
			fw.write("65");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
