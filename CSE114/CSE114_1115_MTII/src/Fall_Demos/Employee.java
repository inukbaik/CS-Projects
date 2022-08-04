package Fall_Demos;


public class Employee extends SchoolAssociate {
	private String office;
	private double salary;

	public Employee(String name, String address, String phoneNumber, String email, String office, double salary) {
		super (name, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
	}
	public Employee(String name, String address, String phoneNumber, String email, String office) {
		this(name, address, phoneNumber, email, office, -1);
	}
	public double getSalary() {
		return salary;
	}
	public String getOffice() {
		return office;
	}
	public void setSalary(double salary) {
		if (salary >= 0) {
			this.salary = salary;
		} else {
			System.out.println("Employee: Invalid Salary");
		}		
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String toString() {
		return super.toString() + " Office: " + office + " Salary: undisclosed";
	}
	

}
