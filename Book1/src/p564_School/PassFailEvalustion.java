package p564_School;
/*
 * 날짜 : 2022/09/24
 * 이름 : 심규영
 * 내용 : Pass/Fail 학점 클래스 구현
 */
public class PassFailEvalustion implements GradeEvaluation {

	@Override
	public String getGrade(int point) {
		if (point >= 70 && point <= 100) {
			return "P";
		} else {
			return "F";
		}
	}

}
