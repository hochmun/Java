package Ch06;
/*
 * 날짜 : 2022/08/30
 * 이름 : 심규영
 * 내용 : serialNum의 get(), set() 메서드 사용하기, P187
 */
public class Student3 {
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student3 () {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student3.serialNum = serialNum;
	}
}
