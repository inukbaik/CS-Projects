package Fall_Demos;


public class Faculty extends Employee {
	private String department;
	private String rank;
	
	public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, String department, String rank) {
		super(name, address, phoneNumber, email, office, salary);
		this.department = department;
		this.rank = rank;
	}
	public Faculty(String name, String address, String phoneNumber, String email, String office, String department, String rank) {
		this(name, address, phoneNumber, email, office, -1.0, department, rank);
	}
	public Faculty(String name, String address, String phoneNumber, String email, String department, String rank) {
		this(name, address, phoneNumber, email, "", -1.0, department, rank);
	}
	
	public String getDepartment() {
		return department;
	}
	public String getRank() {
		return rank;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setRank(String rank) {
		if (rank.equalsIgnoreCase("Lecturer") ||
				rank.equalsIgnoreCase("AssistantProf") ||
				rank.equalsIgnoreCase("AssociateProf") ||
				rank.equalsIgnoreCase("Professor")) {
			this.rank = rank;
		} else {
			System.out.println("Faulty: Invalid Rank!");
		}
	}
	public String toString() {
		return "Faculty: " + getName() + " Rank: " + rank + " Office: " + super.getOffice() + "|";
	}
	
	
	

}