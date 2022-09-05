package Ch04;
/*
 * 날짜 : 2022/09/05
 * 이름 : 심규영
 * 내용 : 은행 계좌 클래스 작성, P179
 */
public class BankAccountTest {
	public static void main(String[] args) {
		BankAccout myAccount = new BankAccout();
		myAccount.deposit(10000);
		System.out.println(myAccount);
		myAccount.withdraw(8000);
		System.out.println(myAccount);
	}
}
