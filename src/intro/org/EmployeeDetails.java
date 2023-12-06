package intro.org;

public class EmployeeDetails {
	
	public void name() {
		System.out.println("Employee Name : Prasanth");

	}
	
	public void id() {
		System.out.println("EmployeeId : 123456");

	}
	
	public void department() {
		System.out.println("Employee Department : Test Analyst");

	}
	
	public static void main(String[] args) {
		EmployeeDetails ed = new EmployeeDetails();
		ed.name();
		ed.id();
		ed.department();
	}

}
