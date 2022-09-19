package sub2;
/*
 * 날짜 : 2022/09/19
 * 이름 : 심규영
 * 내용 : 스레드 Join 실습하기
 */
public class ThreadJoinTest {
	public static void main(String[] args) throws InterruptedException {
		Count count1 = new Count();
		
		CountThread ct1 = new CountThread(count1);
		CountThread ct2 = new CountThread(count1);
		CountThread ct3 = new CountThread(count1);
		
		// 스레드 실행(비동기 방식)
		ct1.start();
		ct2.start();
		ct3.start();
		
		// 자식스레드의 작업이 완료된 후 다시 메인스레드로 합류(스레드 대기)
		ct1.join();
		ct2.join();
		ct3.join();
		
		System.out.println("count1 값 : "+count1.getNum());
	}
}
