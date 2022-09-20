package Ch14;
/*
 * 날짜 : 2022/09/20
 * 이름 : 심규영
 * 내용 : throws로 예외 미루기
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class P501_ThrowsException {
	public Class loadClass(String fileName, String className) throws
	FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
		P501_ThrowsException test = new P501_ThrowsException();
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
