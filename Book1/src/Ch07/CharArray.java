package Ch07;
/*
 * 날짜 : 2022/08/30
 * 이름 : 심규영
 * 내용 : 알파벳 문자와 아스키 코드 값 출력하기, P206
 */
public class CharArray {
	public static void main(String[] args) {
		char [] alphabets = new char [26];
		char ch = 'A';
		
		for (int i = 0; i < alphabets.length; i++, ch++) {
			alphabets[i] = ch;
		}
		
		for (int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i]+","+(int)alphabets[i]);
		}
	}
}
