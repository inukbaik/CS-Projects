package Assignment_6;

import java.util.ArrayList;

public class CDs extends Catalogue {
	private String title;
	private int isbn;
	private String author;
	int index = 0;
	
	ArrayList<CDs[]> infoCD = new ArrayList<CDs[]>();
			
	public CDs(String title, int ISBN, String author) {
		super(title, ISBN, author);
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public int getIBSN() {
		return isbn;
	}
	public String getAuthor() {
		return author;
	}
	
	@Override
	public void addMedia(Object element) {
		// TODO Auto-generated method stub
		infoCD.add(index, (CDs[]) element);
	}
	@Override
	public void removeMedia() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void showIssueHistory() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void status() {
		// TODO Auto-generated method stub
		
	}
}
