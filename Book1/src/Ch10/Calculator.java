package Ch10;
/*
 * 날짜 : 2022/09/02
 * 이름 : 심규영
 * 내용 : 인터페이스 구현하기, P316
 */
public abstract class Calculator implements Calc {
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
}
