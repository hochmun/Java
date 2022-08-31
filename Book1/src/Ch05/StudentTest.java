package Ch05;
/*
 * 날짜 : 2022/08/29
 * 이름 : 심규영
 * 내용 :	StudentTest 실행 클래스 만들기, P146
 * 		private 변수 테스트하기, P163
 * 		private 변수에 접근하기, P165
 */
public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentAhn.studentName = "안승연";
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
	}
}
