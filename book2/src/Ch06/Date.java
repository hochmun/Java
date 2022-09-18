package Ch06;

public class Date {
	private int year, month, date;
	
	public Date (int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	public String toString() {
		return "Date [year="+year+", month="+month+", date="+date+"]";
	}
}
