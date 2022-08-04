package Assignment_6;

abstract class Catalogue {
	
	private String title;      // Title of the book
	private int ISBN;        // Book number  
	private String author;   // Author of the book
		
	public Catalogue(String title, int ISBN, String author) {
		this.title = title;
		this.ISBN = ISBN;
		this.author = author;
	}
	
	public abstract void addMedia(Object element);
    public abstract void removeMedia();
    public abstract void showIssueHistory();
    public abstract void status();
    
}