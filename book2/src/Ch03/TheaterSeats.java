package Ch03;
/*
 * 날짜 : 2022/09/01
 * 이름 : 심규영
 * 내용 : 극장 안의 관객 수 세기, P117
 */
public class TheaterSeats {
	public static void main(String[] args) {
		
		int [][] seats =   {{0,0,0,1,1,0,0,0,0,0},
							{0,0,1,1,0,0,0,0,0,0},
							{0,0,0,0,0,0,1,1,1,0}};
		int count = 0;
		for (int i = 0; i < seats.length; i++) {
			for (int k = 0; k < seats[i].length; k++) {
				count += seats[i][k];
			}
		}
		System.out.print("현재 관객 수는 "+count+"명입니다.");
	}
}
