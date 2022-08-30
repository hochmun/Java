package Ch06;
/*
 * 날짜 : 2022/08/30
 * 이름 : 심규영
 * 내용 : static 변수 테스트하기, P183
 */
public class StudentTest1 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
	}
}
