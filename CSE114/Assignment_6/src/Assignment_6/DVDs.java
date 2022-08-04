package Assignment_6;

import java.util.ArrayList;

public class DVDs extends Catalogue{
	private String title;
	private int isbn;
	private String author;
	int numDVD = 0;
	int status = -1;
	
	ArrayList<DVDs> infoDVD = new ArrayList<DVDs>();
	
			
	public DVDs(String title, int isbn, String author, int status) {
		super(title, isbn, author, status);
	}
	public String getTitle() {
		return title;
	}
	public int getIsbn() {
		return isbn;
	}
	public String getAuthor() {
		return author;
	}
	public  int getStatus() {
		return status;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	public void addMedia(String title, int isbn, String author) {
		DVDs dvd = new DVDs(title, isbn, author, status);
		infoDVD.add(dvd);
		infoDVD.get(numDVD).setStatus(0);
	}
	
	public void removeMedia(int isbn) {
		for(int i = 0; i < infoDVD.size(); i++) {
			if(infoDVD.get(i).getIsbn() == isbn) {
				infoDVD.get(i).setStatus(-1);
			}
		}
	}
	@Override
	public void showIssueHistory() {
		
	}
	
	public void updateMedia(int isbn) {
		for(int i = 0; i < infoDVD.size(); i++) {
			if(infoDVD.get(i).getStatus() == -1) {
				infoDVD.get(i).setStatus(0);
			}
		}
	}
	
	public String findMediaTitle(String title) {
		for(int i = 0; i < infoDVD.size(); i++) {
			if(infoDVD.get(i).getTitle() == title) {
				if(infoDVD.get(i).getStatus() == 0) {
					return "Title: " + infoDVD.get(i).getTitle() + " ISBN: " + infoDVD.get(i).getIsbn() + " Author: " + infoDVD.get(i).getAuthor() + " Status : Available";
				}else {
					return "Title: " + infoDVD.get(i).getTitle() + " ISBN: " + infoDVD.get(i).getIsbn() + " Author: " + infoDVD.get(i).getAuthor() + "Status : Not Available";
				}
			}
		}
		return "INVALID INPUT";
	}
	public String findMediaIsbn(int isbn) {
		for(int i = 0; i < infoDVD.size(); i++) {
			if(infoDVD.get(i).getIsbn() == isbn) {
				if(infoDVD.get(i).getStatus() == 0) {
					return "Title: " + infoDVD.get(i).getTitle() + " ISBN: " + infoDVD.get(i).getIsbn() + " Author: " + infoDVD.get(i).getAuthor() + " Status : Available";
				}else {
					return "Title: " + infoDVD.get(i).getTitle() + " ISBN: " + infoDVD.get(i).getIsbn() + " Author: " + infoDVD.get(i).getAuthor() + "Status : Not Available";
				}
			}
		}
		return "INVALID INPUT";
	}
	public String findMediaAuthor(String author) {
		for(int i = 0; i < infoDVD.size(); i++) {
			if(infoDVD.get(i).getAuthor() == author) {
				if(infoDVD.get(i).getStatus() == 0) {
					return "Title: " + infoDVD.get(i).getTitle() + " ISBN: " + infoDVD.get(i).getIsbn() + " Author: " + infoDVD.get(i).getAuthor() + " Status : Available";
				}else {
					return "Title: " + infoDVD.get(i).getTitle() + " ISBN: " + infoDVD.get(i).getIsbn() + " Author: " + infoDVD.get(i).getAuthor() + "Status : Not Available";
				}
			}
		}
		return "INVALID INPUT";
	}
	public void returnMedia(int isbn) {
		for(int i = 0; i < infoDVD.size(); i++) {
			if(infoDVD.get(i).getStatus() == 1) {
				infoDVD.get(i).setStatus(0);
			}
		}
	}
	public void checkOutMedia(int isbn) {
		for(int i = 0; i < infoDVD.size(); i++) {
			if(infoDVD.get(i).getStatus() == 0) {
				infoDVD.get(i).setStatus(1);
			}
		}
	}

}
