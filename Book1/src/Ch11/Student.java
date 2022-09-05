package Ch11;
/*
 * 날짜 : 2022/09/05
 * 이름 : 심규영
 * 내용 : Object 클래스의 equals() 메서드 사용하기, P358
 * 		equals() 메서드 재정의하기, P361
 * 		hashCode() 메서드 재정의하기, P365
 */
public class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return studentId + "," + studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentId;
	}
}
