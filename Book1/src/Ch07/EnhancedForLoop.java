package Ch07;
/*
 * 날짜 : 2022/08/31
 * 이름 : 심규영
 * 내용 : 향상된 for문 사용하기, P218
 */
public class EnhancedForLoop {
	public static void main(String[] args) {
		String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};
		
		for(String lang : strArray) {
			System.out.println(lang);
		}
	}
}
