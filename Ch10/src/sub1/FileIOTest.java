package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 날짜 : 2022/09/13
 * 이름 : 심규영
 * 내용 : 파일 입출력 스트림 실습하기
 */
public class FileIOTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java2\\Desktop\\sample1.txt";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			
			while(true) {
				int data = fis.read();
				
				if(data == -1) {
					break; // 파일을 모두 읽었을 경우
				}
				
				// 데이터 출력
				char c = (char)data;
				System.out.print(c);
				
			}
			
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
		
	}
}
