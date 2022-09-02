package Ch09;
/*
 * 날짜 : 2022/09/02
 * 이름 : 심규영
 * 내용 : 중급자 레벨 클래스 구현하기, P301
 */
public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 jump합니다.");
	}

	@Override
	public void turn() {
		System.out.println("Turn할 줄 모르지롱");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 중급자 레벨입니다. *****");
		
	}

}
