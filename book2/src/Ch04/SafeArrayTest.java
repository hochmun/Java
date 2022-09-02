package Ch04;
/*
 * 날짜 : 2022/09/02
 * 이름 : 심규영
 * 내용 : 안전한 배열 만들기, P169
 */
public class SafeArrayTest {
	public static void main(String[] args) {
		SafeArray array = new SafeArray(3);
		
		for (int i = 0; i < (array.length+1); i++) {
			array.put(i, i*10);
		}
	}
}
