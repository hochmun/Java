package Ch12;
/*
 * 날짜 : 2022/09/19
 * 이름 : 심규영
 * 내용 : HashSet 활용하기
 */
public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member (1001, "이지원");
		Member memberSon = new Member (1002, "손민국");
		Member memberPark = new Member (1003, "박서훤");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();
		
		Member memberHong = new Member(1003, "홍길동");
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
	}
}
