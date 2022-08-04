package Assignment_6;

import java.util.ArrayList;

public class CDs extends Catalogue {
	private String title;
	private int isbn;
	private String author;
	int numCD = 0;
	int status = -1;
	
	ArrayList<CDs> infoCD = new ArrayList<CDs>();
	
			
	public CDs(String title, int isbn, String author, int status) {
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
		CDs cd = new CDs(title, isbn, author, status);
		infoCD.add(cd);
		infoCD.get(numCD).setStatus(0);
	}
	
	public void removeMedia(int isbn) {
		for(int i = 0; i < infoCD.size(); i++) {
			if(infoCD.get(i).getIsbn() == isbn) {
				infoCD.get(i).setStatus(-1);
			}
		}
	}
	@Override
	public void showIssueHistory() {
		
	}
	
	public void updateMedia(int isbn) {
		for(int i = 0; i < infoCD.size(); i++) {
			if(infoCD.get(i).getStatus() == -1) {
				infoCD.get(i).setStatus(0);
			}
		}
	}
	
	public String findMediaTitle(String title) {
		for(int i = 0; i < infoCD.size(); i++) {
			if(infoCD.get(i).getTitle() == title) {
				if(infoCD.get(i).getStatus() == 0) {
					return "Title: " + infoCD.get(i).getTitle() + " ISBN: " + infoCD.get(i).getIsbn() + " Author: " + infoCD.get(i).getAuthor() + " Status : Available";
				}else {
					return "Title: " + infoCD.get(i).getTitle() + " ISBN: " + infoCD.get(i).getIsbn() + " Author: " + infoCD.get(i).getAuthor() + "Status : Not Available";
				}
			}
		}
		return "INVALID INPUT";
	}
	public String findMediaIsbn(int isbn) {
		for(int i = 0; i < infoCD.size(); i++) {
			if(infoCD.get(i).getIsbn() == isbn) {
				if(infoCD.get(i).getStatus() == 0) {
					return "Title: " + infoCD.get(i).getTitle() + " ISBN: " + infoCD.get(i).getIsbn() + " Author: " + infoCD.get(i).getAuthor() + " Status : Available";
				}else {
					return "Title: " + infoCD.get(i).getTitle() + " ISBN: " + infoCD.get(i).getIsbn() + " Author: " + infoCD.get(i).getAuthor() + "Status : Not Available";
				}
			}
		}
		return "INVALID INPUT";
	}
	public String findMediaAuthor(String author) {
		for(int i = 0; i < infoCD.size(); i++) {
			if(infoCD.get(i).getAuthor() == author) {
				if(infoCD.get(i).getStatus() == 0) {
					return "Title: " + infoCD.get(i).getTitle() + " ISBN: " + infoCD.get(i).getIsbn() + " Author: " + infoCD.get(i).getAuthor() + " Status : Available";
				}else {
					return "Title: " + infoCD.get(i).getTitle() + " ISBN: " + infoCD.get(i).getIsbn() + " Author: " + infoCD.get(i).getAuthor() + "Status : Not Available";
				}
			}
		}
		return "INVALID INPUT";
	}
	
	public void returnMedia(int isbn) {
		for(int i = 0; i < infoCD.size(); i++) {
			if(infoCD.get(i).getStatus() == 1) {
				infoCD.get(i).setStatus(0);
			}
		}
	}
	public void checkOutMedia(int isbn) {
		for(int i = 0; i < infoCD.size(); i++) {
			if(infoCD.get(i).getStatus() == 0) {
				infoCD.get(i).setStatus(1);
			}
		}
	}
}
