package Ch08;
/*
 * 날짜 : 2022/09/01
 * 이름 : 심규영
 * 내용 : 새로운 고객 등급 추가하기, P267
 */
public class GoldCustomer extends Customer {
	//속성
	double saleRatio;
	
	//생성자
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	//기능
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
}
