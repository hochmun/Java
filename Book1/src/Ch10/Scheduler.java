package Ch10;
/*
 * 날짜 : 2022/09/02
 * 이름 : 심규영
 * 내용 : Scheduler 인터페이스 정의하기,P322
 */
public interface Scheduler {
	public void getNextCall();
	public void sendCallToAgent();
}
