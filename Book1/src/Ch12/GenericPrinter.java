package Ch12;
/*
 * 날짜 : 2022/09/16
 * 이름 : 심규영
 * 내용 : GenericPrinter<T> 클래스 정의하기, P393
 * 		GenericPrinter<T extends Material> 클래스, P397
 * 		<T extends 클래스> 사용하기, P398
 */
public class GenericPrinter<T extends Material> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
}
