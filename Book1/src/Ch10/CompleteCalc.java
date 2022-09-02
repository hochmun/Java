package Ch10;
/*
 * 날짜 : 2022/09/02
 * 이름 : 심규영
 * 내용 : 계산기 클래스 만들기, P317
 */
public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			return num1/num2;
		} else {
			return Calc.ERROR;
		}
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다");
	}

}
