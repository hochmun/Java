package Ch14;
/*
 * 날짜 : 2022/09/20
 * 이름 : 심규영
 * 내용 : 사용자 정의 예외 테스트하기
 */
public class P507_IDFormatTest {
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) 
			throws P506_IDFormatException {
		if (userID == null) {
			throw new P506_IDFormatException("아이디는 null일 수 없습니다");
		} else if (userID.length() < 8 || userID.length() > 20) {
			throw new P506_IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요");
		}
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		P507_IDFormatTest test = new P507_IDFormatTest();
		
		String userID = null;
		try {
			test.setUserID(userID);
		} catch (P506_IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch (P506_IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
