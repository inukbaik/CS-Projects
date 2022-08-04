package Assignment_6;

import java.util.ArrayList;

public class Librarians extends Users{
	
	
	public Librarians(String name, int id, String campus, String email) {
		super(name, id, campus, email);
		
	}
	ArrayList<Librarians> infoLib = new ArrayList<Librarians>();
	int numLib = 0;
	int index = 0;
	String[] wants = new String[index];
	
	
	public String addLib(String name, int id, String campus, String email) {
		Librarians lib = new Librarians(name, id, campus, email);
		infoLib.add(lib);
		
		return "You are Successfully added to our LMS. Don't forget that your AccessCode is 3333.";
	}
	
	public boolean logIn(int id) {
		for(int i = 0; i < infoLib.size(); i++) {
			if(infoLib.get(i).getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	public void addWants(String need) {
		wants[index] = need;
		index++;
	}
	
}
