package Ch05;
/*
 * 날짜 : 2022/08/29
 * 이름 : 심규영
 * 내용 : 생성자 테스트하기, P153
 * 		테스트 클래스 구현하기, P158
 */
public class PersonTest {
	public static void main(String[] args) {
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.weight = 85.5F;
		personKim.height = 180.0f;
		
		Person personLee = new Person("이순신", 175, 75);
	}
}
