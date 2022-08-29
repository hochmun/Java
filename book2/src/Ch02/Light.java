package Ch02;
/*
 * 날짜 : 2022/08/30
 * 이름 : 심규영
 * 내용 : 1광년 거리 계산하기, P60
 */
public class Light {
	public static void main(String[] args) {
		final double light_speed = 3e5;
		double distance;
		
		distance = light_speed * 365 * 24 * 60 * 60;
		System.out.println("빛이 1년 동안 가는 거리 : "+distance+" km.");
	}
}
