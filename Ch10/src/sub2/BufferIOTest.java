package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2022/09/13
 * 이름 : 심규영
 * 내용 : 버퍼 입출력 스트림 실습하기
 * 
 * 버퍼 스트림
 *  - 기본 입출력 스트림에 Buffer를 장착해서 빠른 입출력을 지원하는 스트림
 *  - 기본 입출력에 기본적으로 
 */
public class BufferIOTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java2\\Desktop\\Java.pdf";
		String target = "C:\\Users\\java2\\Desktop\\Java2.pdf";
		
		try {
			//FileInputStream fis = new FileInputStream(path);
			//FileOutputStream fos = new FileOutputStream(target);
			
			// 보조 스트림(버퍼) 연결
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(target));
			
			
			while(true) {
				int data = bis.read();
				
				if(data == -1) {
					break; // 파일을 모두 읽었을 경우
				}
				
				// 파일 쓰기
				bos.write(data);
			}
			bis.close();
			bos.close();
			//fis.close();
			//fos.close();
			
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
