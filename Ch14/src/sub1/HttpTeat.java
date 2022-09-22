package sub1;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

/*
 * 날짜 : 2022/09/21
 * 이름 : 심규영
 * 내용 : HTTP 통신 실습하기
 */
public class HttpTeat {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.naver.com");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			StringBuilder sb = new StringBuilder();

			FileWriter fw = new FileWriter("C:\\Users\\java2\\Desktop\\naver.html");
			
			// 파일 복사 시간 측정
			long millisecond = System.currentTimeMillis();
			
			String line = null;
			while((line = br.readLine()) != null) {
				sb.append(line).append('\n');
			}
			
			fw.write(sb.toString());
			fw.close();
			
			// 파일 복사 시간 출력
			millisecond = System.currentTimeMillis() - millisecond;
			System.out.println(millisecond+"milliseconds");
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
