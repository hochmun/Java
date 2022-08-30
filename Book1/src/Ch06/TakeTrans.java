package Ch06;
/*
 * 날짜 : 2022/08/30
 * 이름 : 심규영
 * 내용 : 버스와 지하철 타기, P178
 */
public class TakeTrans {
	public static void main(String[] args) {
		Student studentJanes = new Student("Janes", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		studentJanes.takeBus(bus100);
		studentJanes.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
	}
}
