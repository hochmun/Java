package Ch03;
/*
 * 날짜 : 2022/08/30
 * 이름 : 심규영
 * 내용 : 향상된 switch문, P97
 */
public class Test {
	public static void main(String[] args) {
		var day = "SAT";
		var today = "";
		switch(day) {
		case "SAT", "SUN" -> today = "주말";
		case "MON", "TUS", "WEN", "THU", "FRI" -> today = "주중";
		default -> System.out.println("Error");
		}
		System.out.println(today);
	}
}
