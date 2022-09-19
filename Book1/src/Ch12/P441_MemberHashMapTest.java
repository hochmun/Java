package Ch12;
/*
 * 날짜 : 2022/09/19
 * 이름 : 심규영
 * 내용 : HashMap 활용하기
 */
public class P441_MemberHashMapTest {
	public static void main(String[] args) {
		P440_MemberHashMap memberHashMap = new P440_MemberHashMap();
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		Member memberHong = new Member(1004, "홍길동");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}
}
