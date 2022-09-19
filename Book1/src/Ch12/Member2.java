package Ch12;

import java.util.Comparator;

/*
 * 날짜 : 2022/09/16
 * 이름 : 심규영
 * 내용 : Comparator 인터페이스 구현하기, P436
 */
public class Member2 implements Comparator<Member2> {
	private int memberId;
	private String memberName;
	
	public Member2 (int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName+" 회원님의 아이디는 "+memberId+"입니다";
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}
	
	public boolean equals (Object obj) {
		if (obj instanceof Member2) {
			Member2 member = (Member2)obj;
			if (this.memberId == member.memberId) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public int compare(Member2 mem1, Member2 mem2) {
		return mem1.getMemberId() - mem2.getMemberId();
	}
}
