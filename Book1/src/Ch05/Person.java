package Ch05;
/*
 * 날짜 : 2022/08/29
 * 이름 : 심규영
 * 내용 : Person 클래스 만들기, P131
 * 		생성자 만들기, P153
 * 		디폴트 생성자, P154
 */
public class Person {
	String name;
	float height;
	float weight;
	char gender;
	boolean married;
	// 디폴트 생성자
	public Person() {}
	
	public Person(String pname) {
		name = pname;
	}
	// 생성자 사용하기, P157
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
