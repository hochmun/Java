package Ch06;

public class Employee3 {
	private String name;
	private Date birthDate;
	
	public Employee3 (String name, Date birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public String toString() {
		return "Employee3 [name="+name+", birthDate="+birthDate+"]";
	}
}
