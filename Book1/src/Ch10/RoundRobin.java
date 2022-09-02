package Ch10;
/*
 * 날짜 : 2022/09/02
 * 이름 : 심규영
 * 내용 : 순서대로 배분하기, P322
 */
public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}

}
