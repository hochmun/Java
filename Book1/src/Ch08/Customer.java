package Ch08;
/*
 * 날짜 : 2022/08/31
 * 이름 : 심규영
 * 내용 :Customer 클래스 구현하기, P234
 * 		protected 변수 선언, P238
 * 		상속에서 클래스 생성 과정 (1), P241
 * 		Customer 클래스에 새로운 생성자 추가하기, P245
 * 		고객 관리 프로그램 완성하기 (1), P262
 */
public class Customer {
	//속성
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	//getter, setter
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	// 생성자
	public Customer() {
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	private void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	
	// 기능
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName+" 님의 등급은 "+customerGrade+"이며, 보너스 포인트는"
				+bonusPoint+"입니다.";
	}
}
