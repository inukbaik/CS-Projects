package Assignment_6;

abstract class Catalogue {
	
	private String title;      // Title of the book
	private int isbn;        // Book number  
	private String author;   // Author of the book
	private int status;
	
	public Catalogue(String title, int isbn, String author, int status) {
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.status = status;
	}
	
	public abstract void addMedia(String title, int isbn, String author);
    public abstract void removeMedia(int num);
    public abstract void showIssueHistory();
    public abstract void updateMedia(int isbn);
    public abstract String findMediaTitle(String title);
    public abstract String findMediaIsbn(int isbn);
    public abstract String findMediaAuthor(String author);
    
}