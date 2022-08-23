package Ch05;
/*
 * 날짜 : 2022/08/22
 * 이름 : 심규영
 * 내용 : 생성자 테스트하기, 생성자 만들기, 디폴트 생성자 추가
 * 		, 생성자 사용하기, 테스트 클래스 구현하기
 */
public class P153 {
	public class Person{
		String name;
		float height;
		float weight;
		
		public Person( ) { }
		
		public Person(String pname) {
			name = pname;
		}
		public Person(String pname, float pheight, float pweight) {
			name = pname;
			height = pheight;
			weight = pweight;
		}
	}
	public class PersonTest{
		public static void main(String[] args) {
			Person personKim = new Person();
			personKim.name = "김유신";
			personKim.weight = 85.5F;
			personKim.height = 180.0F;
			
			Person personLee = new Person("이순신", 175, 75);
		}
	}
}