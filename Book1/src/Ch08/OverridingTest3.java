package Ch08;
/*
 * 날짜 : 2022/09/01
 * 이름 : 심규영
 * 내용 : 클래스형에 기반하여 지불 금액 계산하기, P257
 */
public class OverridingTest3 {
	public static void main(String[] args) {
		int price = 10000;
		
		Customer customerLee = new Customer(10010, "이순신");
		System.out.println(customerLee.getCustomerName()+" 님이 지불해야 하는 금액은 "
				+customerLee.calcPrice(10000)+"원입니다.");
		
		VIPCustomer customerKim = new VIPCustomer(10020,"김유신",12345);
		System.out.println(customerKim.getCustomerName()+" 님이 지불해야 하는 금액은 "
				+customerKim.calcPrice(10000)+"원입니다.");
		
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		System.out.println(vc.getCustomerName()+" 님이 지불해야 하는 금액은 "
				+vc.calcPrice(10000)+"원입니다.");
	}
}
