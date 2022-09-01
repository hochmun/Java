package Ch08;
/*
 * 날짜 : 2022/09/01
 * 이름 : 심규영
 * 내용 : 하위 클래스 생성하기, P242
 */
public class CustomerTest2 {
	public static void main(String[] args) {
		VIPCustomer customerKim = new VIPCustomer(10020,"김유신",10020);
		//customerKim.setCustomerID(10020);
		//customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}
}
