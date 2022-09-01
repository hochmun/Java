package Ch08;
/*
 * 날짜 : 2022/09/01
 * 이름 : 심규영
 * 내용 : 클래스 형 변환과 재정의 메서드 호출하기, P253
 */
public class OverridingTest2 {
	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName()+" 님이 지불해야 하는 금액은 "
				+vc.calcPrice(10000)+"원입니다.");
	}
}
