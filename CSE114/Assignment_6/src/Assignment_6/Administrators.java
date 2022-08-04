package Assignment_6;

import java.util.ArrayList;

public class Administrators extends Users{
	String name; 
	int id;
	String campus;
	String email;
	
	public Administrators(String name, int id, String campus, String email) {
		super(name, id, campus, email);
		this.name = name;
		this.id = id;
		this.campus = campus;
		this.email = email;
	}
	int numAdmin = 0;
	ArrayList<Administrators> infoAdmin = new ArrayList<Administrators>();
	Clients cl = new Clients(name, id, campus, email);
	
	public String addAdmin(String name, int id, String campus, String email) {
		Administrators admin = new Administrators(name, id, campus, email);
		infoAdmin.add(admin);
		
		return "You are Successfully added to our LMS. Don't forget that your AccessCode is 1000.";
	}
	
	public boolean logIn(int id) {
		for(int i = 0; i < infoAdmin.size(); i++) {
			if(infoAdmin.get(i).getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	public void sendMessage(int id) {
		cl.messageLate(id);
	}
}
