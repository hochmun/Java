package sub5;

public class Account {
	// 속성
	protected String bank;
	protected String Id;
	protected String name;
	protected int balance;
	
	public Account(String bank, String Id, String name, int balance) {
		this.bank = bank;
		this.Id = Id;
		this.name = name;
		this.balance = balance;
	}
	
	// 기능
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	public void show() {
		System.out.println("--------------------------");
		System.out.println("은행명 : "+bank);
		System.out.println("계좌번호 : "+Id);
		System.out.println("입금주 : "+name);
		System.out.println("현재잔액 : "+balance);
		System.out.println("--------------------------");
	}
}
