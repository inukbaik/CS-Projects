package Assignment_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Clients extends Users{
	int numCl = 0;
	ArrayList<Clients> infoClients = new ArrayList<Clients>();
	
	public Clients(String name, int id, String campus, String email) {
		super(name, id, campus, email);
	}
	
	
	
	public String addClients(String name, int id, String campus, String email) throws IOException{
		Clients cl = new Clients(name, id, campus, email);
		infoClients.add(cl);
		numCl++;

		File ClientsList = new File("./clientsList.data"); 
		PrintWriter pw = new PrintWriter(ClientsList);
		pw.print(infoClients.get(numCl));
		pw.close();
		
		return "You are Successfully added to our LMS.";
	}
	
	public boolean logIn(int id) {
		for(int i = 0; i < infoClients.size(); i++) {
			if(infoClients.get(i).getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	public String getInfo(int id) {
		for(int i = 0; i < infoClients.size(); i++) {
			if(infoClients.get(i).getId() == id) {
				return infoClients.get(i).getEmail();
			}
		}
		return "No data";
	}
	
	public void messageLate(int id) {
		for(int i = 0; i < infoClients.size(); i++) {
			if(infoClients.get(i).getId() == id) {
				infoClients.get(i).setMessage("You should return the book");
			}
		}
	}
	
	public void messageCheck(int id) {
		for(int i = 0; i < infoClients.size(); i++) {
			if(infoClients.get(i).getId() == id) {
				infoClients.get(i).setMessage(null);
			}
		}
	}
}
