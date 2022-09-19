package Ch12;
/*
 * 날짜 : 2022/09/19
 * 이름 : 심규영
 * 내용 : HashMap 활용하기
 */
import java.util.HashMap;
import java.util.Iterator;

public class P440_MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	
	public P440_MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	// key-value쌍으로 hashMap에 회원을 추가하는 메서드
	public void addMember (Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	//HashMap에 매개변수로 받은 키 값인 회원아이디가 있으면
	//HashMap에서 회원을 삭제하는 메서드
	public boolean removeMember (int memberId) {
		if (hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId+"가 존재하지 않습니다");
		return false;
	}
	
	// iterator를 사용해 전체 회원을 출력한는 메서드
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
