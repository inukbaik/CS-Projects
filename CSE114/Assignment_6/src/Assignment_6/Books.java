package Assignment_6;

import java.util.ArrayList;

public class Books extends Catalogue {
	private String title;
	private int isbn;
	private String author;
	int numBook = 0;
	int status = -1;
	
	ArrayList<Books> infoBook = new ArrayList<Books>();
	
			
	public Books(String title, int isbn, String author, int status) {
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
		Books book = new Books(title, isbn, author, status);
		infoBook.add(book);
		infoBook.get(numBook).setStatus(0);
	}
	
	public void removeMedia(int isbn) {
		for(int i = 0; i < infoBook.size(); i++) {
			if(infoBook.get(i).getIsbn() == isbn) {
				infoBook.get(i).setStatus(-1);
			}
		}
	}
	@Override
	public void showIssueHistory() {
		
	}
	
	public void updateMedia(int isbn) {
		for(int i = 0; i < infoBook.size(); i++) {
			if(infoBook.get(i).getStatus() == -1) {
				infoBook.get(i).setStatus(0);
			}
		}
	}
	
	public String findMediaTitle(String title) {
		for(int i = 0; i < infoBook.size(); i++) {
			if(infoBook.get(i).getTitle() == title) {
				if(infoBook.get(i).getStatus() == 0) {
					return "Title: " + infoBook.get(i).getTitle() + " ISBN: " + infoBook.get(i).getIsbn() + " Author: " + infoBook.get(i).getAuthor() + " Status : Available";
				}else {
					return "Title: " + infoBook.get(i).getTitle() + " ISBN: " + infoBook.get(i).getIsbn() + " Author: " + infoBook.get(i).getAuthor() + "Status : Not Available";
				}
			}
		}
		return "INVALID INPUT";
	}
	public String findMediaIsbn(int isbn) {
		for(int i = 0; i < infoBook.size(); i++) {
			if(infoBook.get(i).getIsbn() == isbn) {
				if(infoBook.get(i).getStatus() == 0) {
					return "Title: " + infoBook.get(i).getTitle() + " ISBN: " + infoBook.get(i).getIsbn() + " Author: " + infoBook.get(i).getAuthor() + " Status : Available";
				}else {
					return "Title: " + infoBook.get(i).getTitle() + " ISBN: " + infoBook.get(i).getIsbn() + " Author: " + infoBook.get(i).getAuthor() + "Status : Not Available";
				}
			}
		}
		return "INVALID INPUT";
	}
	public String findMediaAuthor(String author) {
		for(int i = 0; i < infoBook.size(); i++) {
			if(infoBook.get(i).getAuthor() == author) {
				if(infoBook.get(i).getStatus() == 0) {
					return "Title: " + infoBook.get(i).getTitle() + " ISBN: " + infoBook.get(i).getIsbn() + " Author: " + infoBook.get(i).getAuthor() + " Status : Available";
				}else {
					return "Title: " + infoBook.get(i).getTitle() + " ISBN: " + infoBook.get(i).getIsbn() + " Author: " + infoBook.get(i).getAuthor() + "Status : Not Available";
				}
			}
		}
		return "INVALID INPUT";
	}
	public void returnMedia(int isbn) {
		for(int i = 0; i < infoBook.size(); i++) {
			if(infoBook.get(i).getStatus() == 1) {
				infoBook.get(i).setStatus(0);
			}
		}
	}
	public void checkOutMedia(int isbn) {
		for(int i = 0; i < infoBook.size(); i++) {
			if(infoBook.get(i).getStatus() == 0) {
				infoBook.get(i).setStatus(1);
			}
		}
	}

}
