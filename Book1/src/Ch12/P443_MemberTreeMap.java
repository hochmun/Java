package Ch12;
/*
 * 날짜 : 2022/09/19
 * 이름 : 심규영
 * 내용 : TreeMap 활용하기
 */
import java.util.Iterator;
import java.util.TreeMap;

public class P443_MemberTreeMap {
	private TreeMap<Integer, Member> treeMap;
	
	public P443_MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	// key-value 쌍으로 추가
	public void addMember (Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
