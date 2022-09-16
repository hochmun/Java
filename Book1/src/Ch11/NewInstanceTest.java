package Ch11;
/*
 * 날짜 : 2022/09/16
 * 이름 : 심규영
 * 내용 : Person 클래스의 인스턴스 생성하기, P383
 */
public class NewInstanceTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("Ch11.Person");
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
	}
}
