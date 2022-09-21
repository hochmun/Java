package Ch15;
/*
 * 날짜 : 2022/09/21
 * 이름 : 심규영
 * 내용 : 파일에 바이트 배열로 출력하기
 */
import java.io.FileOutputStream;
import java.io.IOException;

public class P532_FileOutputStreamTest3 {
	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("output3.txt")) {
			byte[] bs = new byte[26];
			byte data = 65;
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			// 배열의 3번째 위치부터 10개 바이트 출력
			fos.write(bs, 2, 10);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
