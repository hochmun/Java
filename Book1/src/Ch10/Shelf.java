package Ch10;
/*
 * 날짜 : 2022/09/02
 * 이름 : 심규영
 * 내용 : Shelf 클래스 만들기, P340
 */
import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
