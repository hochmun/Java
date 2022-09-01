package Ch03;
/*
 * 날짜 : 2022/09/01
 * 이름 : 심규영
 * 내용 : 반복문과 배열, P112
 */
public class ArrayTest1 {
	public static void main(String[] args) {
		
		int [] s = new int[10];
		
		for (int i = 0; i < s.length; i++) {
			s[i]= i;
		}
		
		for ( int i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
		}
	}
}
