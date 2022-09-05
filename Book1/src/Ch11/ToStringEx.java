package Ch11;
/*
 * 날짜 : 2022/09/05
 * 이름 : 심규영
 * 내용 : Object 클래스의 toString() 메서드 사용하기, P354
 * 		toString() 메서드 재정의하기, P356
 */
public class ToStringEx {
	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
		
	}
}
