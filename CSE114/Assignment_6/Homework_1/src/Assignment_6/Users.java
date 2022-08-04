package Assignment_6;

public class Users {
	
	private String name;
	private int id;
	private String campus;
	private String email;
	
	public Users() {
		name = null;
		id = 0;
		campus = null;
		email = null;
	}
	
	public Users(String name, int id, String campus, String email) {
		this.setName(name);
		this.id = id;
		this.campus = campus;
		this.email = email;
	}

	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getCampus() {
		return campus;
	}
	public String getEmail() {
		return email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
