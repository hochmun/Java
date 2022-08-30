package Ch06;
/*
 * 날짜 : 2022/08/30
 * 이름 : 심규영
 * 내용 : private 생성자 만들기, P194
 * 		인스턴스 생성하기, P194
 * 		public 메서드 만들기, P195
 */
public class Company {
	private static Company instance = new Company(); // 유일하게 생성한 인스턴스
	private Company () {}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
