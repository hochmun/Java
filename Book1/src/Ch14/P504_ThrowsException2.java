package Ch14;
/*
 * 날짜 : 2022/09/20
 * 이름 : 심규영
 * 내용 : 여러 catch문 사용하기
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class P504_ThrowsException2 {
	public Class loadClass(String fileName, String className) 
			throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
		P504_ThrowsException2 test = new P504_ThrowsException2();
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
