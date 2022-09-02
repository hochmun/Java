package Ch09;
/*
 * 날짜 : 2022/09/02
 * 이름 : 심규영
 * 내용 : 고급자 레벨 클래스 구현하기, P302
 */
public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 jump합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("한 바퀴 돕니다.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 고급자 레벨입니다. *****");
		
	}
	
}
