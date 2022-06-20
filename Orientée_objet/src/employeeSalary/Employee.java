package employeeSalary;

public class Employee {
	
	String name;
	double valuePerHour;
	int hour;
	
	public double total() {
		return hour * valuePerHour;
	}
}
