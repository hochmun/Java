package Ch11;
/*
 * 날짜 : 2022/09/14
 * 이름 : 심규영
 * 내용 : Person의 Class클래스 가져오기, P380
 */
public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		//Object의 getClass() 메서드 사용하기
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		//직접 class 파일 대입하기
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		//클래스 이름으로 가져오기
		Class pClass3 = Class.forName("Ch11.Person");
		System.out.println(pClass3.getName());
	}
}
