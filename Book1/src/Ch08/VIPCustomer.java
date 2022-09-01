package Ch08;
/*
 * 날짜 : 2022/09/01
 * 이름 : 심규영
 * 내용 : VIPCustomer 클래스 구현하기, P237
 * 		상속에서 클래스 생성 과정 (2), P242
 * 		명시적으로 상위 클래스 생성자 호출하기, P245
 * 		calcPrice() 메서드 재정의하기, P250
 * 		고객 관리 프로그램 완성하기(2), P263
 */
public class VIPCustomer extends Customer {
	//속성
	private int agentID;
	double saleRatio;

	//getter, setter
	public int getAgentID() {
		return agentID;
	}
	
	//생성자
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	//기능
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo()+"담당 상담원 번호는 "+agentID+"입니다";
	}
	
}
