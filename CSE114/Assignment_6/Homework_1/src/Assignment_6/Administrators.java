package Assignment_6;

public class Administrators extends Users{
	private int accessCode;
	
	public Administrators(String name, int id, String campus, String email, int accessCode) {
		super(name, id, campus, email);
		this.accessCode = accessCode;
	}
	
	public int getAccessCode() {
		return accessCode;
	}
	
	public void setAccessCode(int accessCode) {
		this.accessCode = accessCode;
	}
	
}
