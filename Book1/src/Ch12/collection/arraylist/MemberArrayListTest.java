package Ch12.collection.arraylist;
/*
 * 날짜 : 2022/09/16
 * 이름 : 심규영
 * 내용 : ArrayList 활용하기, P411
 */
import Ch12.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서원");
		Member memberHong = new Member(1004, "홍길동");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember();
	}
}
